SUMMARY = "Budgie Desktop Services is the future central hub and orchestrator for Budgie Desktop"
HOMEPAGE = "https://github.com/BuddiesOfBudgie/budgie-desktop-services"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=f75d2927d3c1ed2414ef72048f5ad640"

SRC_URI = "git://github.com/BuddiesOfBudgie/budgie-desktop-services.git;protocol=https;nobranch=1"
SRCREV = "a10c05f21c792d2abd50a302539fc5f158c0f3f7"

DEPENDS += "extra-cmake-modules qtbase qttools-native wayland wayland-native wayland-protocols kwayland libtoml11"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE = "-DCMAKE_CXX_STANDARD_REQUIRED=OFF"

PACKAGECONFIG ?= "desktopfile servicefile labwc"
PACKAGECONFIG[desktopfile] = "-DINSTALL_DESKTOP_FILE=ON,-DINSTALL_DESKTOP_FILE=OFF"
PACKAGECONFIG[servicefile] = "-DINSTALL_SERVICE_FILE=ON,-DINSTALL_SERVICE_FILES=OFF"
PACKAGECONFIG[labwc] = "-DINSTALL_LABWC=ON,-DINSTALL_LABWC=OFF"

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} = "kwayland"
