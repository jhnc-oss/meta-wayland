SUMMARY = "Generate/Export Material You Color Palette"
HOMEPAGE = "https://github.com/InioX/matugen"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a23a74b3f4caf9616230789d94217acb"

SRC_URI += "git://github.com/InioX/matugen.git;protocol=https;nobranch=1"
SRCREV = "5f0ecbecafd0e1097bcd314367c53496814745b9"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc
