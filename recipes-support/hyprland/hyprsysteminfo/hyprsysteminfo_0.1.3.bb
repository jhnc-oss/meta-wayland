SUMMARY = "A tiny hyprtoolkit application to display information about the running system, or copy diagnostics data, without the terminal."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprsysteminfo.git;protocol=https;branch=main"

SRCREV = "1959f049f5934be215a9eca9fbc1582438f4dbe2"

DEPENDS = "glaze6 hyprtoolkit hyprutils libdrm pciutils pixman"

inherit cmake pkgconfig
