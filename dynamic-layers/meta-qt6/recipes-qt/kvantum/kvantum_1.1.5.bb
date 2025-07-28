SUMMARY = "Kvantum (by Pedram Pourang, a.k.a. Tsu Jan) is an SVG-based theme engine for Qt"
HOMEPAGE = "https://github.com/tsujan/Kvantum"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

DEPENDS = "qtbase qtsvg qttools kwindowsystem libx11 libxext"

inherit qt6-cmake

SRC_URI = "git://github.com/tsujan/Kvantum.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-style-CMakeLists.txt-set-KVANTUM_STYLES_DIR.patch"
SRCREV = "8acc24e13ffea00e7b4b50abc0fdf81b59757465"

S = "${UNPACKDIR}/${BB_GIT_DEFAULT_DESTSUFFIX}/Kvantum"

EXTRA_OECMAKE = "-DCMAKE_INSTALL_PREFIX_INITIALIZED_TO_DEFAULT=OFF"

FILES:${PN} += "${datadir} ${libdir}"
RDEPENDS:${PN} = "qt6ct"
