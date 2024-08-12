SUMMARY = "GTK3-based dock for hyprland."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

DEPENDS = " \
	gtk+3 \
	gtk-layer-shell \
"
RDEPENDS:${PN} = "go-runtime"

GO_IMPORT = "github.com/nwg-piotr/nwg-dock-hyprland.git"

SRC_URI = "git://${GO_IMPORT};destsuffix=src/${GO_IMPORT};nobranch=1;protocol=https"

PV = "0.2.1"
SRCREV = "9bbf58422472ea26a721c66aef7df46209345a15"
S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

inherit go go-mod pkgconfig

GO_INSTALL = "${GO_IMPORT}"
GO_LINKSHARED = ""

do_install:append() {
	# remove precompiled x86 binaries
	rm -rf ${D}${libdir}/go/src/${GO_IMPORT}/bin
	rm -rf ${D}${libdir}/go/pkg/mod/github.com/dlasky/gotk3-layershell*/example
	install -d ${D}${datadir}/nwg-dock-hyprland ${D}${systemd_user_unitdir}
	install -m 0644 ${S}/src/${GO_IMPORT}/config/style.css ${D}${datadir}/nwg-dock-hyprland
	cp -rf ${S}/src/${GO_IMPORT}/images ${D}${datadir}/nwg-dock-hyprland
	cat >${D}${systemd_user_unitdir}/nwg-dock-hyprland.service <<EOF
[Unit]
Description=nwg-dock-hyprland

[Service]
LockPersonality=yes
MemoryDenyWriteExecute=yes
NoNewPrivileges=yes
RestrictNamespaces=yes
Type=simple
ExecStart= /usr/bin/nwg-dock-hyprland -mb 6 -d -hd 2000
Restart=on-failure

[Install]
WantedBy=graphical-session.target
EOF
}

do_compile[network] = "1"

FILES:${PN} += "${systemd_user_unitdir}"
