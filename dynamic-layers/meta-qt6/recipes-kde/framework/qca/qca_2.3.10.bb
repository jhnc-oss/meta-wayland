SUMMARY = "Qt Cryptographic Architecture (QCA)"
HOMEPAGE = "https://invent.kde.org/libraries/qca"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

SRC_URI = "git://invent.kde.org/libraries/qca.git;protocol=https;nobranch=1"
SRCREV = "df5171e3c4baf346581f15af5a040e61b166a332"

DEPENDS = " \
	qtbase \
	qttools-native \
	qt5compat \
	extra-cmake-modules \
	libgcrypt \
	cyrus-sasl \
	openssl \
	pkcs11-helper \
	nss \
	botan \
"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE += " \
    -DQT_MAJOR_VERSION=6 \
    -DBUILD_WITH_QT6=ON \
    -DQCA_FEATURE_INSTALL_DIR=${libdir}${QT_DIR_NAME}/mkspecs/features \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
    -DOE_KF6_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
    -DCMAKE_SYSROOT=${RECIPE_SYSROOT} \
"

do_compile:prepend() {
    export XDG_DATA_DIRS=${STAGING_DATADIR}:$XDG_DATA_DIRS
    export LD_LIBRARY_PATH=${STAGING_LIBDIR_NATIVE}:$LD_LIBRARY_PATH
}

do_install:prepend() {
    if [ "0" -ne $(find . -name \*.cmake | grep '_usr\|Export' | wc -l) ]; then
        sed -i 's/\"\/usr\//\"\$\{OE_KF6_PATH_HOST_ROOT\}\/usr\//g' $(find . -name "*.cmake" | grep '_usr\|Export')
        sed -i 's/\;\/usr\//\;\$\{OE_KF6_PATH_HOST_ROOT\}\/usr\//g' $(find . -name "*.cmake" | grep '_usr\|Export')
    fi
}

FILES:${PN} += "${libdir}/qca-qt6"
