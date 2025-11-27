SUMMARY = "Modern text editor built on the KDE Frameworks and Qt"
HOMEPAGE = "https://invent.kde.org/utilities/kate"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/utilities/kate.git;protocol=https;nobranch=1"
SRCREV = "411fcb20e4dcefddcad6de1181bd77dc9d05acfb"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    kguiaddons \
    ki18n \
    ktexteditor \
    kcrash \
    kiconthemes \
"

inherit qt6-cmake gettext mime mime-xdg

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "bash kconfig"
