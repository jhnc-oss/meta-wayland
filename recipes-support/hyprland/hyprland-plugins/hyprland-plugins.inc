SRC_URI = "git://github.com/hyprwm/hyprland-plugins.git;protocol=https;branch=main"
SRCREV = "1c4b446cea46088c6c79e5c66ea5ae28b48c2701"

# Hack to allow patching the plugins
do_configure:prepend() {
	rm -rf ${S}/patches
	rm -rf ${S}/.pc
}
