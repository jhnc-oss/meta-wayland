SUMMARY = "KFileMetaData is a library for extracting metadata from files"
HOMEPAGE = "https://invent.kde.org/frameworks/kfilemetadata"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kfilemetadata.git;protocol=https;nobranch=1"
SRCREV = "27e68b2b7237ed855a36a12d8b1e23021ee2d6d6"

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

inherit qt6-cmake pkgconfig gettext

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${libdir}/plugins ${datadir}/qlogging-categories6"
