SUMMARY = "Utility that provides information about the computer system"
HOMEPAGE = "https://invent.kde.org/plasma/kinfocenter"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/kinfocenter.git;protocol=https;nobranch=1"
SRCREV = "a8ca8be109399581b31465c8ce3d74fd0ef7cf8d"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    ki18n \
    kcmutils \
    kio \
    kservice \
    solid \
    kauth \
    libdrm \
    udev \
    libusb1 \
    systemsettings \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_DOC=OFF"

do_configure:append() {
	sed -i "s|${STAGING_BINDIR_NATIVE}/qdbus|${bindir}/qdbus|" ${B}/kcms/kwinsupportinfo/kcm_kwinsupportinfo.json
}

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${libdir}/libKInfoCenterInternal.so ${datadir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

RDEPENDS:${PN} += "kconfig systemsettings"
RRECOMMENDS:${PN} += "pciutils util-linux-lsblk libdisplay-info vulkan-tools wayland-utils qttools-tools"

INSANE_SKIP:${PN} = "dev-so"
