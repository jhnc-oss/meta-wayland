SUMMARY = "Execute actions as privileged user"
HOMEPAGE = "https://invent.kde.org/frameworks/kauth"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kauth.git;protocol=https;nobranch=1"
SRCREV = "21b4717025c72f3d6ba469bc21a051e485da1cc5"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
"

inherit qt6-cmake

do_configure:prepend() {
	mkdir -p ${STAGING_DIR_HOST}${prefix}/metatypes
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6coreaddons_metatypes.json
}

FILES:${PN} += "${libdir}/plugins ${datadir}"

