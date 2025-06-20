SUMMARY = "A Wayland virtual keyboard"
DESCRIPTION = "Squeekboard is a virtual keyboard supporting Wayland, built \
primarily for the Librem 5 phone. \
It squeaks because some Rust got inside."
HOMEPAGE = "https://developer.puri.sm/projects/squeekboard/"
BUGTRACKER = "https://gitlab.gnome.org/World/Phosh/squeekboard/-/issues"
LICENSE = "GPL-3.0-only & GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    file://debian/copyright;md5=4dbf2d985c407c84a6622b9c95f23802"

DEPENDS = "\
    feedbackd \
    glib-2.0 \
    glib-2.0-native \
    gnome-desktop \
    gtk+3 \
    libbsd \
    libxkbcommon \
    wayland \
    wayland-native \
    wayland-protocols \
"

require squeekboard-crates.inc

SRC_URI += "\
    git://gitlab.gnome.org/World/Phosh/squeekboard.git;protocol=https;nobranch=1 \
    file://0001-Pass-additional-arguments-to-cargo.patch \
"

PV = "1.43.1"
SRCREV = "15569da021824b6da5c337ba9875c5002158f43e"

inherit cargo meson rust pkgconfig cargo-update-recipe-crates

EXTRA_OEMESON = "\
    -Dcargo-flags=[\'--target\',\'${RUST_HOST_SYS}\',\'-v\'] \
    -Dtests=false \
    -Ddepdatadir=${datadir} \
"

export CARGO_FEATURE_STD = "1"

do_configure() {
    cargo_common_do_configure
    meson_do_configure
}

do_compile() {
    oe_cargo_fix_env
    export RUSTFLAGS="${RUSTFLAGS}"
    export RUST_TARGET_PATH="${RUST_TARGET_PATH}"
    meson_do_compile
}

do_install() {
    oe_cargo_fix_env
    export RUSTFLAGS="${RUSTFLAGS}"
    export RUST_TARGET_PATH="${RUST_TARGET_PATH}"
    meson_do_install

    install -d ${D}${sysconfdir}/xdg/autostart
    cp ${D}${datadir}/applications/sm.puri.Squeekboard.desktop ${D}${sysconfdir}/xdg/autostart
}

FILES:${PN} += "${datadir}"
