SUMMARY = "nwg-hello is a GTK3-based greeter for the greetd daemon, written in python."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b0ad99c75f37a759e329c5da4c8a7fcb"

SRC_URI = "git://github.com/nwg-piotr/nwg-hello.git;protocol=https;branch=main;tag=v${PV}"

RDEPENDS:${PN} = " \
	python3 \
	greetd \
	gtk+3 \
	gtk-layer-shell \
"

RRECOMMENDS:${PN} = "gnome-themes-extra"

inherit setuptools3 useradd

SRCREV = "ec535909b71eb3a669835a43fdf9efe364fd5429"

USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "--system  --no-create-home --shell /bin/bash greeter"

do_install:append() {
	install -D -m 644 -t ${D}${sysconfdir}/nwg-hello/ nwg-hello-default.json
	install -D -m 644 -t ${D}${sysconfdir}/nwg-hello/ nwg-hello-default.css
	install -D -m 644 -t ${D}${sysconfdir}/nwg-hello/ hyprland.conf
	install -D -m 644 -t ${D}${sysconfdir}/nwg-hello/ sway-config
	install -D -m 644 -t ${D}${sysconfdir}/nwg-hello/ README
	install -D -m 644 -t ${D}${datadir}/nwg-hello/ nwg.jpg
	install -D -m 644 -t ${D}${datadir}/nwg-hello/ img/*

	install -d ${D}${localstatedir}/nwg-hello
	install -D -m 644 -t ${D}${localstatedir}/nwg-hello cache.json -o greeter
}
