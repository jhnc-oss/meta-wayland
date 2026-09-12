SUMMARY = "Python bindings for the Qt 6 application framework"
HOMEPAGE = "https://www.riverbankcomputing.com/software/pyqt/"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = " \
    python3 \
    python3-pyqt-builder-native \
    sip-native \
    qtbase \
    qtscxml \
    qtsvg \
"

PYPI_PACKAGE = "pyqt6"

SRC_URI += "file://0001-QtCore-drop-QEvent-EnterEditFocus-LeaveEditFocus.patch"

SRC_URI[sha256sum] = "45dd60aa69976de1918b5ced6b4e7b6a25abd2a919ecef5fd5826ecc76718889"

inherit pypi python3-dir python3targetconfig qt6-qmake

PYQT6_DISABLE ?= " \
    QAxContainer \
    QtBluetooth \
    QtDBus \
    QtDesigner \
    QtHelp \
    QtMultimedia \
    QtMultimediaWidgets \
    QtNetwork \
    QtNfc \
    QtOpenGL \
    QtOpenGLWidgets \
    QtPdf \
    QtPdfWidgets \
    QtPositioning \
    QtPrintSupport \
    QtQml \
    QtQuick \
    QtQuick3D \
    QtQuickWidgets \
    QtRemoteObjects \
    QtSensors \
    QtSerialPort \
    QtSpatialAudio \
    QtSql \
    QtSvgWidgets \
    QtTextToSpeech \
    QtWebChannel \
    QtWebSockets \
    QtXml \
"

PYQT6_DISABLED_FEATURES ?= " \
    PyQt_Permissions \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', bb.utils.contains('DISTRO_FEATURES', 'wayland', '', bb.utils.contains('DISTRO_FEATURES', 'x11', 'PyQt_OpenGL_ES2', '', d), d), 'PyQt_OpenGL PyQt_OpenGL_ES2', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', '', 'PyQt_Vulkan', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '', 'PyQt_Wayland', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', 'PyQt_XCB', d)} \
"

do_configure() {
    rm -f ${S}/config-tests/cfgtest_*.cpp

    sipargs=""
    for module in ${PYQT6_DISABLE}; do
        sipargs="$sipargs --disable $module"
    done
    for feature in ${PYQT6_DISABLED_FEATURES}; do
        sipargs="$sipargs --disabled-feature $feature"
    done

    cd ${S}
    sip-build \
        --verbose \
        --no-make \
        --confirm-license \
        --qt-shared \
        --no-designer-plugin \
        --no-qml-plugin \
        --no-dbus-python \
        --no-tools \
        --qmake ${OE_QMAKE_QMAKE} \
        --build-dir ${B} \
        --target-dir ${PYTHON_SITEPACKAGES_DIR} \
        $sipargs
}

do_configure:append() {
    find ${B} \( -name Makefile -o -name "*.pro" \) -exec \
        sed -i -e "s|/usr/include/${PYTHON_DIR}|${STAGING_INCDIR}/${PYTHON_DIR}|g" {} +

    find ${B} \( -name "*.cpp" -o -name "*.h" \) -exec \
        sed -i -e "s|${S}|${TARGET_DBGSRC_DIR}|g" -e "s|${B}|${TARGET_DBGSRC_DIR}|g" {} +
}

FILES:${PN} += "${PYTHON_SITEPACKAGES_DIR}"

RDEPENDS:${PN} += " \
    python3-core \
    python3-pyqt6-sip \
"
