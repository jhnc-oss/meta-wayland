SUMMARY = "This is a style for Qt Quick Controls which uses the application's QStyle"
HOMEPAGE = "https://invent.kde.org/frameworks/qqc2-desktop-style"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/frameworks/qqc2-desktop-style.git;protocol=https;nobranch=1"
SRCREV = "ecf91ced8462b2939a37786a8ad5880d2709711f"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kiconthemes \
	kcolorscheme \
    kirigami \
"

inherit qt6-cmake

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
    mkdir -p ${STAGING_LIBEXECDIR}/kf6
    touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
    touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${libdir}/qml ${libdir}/plugins"

RDEPENDS:${PN} = "kconfig"
