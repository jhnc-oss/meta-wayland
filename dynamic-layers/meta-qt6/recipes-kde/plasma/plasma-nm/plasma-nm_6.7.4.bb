SUMMARY = "Plasma applet and KCM for managing network connections through NetworkManager"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-nm"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/plasma-nm.git;protocol=https;nobranch=1"
SRCREV = "b6c03fe24b30d2a963a41dd83784e36086d7257e"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kconfig-native \
    kcmutils-tools-native \
    kcolorscheme \
    kcompletion \
    kcoreaddons \
    kdbusaddons \
    kio \
    ki18n \
    kjobwidgets \
    networkmanager-qt \
    modemmanager-qt \
    knotifications \
    kservice \
    solid \
    kwidgetsaddons \
    kwindowsystem \
    kcmutils \
    ksvg \
    kirigami \
    kirigami-addons \
    prison \
    kquickcharts \
    libplasma \
    qtkeychain \
    qcoro \
    openssl \
    networkmanager \
"

inherit qt6-cmake gettext pkgconfig mime-xdg

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_OPENCONNECT=OFF"

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_BINDIR}/kpackagetool6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kcmdesktopfilegenerator ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${libdir}/libplasmanm_*.so ${datadir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

RDEPENDS:${PN} += "kconfig kpackage kirigami-addons kquickcharts networkmanager"

INSANE_SKIP:${PN} = "dev-so"
