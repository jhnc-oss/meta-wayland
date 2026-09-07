SUMMARY = "Image viewer for KDE"
HOMEPAGE = "https://invent.kde.org/graphics/gwenview"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b"

SRC_URI = "git://invent.kde.org/graphics/gwenview.git;protocol=https;nobranch=1"
SRCREV = "e8c78de6d06b17c5f4db41caf4aa3060334cdb8f"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtsvg \
    qtmultimedia \
    qtwayland \
    wayland \
    wayland-native \
    wayland-protocols \
    extra-cmake-modules \
    kconfig \
    kconfig-native \
    kio \
    kitemmodels \
    ki18n \
    kparts \
    kwindowsystem \
    kiconthemes \
    knotifications \
    kguiaddons \
    kwidgetsaddons \
    kcrash \
    purpose \
    jpeg \
    lcms \
    exiv2 \
    libpng \
    tiff \
"

inherit qt6-cmake gettext mime-xdg

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DWITHOUT_X11=OFF,-DWITHOUT_X11=ON,libx11"

EXTRA_OECMAKE += " \
    -DBUILD_TESTING=OFF \
    -DGWENVIEW_IMAGEANNOTATOR=OFF \
    -DCMAKE_DISABLE_FIND_PACKAGE_KF6Baloo=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_KF6DocTools=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_PlasmaActivities=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_KDcrawQt6=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_CFitsio=ON \
"

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${libdir}/plugins ${datadir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

RDEPENDS:${PN} += "kconfig kimageformats"

INSANE_SKIP:${PN} = "dev-so"
