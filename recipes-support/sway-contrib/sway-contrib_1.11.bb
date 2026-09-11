SUMMARY = "Sway Contribution Scripts"
HOMEPAGE = "https:/github.com/OctopusET/sway-contrib"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1640a047991fe3cbc70d68830888e863"

SRC_URI = "git://github.com/OctopusET/sway-contrib.git;protocol=https;branch=master;tag=1.11"

SRCREV = "dff0a03067a3f048f02e252e62f09a4d39d04c57"

RDEPENDS:${PN} = "python3-as-python"

do_install() {
	install -d ${D}${bindir}
	install -m 755 ${S}/grimshot/grimshot ${D}${bindir}
	install -m 755 ${S}/autoname-workspaces.py ${D}${bindir}
	install -m 755 ${S}/inactive-windows-transparency.py ${D}${bindir}
	install -m 755 ${S}/switch-top-level.py ${D}${bindir}
}

FILES:${PN} = "${bindir}"
