SUMMARY = "Qt bindings for GPGME"
HOMEPAGE = "https://www.gnupg.org/software/gpgme/"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

SRC_URI = "${GNUPG_MIRROR}/qgpgme/${BP}.tar.xz"
SRC_URI[sha256sum] = "5b32feb3eee4a7f9402d22b7206480908dc43bb4df382917c075c512116f8f08"

DEPENDS = " \
    qtbase \
    gpgme \
    gpgmepp \
    libgpg-error \
"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_WITH_QT5=OFF -DBUILD_WITH_QT6=ON"
