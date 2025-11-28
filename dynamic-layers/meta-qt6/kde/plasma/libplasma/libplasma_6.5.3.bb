SUMMARY = "Foundational libraries, components, and tools of the Plasma workspaces"
HOMEPAGE = "https://invent.kde.org/plasma/libplasma"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/libplasma.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-fix-compile-if-kwindowsystem-was-built-without-x11.patch"
SRCREV = "01e07729b194f6a831c048cd6485569cd2176c9f"

DEPENDS = " \
    qtbase \
    qttools-native \
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

inherit qt6-cmake gettext

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_BINDIR}/kpackagetool6
}

EXTRA_OECMAKE += "-DWITHOUT_X11=ON -DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig kpackage"
