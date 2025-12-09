SUMMARY = "Wayland protocol extensions for Hyprland"
HOMEPAGE = "https:/github.com/hyprland-protocols"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=936078e4e67b0e1e1bd1e862d4ffbc25"

SRC_URI = "git://github.com/hyprwm/hyprland-protocols.git;protocol=https;branch=main"

SRCREV = "3f3860b869014c00e8b9e0528c7b4ddc335c21ab"

inherit cmake
