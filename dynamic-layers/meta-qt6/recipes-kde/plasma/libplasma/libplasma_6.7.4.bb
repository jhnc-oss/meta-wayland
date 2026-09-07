SUMMARY = "Foundational libraries, components, and tools of the Plasma workspaces"
HOMEPAGE = "https://invent.kde.org/plasma/libplasma"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/libplasma.git;protocol=https;nobranch=1"
SRCREV = "b1e346733ff527433e1849eb85305580d10e712a"

DEPENDS = " \
    qtbase \
    qttools-native \
    qt5compat \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    kglobalaccel \
    kguiaddons \
    ki18n \
    kiconthemes \
    kio \
    kwindowsystem \
    knotifications \
    kpackage \
    kirigami \
    ksvg \
    kcolorscheme  \
    plasma-activities \
    plasma-wayland-protocols \
    wayland \
    wayland-native \
"

inherit kf6 gettext

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DWITHOUT_X11=OFF,-DWITHOUT_X11=ON,libx11 libxcb libxrender"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig kpackage"
