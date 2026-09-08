SUMMARY = "KWallet secrets storage extension for signond"
HOMEPAGE = "https://invent.kde.org/network/signon-kwallet-extension"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

SRC_URI = "git://invent.kde.org/network/signon-kwallet-extension.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "455956dcfd76bce2208c7c8142f2f2fee4b3d501"

DEPENDS = " \
    qtbase \
    extra-cmake-modules \
    kwallet \
    signond \
"

inherit kf6 pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/signon"

RDEPENDS:${PN} += "signond"
