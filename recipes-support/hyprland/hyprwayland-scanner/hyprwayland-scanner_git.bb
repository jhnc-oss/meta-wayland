SUMMARY = "A Hyprland implementation of wayland-scanner, in and for C++."
HOMEPAGE = "https://github.com/hyprwm/hyprwayland-scanner"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprwayland-scanner.git;protocol=https;branch=main"

DEPENDS = "pugixml"

SRCREV = "206367a08dc5ac4ba7ad31bdca391d098082e64b"
PV = "0.4.4"

inherit cmake pkgconfig

BBCLASSEXTEND = "native"
