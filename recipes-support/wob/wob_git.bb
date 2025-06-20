SUMMARY = "A lightweight overlay volume/backlight/progress/anything bar for wlroots based Wayland compositors."
HOMEPAGE = "https://github.com/francma/wob"
SECTION = "Wayland"
LICENSE = "ISC"

LIC_FILES_CHKSUM = "file://LICENSE;md5=07d60638be9414ee4e38ed68e642ba25"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://github.com/francma/wob.git;protocol=https;branch=master \
"

DEPENDS = " \
	libinih \
	wayland \
	wayland-native \
	wayland-protocols \
"

inherit meson pkgconfig features_check manpages

PACKAGECONFIG[seccomp] = "-Dseccomp=enabled,-Dseccomp=disabled,libseccomp"
PACKAGECONFIG[manpages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"

PACKAGECONFIG ??= ""

PV = "0.16"
SRCREV = "f7668d9715256a9d0dd05bc9eba7799d5ab2ce2d"

EXTRA_OEMESON += "--buildtype release"

do_install:append() {
    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        install -d ${D}${systemd_user_unitdir}/sockets.target.wants ${D}${systemd_user_unitdir}/graphical-session.target.wants
        ln -fs ${systemd_user_unitdir}/wob.socket ${D}${systemd_user_unitdir}/sockets.target.wants
        ln -fs ${systemd_user_unitdir}/wob.service ${D}${systemd_user_unitdir}/graphical-session.target.wants
    fi
}

FILES:${PN} += "${systemd_user_unitdir}"
