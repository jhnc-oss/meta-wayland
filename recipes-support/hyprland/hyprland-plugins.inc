SRC_URI = "git://github.com/hyprwm/hyprland-plugins.git;protocol=https;branch=main"
SRCREV = "3ae670253a5a3ae1e3a3104fb732a8c990a31487"

# Hack to allow patching the plugins
do_configure:prepend() {
	rm -rf ${S}/patches
	rm -rf ${S}/.pc
}
