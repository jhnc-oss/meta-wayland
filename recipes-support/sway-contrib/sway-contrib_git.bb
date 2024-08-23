SUMMARY = "Sway Contribution Scripts"
HOMEPAGE = "https:/github.com/OctopusET/sway-contrib"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1640a047991fe3cbc70d68830888e863"

SRC_URI = "git://github.com/OctopusET/sway-contrib.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
SRCREV = "b7825b218e677c65f6849be061b93bd5654991bf"
PV = "1.9"

RDEPENDS:${PN} = "python3"

do_install() {
	install -d ${D}${bindir}
	install -m 755 ${S}/grimshot ${D}${bindir}
	install -m 755 ${S}/autoname-workspaces.py ${D}${bindir}
	install -m 755 ${S}/inactive-windows-transparency.py ${D}${bindir}
	install -m 755 ${S}/switch-top-level.py ${D}${bindir}
}

FILES:${PN} = "${bindir}"
