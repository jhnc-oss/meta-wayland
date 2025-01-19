SUMMARY = "Hyprland's simple, yet multi-threaded and GPU-accelerated screen locking utility"
HOMEPAGE = "https:/github.com/hyprwm/hyprlock"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprlock.git;protocol=https;branch=main"

REQUIRED_DISTRO_FEATURES = "opengl"

DEPENDS = " \
	cairo \
	hyprgraphics \
	hyprlang \
	hyprutils \
	hyprwayland-scanner-native \
	jpeg \
	libdrm  \
	libpam \
	libwebp \
	libxkbcommon \
	pango \
	sdbus-c++ \
	virtual/egl \
	virtual/libgl \
	wayland \
	wayland-native \
	wayland-protocols \
"

S = "${WORKDIR}/git"
SRCREV = "02639c27599b03c81dc1d0e031628224f5ad8d50"
PV = "0.6.1"

inherit cmake pkgconfig features_check

do_install() {
	install -Dm755 ${B}/hyprlock ${D}${bindir}/hyprlock
	install -Dm644 ${S}/pam/hyprlock ${D}${sysconfdir}/pam.d/hyprlock
}
