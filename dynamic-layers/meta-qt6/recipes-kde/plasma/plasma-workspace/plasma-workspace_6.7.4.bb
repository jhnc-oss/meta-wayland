SUMMARY = "Plasma Workspace is used as the base for Plasma Desktop, Mobile, and Bigscreen"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-workspace"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LGPL-3.0-or-later AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/LGPL-3.0-or-later.txt;md5=7b8fde44990707e743d3613054065137 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT.txt;md5=4dd71a82d66fd9e3ca0cc65b8be370c0 \
"

SRC_URI = "git://invent.kde.org/plasma/plasma-workspace.git;protocol=https;nobranch=1;tag=v6.7.4"
SRC_URI += "file://0001-CMakeLists.txt-make-ksysguard-optional.patch"
SRCREV = "fd05f4c88ab093aee23ce137bf6f2412437c9bba"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    flatpak \
    pipewire \
    baloo \
    karchive \
    kauth \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    kwindowsystem \
    kdeclarative \
    kglobalaccel \
    kguiaddons \
    kholidays \
    ki18n \
    kiconthemes \
    kidletime \
    kitemmodels \
    kcmutils \
    kded \
    kio \
    knewstuff \
    knotifications \
    kconfig \
    kpackage \
    kparts \
    prison \
    krunner \
    kstatusnotifieritem \
    ksvg \
    ktexteditor \
    ktextwidgets \
    kwallet \
    kcolorscheme \
    plasma-activities \
    plasma-activities-stats \
    libplasma \
    kuserfeedback \
    kwayland \
    kwin \
    kirigami \
    networkmanager-qt \
    kquickcharts \
    libqalculate \
    systemd \
    libcanberra \
    breeze \
    zlib \
    freetype \
    fontconfig \
    plasma-wayland-protocols \
    wayland \
    wayland-native \
    icu \
    polkit-qt \
    kio-fuse \
    knighttime \
    kscreenlocker \
    qtquick3d \
    qcoro \
    kscreen \
    layer-shell-qt \
"

inherit kf6 gettext pkgconfig mime-xdg

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DWITH_X11=ON,-DWITH_X11=OFF,libx11 libxcb libice libsm libxau libxcursor libxfixes libxft libxrender libxtst xcb-util xcb-util-cursor xcb-util-image"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DWITH_X11_SESSION=OFF -DINSTALL_SDDM_WAYLAND_SESSION=ON"

do_install:append() {
        sed -i 's:${STAGING_DIR_NATIVE}::' ${D}${systemd_user_unitdir}/plasma-restoresession.service
        sed -i 's:${STAGING_DIR_NATIVE}::' ${D}${systemd_user_unitdir}/plasma-kcminit-phase1.service
        sed -i 's:${STAGING_DIR_NATIVE}::' ${D}${datadir}/kconf_update/migrate-calendar-to-plugin-id.py
}

FILES:${PN} += " ${datadir} ${libdir} ${nonarch_libdir}/sddm"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake "
RDEPENDS:${PN} += "kconfig kactivitymanagerd kquickcharts"

INSANE_SKIP:${PN} = "dev-so dev-deps"
