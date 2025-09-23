SRC_URI = "git://github.com/hyprwm/hyprland-plugins.git;protocol=https;branch=main"
SRCREV = "1cfcc6fe6ac3e3892b4dfd5a9e6d747ab629356f"

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
