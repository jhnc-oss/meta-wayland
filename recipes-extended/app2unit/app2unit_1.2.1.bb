SUMMARY = "Launch Desktop Entries (or arbitrary commands) as Systemd user units, and do it fast"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/Vladimir-csp/app2unit.git;protocol=https;branch=master"
SRCREV = "83e2656fb8d39ad71e2f8a5ba113a9cedc90841f"

DEPENDS = "scdoc-native gzip-native"

do_install() {
	install -d ${D}${bindir} ${D}${datadir}/man/man1
	install -m 0644 app2unit.1.gz ${D}${datadir}/man/man1
	install -m 0755 app2unit ${D}${bindir}
	for file in app2unit-open app2unit-open-scope app2unit-open-service app2unit-term app2unit-term-scope app2unit-term-service; do
		ln -sf  app2unit ${D}${bindir}/$file
	done
}
