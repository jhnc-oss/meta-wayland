SUMMARY = "Additional KIO workers for file, network and thumbnail access"
HOMEPAGE = "https://invent.kde.org/network/kio-extras"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/network/kio-extras.git;protocol=https;nobranch=1"
SRCREV = "4a8ffec0ccacb5eefce743c95f57509f862c9d23"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtsvg \
    extra-cmake-modules \
    gperf-native \
    karchive \
    kconfig \
    kconfig-native \
    kcmutils-tools-native \
    kcoreaddons \
    ki18n \
    kio \
    solid \
    syntax-highlighting \
    kcmutils \
    kdbusaddons \
    knotifications \
    plasma-activities \
    plasma-activities-stats \
    qcoro \
    libproxy \
    shared-mime-info \
    libmtp \
    libssh \
    taglib \
    libtirpc \
"

inherit qt6-cmake gettext pkgconfig mime

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DWITHOUT_X11=OFF,-DWITHOUT_X11=ON,libx11 libxcursor"

EXTRA_OECMAKE += " \
    -DBUILD_TESTING=OFF \
    -DBUILD_DOC=OFF \
    -DCMAKE_DISABLE_FIND_PACKAGE_Samba=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_KExiv2Qt6=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_OpenEXR=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_IMobileDevice=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_PList=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_libappimage=ON \
"

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_BINDIR}/kpackagetool6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kcmdesktopfilegenerator ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${libdir}/plugins ${libdir}/libexec ${datadir}"

RDEPENDS:${PN} += "kconfig perl"
