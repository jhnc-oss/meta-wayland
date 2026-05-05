SUMMARY = "A tiny hyprtoolkit application to display information about the running system, or copy diagnostics data, without the terminal."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprsysteminfo.git;protocol=https;branch=main"

SRCREV = "6f68a726531b53d87c6dd6ce474face27dde02ff"

DEPENDS = "glaze hyprtoolkit hyprutils libdrm pciutils pixman"

inherit cmake pkgconfig
