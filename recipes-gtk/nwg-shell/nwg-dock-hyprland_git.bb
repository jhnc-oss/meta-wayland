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

PV = "0.4.3"
SRCREV = "69423b2fb8cff7a1a6364bec05e4c19eac2ea63e"
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
Description=Nwg Dock Hyprland - gtk3 based dock for Hyprland, written in go
PartOf=graphical-session.target
After=graphical-session.target
ConditionEnvironment=WAYLAND_DISPLAY

[Service]
ExecStart=nwg-dock-hyprland -d -hd 2000
Slice=session.slice
TimeoutStopSec=5sec
Restart=on-failure

[Install]
WantedBy=graphical-session.target
EOF
}

do_compile[network] = "1"

FILES:${PN} += "${systemd_user_unitdir}"
