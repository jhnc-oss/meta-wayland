SUMMARY = "A Hyprland implementation of wayland-scanner, in and for C++."
HOMEPAGE = "https://github.com/hyprwm/hyprwayland-scanner"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprwayland-scanner.git;protocol=https;branch=main"

DEPENDS = "pugixml"

S = "${WORKDIR}/git"
SRCREV = "1c9ed159e15f7403f170f075b839c4b2206d3cad"
PV = "0.3.0"

inherit cmake pkgconfig

BBCLASSEXTEND = "native"
