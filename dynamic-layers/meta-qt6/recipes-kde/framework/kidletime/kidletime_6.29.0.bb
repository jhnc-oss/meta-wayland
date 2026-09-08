SUMMARY = "Reporting of idle time of user and system"
HOMEPAGE = "https://invent.kde.org/frameworks/kidletime"
LICENSE = "CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.1-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/frameworks/kidletime.git;protocol=https;nobranch=1"
SRCREV = "be63c6705920f08c41052db65c2a814e47f9ee0d"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	wayland \
	wayland-native \
	plasma-wayland-protocols \
"

inherit qt6-cmake

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DWITH_X11=ON,-DWITH_X11=OFF,libx11 libxcb libxext libxscrnsaver"

EXTRA_OECMAKE += "-DHAVE_WAYLAND=ON"

FILES:${PN} += "${libdir} ${datadir}"
