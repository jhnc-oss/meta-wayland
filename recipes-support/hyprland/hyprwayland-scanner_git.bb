SUMMARY = "A Hyprland implementation of wayland-scanner, in and for C++."
HOMEPAGE = "https://github.com/hyprwm/hyprwayland-scanner"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprwayland-scanner.git;protocol=https;branch=main"

DEPENDS = "pugixml"

S = "${WORKDIR}/git"
SRCREV = "d5fa094ca27e0039be5e94c0a80ae433145af8bb"
PV = "0.4.0"

inherit cmake pkgconfig

BBCLASSEXTEND = "native"
