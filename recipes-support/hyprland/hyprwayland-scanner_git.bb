SUMMARY = "A Hyprland implementation of wayland-scanner, in and for C++."
HOMEPAGE = "https://github.com/hyprwm/hyprwayland-scanner"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprwayland-scanner.git;protocol=https;branch=main"

DEPENDS = "pugixml"

S = "${WORKDIR}/git"
SRCREV = "1413398dcaf702e78a678090c92c26a5fd604ce6"
PV = "0.3.10"

inherit cmake pkgconfig

BBCLASSEXTEND = "native"
