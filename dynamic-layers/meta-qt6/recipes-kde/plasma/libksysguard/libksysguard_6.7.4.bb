SUMMARY = "Libraries for process and sensor monitoring used by Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/libksysguard"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=3d26203303a722dedc6bf909d95ba815"

SRC_URI = "git://invent.kde.org/plasma/libksysguard.git;protocol=https;nobranch=1"
SRCREV = "306571d991e399b651bd09bf5c85f086bf59cfa4"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kconfig \
    kconfig-native \
    kcoreaddons \
    ki18n \
    kauth \
    kservice \
    kpackage \
    knewstuff \
    solid \
    libdrm \
    libcap \
    libnl \
    lmsensors \
    udev \
    zlib \
"

inherit qt6-cmake gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DCMAKE_DISABLE_FIND_PACKAGE_libpcap=ON"

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_BINDIR}/kpackagetool6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
}

do_install:append() {
	sed -i "s|;${STAGING_INCDIR}\"|\"|; s|${STAGING_LIBDIR}/libsensors.so|sensors|" ${D}${libdir}/cmake/KSysGuard/KSysGuardLibraryTargets.cmake
}

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${libdir}/libexec ${datadir}"

RDEPENDS:${PN} += "kconfig kpackage"
