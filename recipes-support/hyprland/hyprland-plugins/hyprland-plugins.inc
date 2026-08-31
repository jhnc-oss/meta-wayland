SRC_URI = "git://github.com/hyprwm/hyprland-plugins.git;protocol=https;branch=main"
SRCREV = "67c3a4c019f223c27b5bdc6bb656ce891a60861a"

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
    hyprutils \
"

inherit cmake pkgconfig

FILES:${PN}-dev = ""

# Hack to allow patching the plugins
do_configure:prepend() {
	rm -rf ${S}/patches
	rm -rf ${S}/.pc
}

