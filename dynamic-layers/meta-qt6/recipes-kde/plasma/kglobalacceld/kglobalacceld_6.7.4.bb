SUMMARY = "Daemon for globalaccel"
HOMEPAGE = "https://invent.kde.org/plasma/kglobalacceld"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=e3e049b303846e4de3eeafccf035a404"

SRC_URI = "git://invent.kde.org/plasma/kglobalacceld.git;protocol=https;nobranch=1"
SRCREV = "dcec45c0375319f4d128c147a38b6392ce75f2c1"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    kwindowsystem \
    kglobalaccel \
    kservice \
    kio \
    kjobwidgets \
"

inherit kf6

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DWITH_X11=ON,-DWITH_X11=OFF,libxcb xcb-util-keysyms"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${systemd_user_unitdir} ${datadir}"

RDEPENDS:${PN} += "kconfig"
