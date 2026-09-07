SUMMARY = "KFileMetaData is a library for extracting metadata from files"
HOMEPAGE = "https://invent.kde.org/frameworks/kfilemetadata"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kfilemetadata.git;protocol=https;nobranch=1"
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
