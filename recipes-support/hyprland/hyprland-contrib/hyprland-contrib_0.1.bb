SUMMARY = "Hyprland Contribution Scripts"
HOMEPAGE = "https:/github.com/hyprwm/contrib"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0836e8f0d25d383d1195ea44fdd185d"

SRC_URI = "git://github.com/hyprwm/contrib.git;protocol=https;branch=main"

SRCREV = "e291151acd302c568cdaf66f165f6cc6f32c424a"

DEPENDS = "scdoc-native"
RDEPENDS:${PN} = "bash sed jq libnotify grim slurp wl-clipboard"

EXTRA_OEMAKE += "DESTDIR=${D} PREFIX=${prefix} BINDIR=${D}${bindir} MANDIR=${D}${datadir}/man MAN1DIR=${D}${datadir}/man1"

do_install() {
	for dir in hyprprop hdrop shellevents try_swap_workspace scratchpad grimblast; do
		cd $dir && oe_runmake && oe_runmake install && cd ${S}
	done
}

FILES:${PN} = "${bindir} ${datadir}"
