SUMMARY = "Generate/Export Material You Color Palette"
HOMEPAGE = "https://github.com/InioX/matugen"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a23a74b3f4caf9616230789d94217acb"

SRC_URI += "git://github.com/InioX/matugen.git;protocol=https;nobranch=1"
SRCREV = "e65259d68edc034905da477b6c1a349e89e2aa8d"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc
