SRC_URI = "git://github.com/hyprwm/hyprland-plugins.git;protocol=https;branch=main"
SRCREV = "ba1823c7870dc2a35e38ec09848a0294dfecc2a8"

DEPENDS = " \
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
