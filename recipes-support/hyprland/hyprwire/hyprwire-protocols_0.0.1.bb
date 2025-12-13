SUMMARY = "A centralized protocol spec repository for hyprwire/hyprtavern protocols"
HOMEPAGE = "https:/github.com/hyprwm/hypwire-protocols"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/hyprwm/hyprwire-protocols.git;protocol=https;branch=hyprtavern"

SRCREV = "b4a11329835584d302335aa26ab9f12ba9299bef"

inherit cmake
