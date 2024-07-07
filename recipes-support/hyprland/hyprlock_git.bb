SUMMARY = "Hyprland's simple, yet multi-threaded and GPU-accelerated screen locking utility"
HOMEPAGE = "https:/github.com/hyprwm/hyprlock"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprlock.git;protocol=https;branch=main"

REQUIRED_DISTRO_FEATURES = "opengl"

DEPENDS = " \
	cairo \
	hyprlang \
	hyprutils \
	jpeg \
	libdrm  \
	libpam \
	libwebp \
	libxkbcommon \
	pango \
	virtual/egl \
	virtual/libgl \
	wayland \
	wayland-native \
	wayland-protocols \
"

S = "${WORKDIR}/git"
SRCREV = "6e0921140efb8895eb98efa99438fff23df2a726"
PV = "0.4.0"

inherit cmake pkgconfig features_check

do_install() {
	install -Dm755 ${B}/hyprlock ${D}${bindir}/hyprlock
	install -Dm644 ${S}/pam/hyprlock ${D}${sysconfdir}/pam.d/hyprlock
}
