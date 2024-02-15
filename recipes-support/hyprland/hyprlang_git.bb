SUMMARY = "The hypr configuration language is an extremely efficient, yet easy to work with, configuration language for linux applications."
HOMEPAGE = "https:/github.com/hyprwm/hyprlang"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/hyprwm/hyprlang.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "aeb3e012adc7b3235335c540b214b82267c2b983"
PV = "0.3.2"

inherit cmake
