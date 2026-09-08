SUMMARY = "a set of convenient classes to use PipeWire in Qt projects"
HOMEPAGE = "https://invent.kde.org/plasma/kpipewire"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND LGPL-2.1-only AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=71f739ef75581cae312e8c711bcdab16 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.1-only.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/LGPL-3.0-only.txt;md5=852ecadc0ac7e6f4d7144d5544a3815b \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

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
