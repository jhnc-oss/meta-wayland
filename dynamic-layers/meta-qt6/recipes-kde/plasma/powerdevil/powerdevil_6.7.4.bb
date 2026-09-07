SUMMARY = "Power management daemon, KCM and applets for Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/powerdevil"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/powerdevil.git;protocol=https;nobranch=1"
SRCREV = "7c97bbcd0e90ccb43eca1debd36191fc97f9f987"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    qtwayland \
    extra-cmake-modules \
    kauth \
    kconfig \
    kcrash \
    kdbusaddons \
    ki18n \
    kidletime \
    kitemmodels \
    kglobalaccel \
    kio \
    kirigami \
    kcmutils \
    knotifications \
    krunner \
    solid \
    kwindowsystem \
    kxmlgui \
    libplasma \
    plasma-activities \
    libkscreen \
    plasma-workspace \
    qcoro \
    udev \
    libxcb \
    plasma-wayland-protocols \
    wayland \
    wayland-native \
"

inherit kf6 gettext pkgconfig

PACKAGECONFIG ?= "ddcutil"
PACKAGECONFIG[ddcutil] = ",-DCMAKE_DISABLE_FIND_PACKAGE_DDCUtil=ON,ddcutil"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DCMAKE_DISABLE_FIND_PACKAGE_KF6DocTools=ON"

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig kpackage"
RRECOMMENDS:${PN} += "upower power-profiles-daemon"

INSANE_SKIP:${PN} = "dev-so"
