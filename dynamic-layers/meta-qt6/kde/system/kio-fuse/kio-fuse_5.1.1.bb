SUMMARY = "FUSE interface for KIO"
HOMEPAGE = "https://invent.kde.org/system/kio-fuse"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-3.0-or-later.txt;md5=f27defe1e96c2e1ecd4e0c9be8967949"

SRC_URI = "git://invent.kde.org/system/kio-fuse.git;protocol=https;nobranch=1"
SRCREV = "6b06dd4c9989d45abbfca093a03694281eb7b2a7"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    kio \
    fuse3 \
"

inherit qt6-cmake pkgconfig

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${libdir} ${datadir}"
