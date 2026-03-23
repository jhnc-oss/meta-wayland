SUMMARY = "Generate/Export Material You Color Palette"
HOMEPAGE = "https://github.com/InioX/matugen"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a23a74b3f4caf9616230789d94217acb"

SRC_URI += "git://github.com/InioX/matugen.git;protocol=https;nobranch=1"
SRCREV = "4112d352914742ba69f6380fd07984adba02d376"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc
