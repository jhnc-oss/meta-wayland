SUMMARY = "Tools based on KDE Frameworks to better interact with the system"
HOMEPAGE = "https://invent.kde.org/plasma/kde-cli-tools"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/kde-cli-tools.git;protocol=https;nobranch=1"
SRCREV = "27ddf92e73f8b13168f2f0b6da131801ec179cd7"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtsvg \
    extra-cmake-modules \
    kconfig \
    kconfig-native \
    kcmutils-tools-native \
    kiconthemes \
    ki18n \
    kcmutils \
    kio \
    kservice \
    kwindowsystem \
    kparts \
    kcoreaddons \
    kdesu \
    kwidgetsaddons \
"

inherit qt6-cmake gettext mime-xdg

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_DOC=OFF -DWITH_X11=OFF"

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kcmdesktopfilegenerator ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig"
