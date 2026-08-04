SUMMARY = "Plasma for the desktop form factor"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-desktop"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/plasma-desktop.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-CMakeLists.txt-make-ksysguard-optional.patch"
SRCREV = "e42363ebc7c83489f8a6536265377f646794eac8"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtquick3d \
    extra-cmake-modules \
    qt5compat \
    qtshadertools \
    qtsvg \
    kauth \
    kcrash \
    kconfig \
    kconfig-native \
    ki18n \
    kcmutils \
    kcmutils-tools-native \
    knewstuff \
    kio \
    knotifications \
    knotifyconfig \
    attica \
    krunner \
    kglobalaccel \
    kcoreaddons \
    kguiaddons \
    kdbusaddons \
    kdoctools \
    kdoctools-native \
    kwidgetsaddons \
    kcodecs \
    sonnet \
    kpackage \
    kiconthemes \
    kxmlgui \
    ksvg \
    libplasma \
    plasma-activities \
    plasma-activities-stats \
    plasma5-support \
    plasma-workspace \
    kirigami \
    libcanberra \
    wayland \
    wayland-native \
    wayland-protocols \
    libwacom \
    virtual/libsdl2 \
    xdg-user-dirs \
    systemsettings \
"

inherit qt6-cmake gettext pkgconfig

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF -DBUILD_DOC=OFF -DBUILD_KCM_MOUSE_X11=OFF -DBUILD_KCM_TOUCHPAD_X11=OFF"

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_BINDIR}/kpackagetool6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kcmdesktopfilegenerator ${STAGING_LIBEXECDIR}/kf6
	ln -sf ${STAGING_BINDIR_NATIVE}/meinproc6 ${STAGING_BINDIR}
	ln -sf ${STAGING_BINDIR_NATIVE}/checkXML6 ${STAGING_BINDIR}
}

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig kwin"

INSANE_SKIP:${PN} = "dev-so"
