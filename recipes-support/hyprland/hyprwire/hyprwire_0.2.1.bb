SUMMARY = "A fast and consistent wire protocol for IPC"
HOMEPAGE = "https:/github.com/hyprwm/hypwire"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = "hyprutils hyprwire-native libffi pugixml"

SRC_URI = "git://github.com/hyprwm/hyprwire.git;protocol=https;branch=main"

SRCREV = "b8ca85082fd5c3cdd3d11027492cd0332b517078"

inherit cmake pkgconfig

BBCLASSEXTEND = "native"
