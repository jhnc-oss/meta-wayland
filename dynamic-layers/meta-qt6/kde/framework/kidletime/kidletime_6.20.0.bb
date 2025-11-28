SUMMARY = "Reporting of idle time of user and system"
HOMEPAGE = "https://invent.kde.org/frameworks/kidletime"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/frameworks/kidletime.git;protocol=https;nobranch=1"
SRCREV = "89beb6fd216884f18c9e8b6dc7a724967ed18908"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	wayland \
	wayland-native \
	plasma-wayland-protocols \
"

inherit qt6-cmake

EXTRA_OECMAKE += "-DHAVE_X11=OFF -DHAVE_WAYLAND=ON"

FILES:${PN} += "${libdir} ${datadir}"
