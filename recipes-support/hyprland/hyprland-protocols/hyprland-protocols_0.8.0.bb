SUMMARY = "Wayland protocol extensions for Hyprland"
HOMEPAGE = "https:/github.com/hyprland-protocols"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=936078e4e67b0e1e1bd1e862d4ffbc25"

SRC_URI = "git://github.com/hyprwm/hyprland-protocols.git;protocol=https;branch=main"

SRCREV = "cd1aba6bd78775825eb230b3a4274c48b6705eb7"

inherit cmake
