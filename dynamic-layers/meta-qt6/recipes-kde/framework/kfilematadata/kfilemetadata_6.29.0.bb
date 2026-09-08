SUMMARY = "KFileMetaData is a library for extracting metadata from files"
HOMEPAGE = "https://invent.kde.org/frameworks/kfilemetadata"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/frameworks/kfilemetadata.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "a97dc3dc422a378a2df521c1de7ffb4c112cc082"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	karchive \
	kcoreaddons \
	kconfig \
	kcodecs \
	ki18n \
	poppler \
	taglib \
	exiv2 \
	attr \
	${@bb.utils.contains('LICENSE_FLAGS_ACCEPTED', 'commercial', 'ffmpeg', '', d)} \
"

inherit kf6 pkgconfig gettext

FILES:${PN} += "${libdir}/plugins ${datadir}/qlogging-categories6"
