SUMMARY = "Plasma for the desktop form factor"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-desktop"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/plasma-desktop.git;protocol=https;nobranch=1"
SRCREV = "3acd82b20e4135a37dc51228573da19b840ac72c"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtquick3d \
    extra-cmake-modules \
    qt5compat \
    qtshadertools \
    qtsvg \
    kauth \
    kcrash \
    kconfig \
    ki18n \
    kcmutils \
    knewstuff \
    kio \
    knotifications \
    knotifyconfig \
    attica \
    krunner \
    kglobalaccel \
    kcoreaddons \
    kguiaddons \
    kdbusaddons \
    kwidgetsaddons \
    kcodecs \
    sonnet \
    kpackage \
    kiconthemes \
    kxmlgui \
    ksvg \
    plasma \
    plasma-activities \
    kirigami \
    libcanberra \
    wayland \
    wayland-native \
    wayland-protocols \
    libwacom \
    virtual/libsdl2 \
"

inherit qt6-cmake gettext pkgconfig

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kcmdesktopfilegenerator
	touch ${STAGING_BINDIR}/kpackagetool6
}

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig"
