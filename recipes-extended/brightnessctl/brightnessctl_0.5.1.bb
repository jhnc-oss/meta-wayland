SUMMARY = "This program allows you read and control device brightness on Linux"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b3ad8718387309bb4fbcb4adce0d77c1"

SRC_URI = "git://github.com/Hummer12007/brightnessctl.git;protocol=https;branch=master"
SRCREV = "e70bc55cf053caa285695ac77507e009b5508ee3"

do_compile() {
	./configure
	oe_runmake
}

do_install() {
	install -d ${D}${libdir}/udev/rules.d ${D}${bindir}
	install -m 0755 brightnessctl ${D}${bindir}
	install -m 0644 90-brightnessctl.rules ${D}${libdir}/udev/rules.d
}
