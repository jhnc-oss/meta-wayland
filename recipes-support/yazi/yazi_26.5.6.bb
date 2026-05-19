SUMMARY = "Yazi - Blazing Fast Terminal File Manager"
HOMEPAGE = "https://github.com/sxyazi/yazi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9c0ba340a238122a2eb7974c71bf7ae4"

SRC_URI = "git://github.com/sxyazi/yazi.git;protocol=https;branch=main"
SRC_URI += "file://0001-Cargo.toml-disable-strip.patch"
SRCREV = "aa526434f00bb44e2e902d9a4ac5f810da1018b9"

inherit cargo cargo-update-recipe-crates

require ${BPN}-crates.inc

# avoid packaging the debug symbols as they contain buildpaths (cargo_home)
PACKAGES:remove = "${PN}-dbg"
INSANE_SKIP:${PN} = "installed-vs-shipped"

RRECOMMENDS:${PN} = " \
    ${@bb.utils.contains_any('DISTRO_FEATURES', 'wayland x11', 'ueberzugpp', '', d)} \
    ${@bb.utils.contains('LICENSE_FLAGS_ACCEPTED', 'commercial', 'ffmpeg', '', d)} \
    7zip \
    chafa \
    fd \
    fzf \
    imagemagick \
    jq \
    nerd-fonts-symbols \
    poppler \
    resvg \
    ripgrep \
    wl-clipboard \
    zoxide \
"
