SUMMARY = "C++ bindings for GPGME"
HOMEPAGE = "https://www.gnupg.org/software/gpgme/"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=bbb461211a33b134d42ed5ee802b37ff"

SRC_URI = "${GNUPG_MIRROR}/gpgmepp/${BP}.tar.xz"
SRC_URI[sha256sum] = "57f804468f0204504b172c6b139cb05124b4263be7ad514932c7c4c5062a16e2"

DEPENDS = " \
    gpgme \
    libgpg-error \
"

inherit cmake pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
