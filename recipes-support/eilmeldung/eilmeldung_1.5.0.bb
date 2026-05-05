SUMMARY = "eilmeldung is a TUI RSS reader based on the awesome news-flash library"
HOMEPAGE = "https://github.com/christo-auer/eilmeldung"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI += " git://github.com/christo-auer/eilmeldung.git;protocol=https;nobranch=1"
SRCREV = "677e3cf16fe87cb9a9624a4cedb0d6d5993d8a64"

DEPENDS = "openssl libxml2 sqlite3 clang-native"

inherit cargo cargo-update-recipe-crates pkgconfig

require ${BPN}-crates.inc

do_configure:prepend() {
	sed -i "s|strip\ =\ true|strip\ =\ false|g" ${S}/Cargo.toml
}

do_compile:prepend() {
	export OPENSSL_NO_VENDOR=1
	export LIBCLANG_PATH="${STAGING_LIBDIR_NATIVE}/libclang.so"
}

# avoid packaging the debug symbols as they contain buildpaths (cargo_home)
PACKAGES:remove = "${PN}-dbg"
INSANE_SKIP:${PN} = "installed-vs-shipped"
