SUMMARY = "Wayfire Config Manager"
HOMEPAGE = "https://github.com/WayfireWM/wcm"
BUGTRACKER = "https://github.com/WayfireWM/wcm/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=553c79c4d7ca30085e1d7bfea724a8aa"
DEPENDS = " \
	wayfire-0.10 \
	wayland \
	wayland-native \
	wayland-protocols \
	gtkmm3 \
	wf-shell-0.10 \
"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "gitsm://github.com/WayfireWM/wcm.git;protocol=https;nobranch=1"
SRCREV = "dfb017fbcfb804c15b90ad7f1366aba5799df2ee"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${prefix}"

BBCLASSEXTEND = ""

