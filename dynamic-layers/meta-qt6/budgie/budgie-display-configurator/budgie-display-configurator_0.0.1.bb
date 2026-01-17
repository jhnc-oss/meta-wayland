SUMMARY = "Graphical display configuration tool for Budgie Desktop 10.10"
HOMEPAGE = "https://github.com/BuddiesOfBudgie/budgie-display-configurator"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=48a3fe23ed1353e0995dadfda05ffdb6"

SRC_URI = "git://github.com/BuddiesOfBudgie/budgie-display-configurator.git;protocol=https;nobranch=1"
SRCREV = "f93587697a80ad566e4af74afbee45a8f3ef1460"

DEPENDS += "extra-cmake-modules qtbase qttools-native kconfig kcolorscheme kirigami kcoreaddons ki18n qqc2-desktop-style"

inherit qt6-cmake gettext

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
    mkdir -p ${STAGING_LIBEXECDIR}/kf6
    touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
    touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}


FILES:${PN} += "${datadir}"

RDEPENDS:${PN} = "kconfig"
