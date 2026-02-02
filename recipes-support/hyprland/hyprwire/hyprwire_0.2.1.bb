SUMMARY = "A fast and consistent wire protocol for IPC"
HOMEPAGE = "https:/github.com/hyprwm/hypwire"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = "hyprutils hyprwire-native libffi pugixml"

SRC_URI = "git://github.com/hyprwm/hyprwire.git;protocol=https;branch=main"

SRCREV = "73f9c11a90158242a3f7c9ffaef48bbb052f3faf"

inherit cmake pkgconfig

BBCLASSEXTEND = "native"
