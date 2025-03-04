SUMMARY = "GTK3-based application launcher for wlroots based compositors."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

DEPENDS = " \
	gtk+3 \
	gtk-layer-shell \
"

RDEPENDS:${PN} = "go-runtime"

GO_IMPORT = "github.com/nwg-piotr/nwg-drawer.git"

SRC_URI = "git://${GO_IMPORT};destsuffix=src/${GO_IMPORT};nobranch=1;protocol=https"

PV = "0.6.3"
SRCREV = "d1be3de9d7a4ae2a26415aa3c628e8ba6ac7d676"
S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

inherit go go-mod pkgconfig

GO_INSTALL = "${GO_IMPORT}"
GO_LINKSHARED = ""

do_install:append() {
	# remove precompiled x86 binary
	rm -rf ${D}${libdir}/go/src/${GO_IMPORT}/bin
	rm -rf ${D}${libdir}/go/pkg/mod/github.com/dlasky/gotk3-layershell*/example
}

do_compile[network] = "1"
