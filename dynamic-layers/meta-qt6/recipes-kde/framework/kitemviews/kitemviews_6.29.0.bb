SUMMARY = "Set of item views extending the Qt model-view framework"
HOMEPAGE = "https://invent.kde.org/frameworks/kitemviews"
LICENSE = "CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

SRC_URI = "git://invent.kde.org/frameworks/kitemviews.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "281c6fb784173a5957568534f2f1950e81fedac2"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${datadir}/qlogging-categories6"
