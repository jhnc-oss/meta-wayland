SUMMARY = "A fast and consistent wire protocol for IPC"
HOMEPAGE = "https:/github.com/hyprwm/hypwire"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = "libffi hyprutils"

SRC_URI = "git://github.com/hyprwm/hyprwire.git;protocol=https;branch=main"

SRCREV = "a1f146a59cce70161595933a5e8b435b6c090a97"

inherit cmake pkgconfig
