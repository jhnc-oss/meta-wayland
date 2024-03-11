SUMMARY = "Hyprland's simple, yet multi-threaded and GPU-accelerated screen locking utility"
HOMEPAGE = "https:/github.com/hyprwm/hyprlock"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprlock.git;protocol=https;branch=main"

REQUIRED_DISTRO_FEATURES = "opengl"

DEPENDS = "wayland wayland-native wayland-protocols hyprlang libxkbcommon cairo pango libdrm  libpam virtual/libgl virtual/egl"

S = "${WORKDIR}/git"
SRCREV = "21d9efe5c94f1a292d181af70b32059509eada68"
PV = "0.1.0"

inherit cmake pkgconfig features_check
