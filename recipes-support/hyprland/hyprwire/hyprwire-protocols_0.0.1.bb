SUMMARY = "A centralized protocol spec repository for hyprwire/hyprtavern protocols"
HOMEPAGE = "https:/github.com/hyprwm/hypwire-protocols"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"
SRC_URI = "git://github.com/hyprwm/hyprwire-protocols.git;protocol=https;branch=hyprtavern"

SRCREV = "326e0cde63577cb035d3e7a6a3c543dc88764a26"

inherit cmake
