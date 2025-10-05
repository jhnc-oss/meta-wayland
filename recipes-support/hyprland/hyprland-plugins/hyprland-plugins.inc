SRC_URI = "git://github.com/hyprwm/hyprland-plugins.git;protocol=https;branch=main"
SRCREV = "4d940a10aff16b240533c9b6527a14ff91e5e5ae"

DEPENDS += " \
    pixman \
    libdrm \
    hyprland \
    libinput \
    udev \
    pango \
    cairo \
    wayland-native \
    libxkbcommon \
"

inherit cmake pkgconfig

# Hack to allow patching the plugins
do_configure:prepend() {
	rm -rf ${S}/patches
	rm -rf ${S}/.pc
}

FILES:${PN}-dev = ""
