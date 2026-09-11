SUMMARY = "Yazi - Blazing Fast Terminal File Manager"
HOMEPAGE = "https://github.com/sxyazi/yazi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9c0ba340a238122a2eb7974c71bf7ae4"

SRC_URI = "git://github.com/sxyazi/yazi.git;protocol=https;branch=main;tag=v${PV}"
SRC_URI += "file://0001-Cargo.toml-disable-strip.patch"
SRC_URI += "git://github.com/yazi-rs/ratatui.git;protocol=https;branch=fix_buffer_diff_wide_cells;name=ratatui-core;destsuffix=ratatui;type=git-dependency"
SRCREV = "8dd895c695a5950330c2623eb43debf323b60654"
SRCREV_FORMAT .= "_ratatui-core"
SRCREV_ratatui-core = "dde5e05eccfe5b7cb7712b4bdf76edd0c2cd1f25"

inherit cargo cargo-update-recipe-crates

point_ratatui_at_unpacked_source() {
    sed -i 's|^ratatui-core = { git = .*|ratatui-core = { path = "${UNPACKDIR}/ratatui/ratatui-core" }|' ${S}/Cargo.toml
    sed -i 's|ratatui-core = { path = "${UNPACKDIR}/ratatui" }|ratatui-core = { path = "${UNPACKDIR}/ratatui/ratatui-core" }|' ${CARGO_HOME}/config.toml
}
do_configure[postfuncs] += "point_ratatui_at_unpacked_source"

require ${BPN}-crates.inc

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
