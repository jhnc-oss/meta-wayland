SUMMARY = "A daemon to provide haptic, led and audio feedback triggered by application events."
HOMEPAGE = "https://source.puri.sm/Librem5/feedbackd"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

REQUIRED_DISTRO_FEATURES = "gobject-introspection-data"

DEPENDS = " \
    gmobile \
    gsound \
    libgudev \
    glib-2.0 \
    json-glib \
"

GIR_MESON_OPTION = ""

inherit meson pkgconfig features_check gobject-introspection vala

SRC_URI = "gitsm://source.puri.sm/Librem5/feedbackd.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"
PV = "0.3.0"
SRCREV = "bf6928e47d6fc940986c06428e87a2eb95249ae0"

EXTRA_OEMESON += "-Dtests=false"

FILES:${PN} += "${datadir}"

