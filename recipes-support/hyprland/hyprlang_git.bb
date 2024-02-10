SUMMARY = "The hypr configuration language is an extremely efficient, yet easy to work with, configuration language for linux applications."
HOMEPAGE = "https:/github.com/hyprwm/hyprlang"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/hyprwm/hyprlang.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "335d0c65e1be3855bf835bf4e1c6f7566a0f52bf"
PV = "0.3.0"

inherit cmake
