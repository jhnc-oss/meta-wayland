SUMMARY = "A Hyprland implementation of wayland-scanner, in and for C++."
HOMEPAGE = "https://github.com/hyprwm/hyprwayland-scanner"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprwayland-scanner.git;protocol=https;branch=main"

DEPENDS = "pugixml"

SRCREV = "fcca0c61f988a9d092cbb33e906775014c61579d"

inherit cmake pkgconfig

BBCLASSEXTEND = "native"
