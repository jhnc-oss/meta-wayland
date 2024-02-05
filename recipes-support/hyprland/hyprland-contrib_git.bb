SUMMARY = "Hyprland Contribution Scripts"
HOMEPAGE = "https:/github.com/hyprwm/contrib"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0836e8f0d25d383d1195ea44fdd185d"

SRC_URI = "git://github.com/hyprwm/contrib.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "16884001b26e6955ff4b88b4dfe4c8986e20f153"
PV = "0.1"

DEPENDS = "scdoc-native"
RDEPENDS:${PN} = "bash sed jq libnotify grim slurp wl-clipboard ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'rofi', '', d)}"

EXTRA_OEMAKE += "DESTDIR=${D} PREFIX=${prefix} BINDIR=${D}${bindir} MANDIR=${D}${datadir}/man MAN1DIR=${D}${datadir}/man1"

x11_scripts = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'scratchpad grimblast', '', d)}"
do_install() {
	for dir in hyprprop hdrop shellevents try_swap_workspace ${x11_scripts}; do
		cd $dir && oe_runmake && oe_runmake install && cd ${S}
	done
}

FILES:${PN} = "${bindir} ${datadir}"
