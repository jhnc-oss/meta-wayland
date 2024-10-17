SUMMARY = "PolicyKit Qt wrapper"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & BSD-3-Clause"
LIC_FILES_CHKSUM = " \
	file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
	file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
	file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
"

inherit qt6-cmake pkgconfig

DEPENDS += "qtbase polkit glib-2.0"

SRC_URI = "https://download.kde.org/stable/${BPN}-1/${BPN}-1-${PV}.tar.xz"
SRC_URI[sha256sum] = "5d3b611c062d2b76a93750bb10c907bfd21d1ff08d0a15dc2cf63e278e1677fb"
S = "${UNPACKDIR}/${BPN}-1-${PV}"
PV = "0.200.0"

EXTRA_OECMAKE = "-DQT_MAJOR_VERSION=6"
