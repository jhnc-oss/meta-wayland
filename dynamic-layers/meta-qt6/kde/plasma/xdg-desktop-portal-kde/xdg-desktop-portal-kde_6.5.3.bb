SUMMARY = "A backend implementation for xdg-desktop-portal that is using Qt/KF"
HOMEPAGE = "https://invent.kde.org/plasma/xdg-desktop-portal-kde"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/xdg-desktop-portal-kde.git;protocol=https;nobranch=1"
SRCREV = "e1e45328575ad70fb21609d3768c084e61edfe29"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kcoreaddons \
    kconfig \
    ki18n \
    kguiaddons \
    kglobalaccel \
    kio \
    kio-fuse \
    kirigami \
    knotifications \
    kservice \
    kwidgetaddons \
    kwindowsystem \
    kiconthemes \
    kstatusnotifieritem \
    kcrash \
    kwayland \
    wayland \
    wayland-native \
    wayland-protocols \
    plasma-wayland-protocols \
    libxkbcommon \
"

inherit qt6-cmake gettext

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${libdir}/qml  ${libdir}/plugins ${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig xdg-desktop-portal"
