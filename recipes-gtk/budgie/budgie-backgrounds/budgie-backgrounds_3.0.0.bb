SUMMARY = "Backgrounds for the budgie desktop"
HOMEPAGE = "https://github.com/BuddiesOfBudgie/budgie-backgrounds"
LICENSE = "CC-BY-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=65d3616852dbf7b1a6d4b53b00626032"

inherit meson

DEPENDS = "imagemagick-native"

SRC_URI = "git://github.com/BuddiesOfBudgie/budgie-backgrounds.git;protocol=https;nobranch=1"
SRCREV = "45f0d1a196348b950158e3cf6ffea4dbb672fb7e"

do_configure:prepend() {
    ln -sf ${STAGING_BINDIR_NATIVE}/magick.im7 ${STAGING_BINDIR_NATIVE}/mogrify
}

FILES:${PN} += "${datadir}"

