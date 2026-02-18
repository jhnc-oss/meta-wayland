SUMMARY = "KWayland is a Qt-style API to interact with the wayland-client API"
HOMEPAGE = "https://invent.kde.org/plasma/kwayland"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/plasma/kwayland.git;protocol=https;nobranch=1"
SRCREV = "481793d84380dc8f6fcb7e4193be5ce1688f7c94"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    wayland \
    wayland-native \
    wayland-protocols \
    plasma-wayland-protocols \
    virtual/egl \
"

inherit qt6-cmake

FILES:${PN} += "${datadir}/qlogging-categories6"
