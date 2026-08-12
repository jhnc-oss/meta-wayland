SUMMARY = "a set of convenient classes to use PipeWire in Qt projects"
HOMEPAGE = "https://invent.kde.org/plasma/kpipewire"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=41890f71f740302b785c27661123bff5"

SRC_URI = "git://invent.kde.org/plasma/kpipewire.git;protocol=https;nobranch=1"
SRCREV = "e1c0f1ce0b41eea83d5b4fa32db1ac3a56f8e1b4"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    ki18n \
    kcoreaddons \
    ffmpeg \
    pipewire \
    libva \
    libepoxy \
    libdrm \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

inherit qt6-cmake pkgconfig gettext

do_install:append() {
	sed -i -e 's|${STAGING_DIR_HOST}||' ${D}${libdir}/cmake/KPipeWire/KPipeWireTargets.cmake
	sed -i -e 's|\;${STAGING_DIR_HOST}|\;|' ${D}${libdir}/cmake/KPipeWire/KPipeWireTargets.cmake
}

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"
