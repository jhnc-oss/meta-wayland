SUMMARY = "Proposal for XDG Default Terminal Execution Specification and reference shell-based implementation"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/Vladimir-csp/xdg-terminal-exec.git;protocol=https;branch=master"
SRCREV = "e675f61c1fa1175b1295f9d2ed5338f73a2cb679"

DEPENDS = "scdoc-native"

do_install()  {
	install -d ${D}${bindir} ${D}${datadir}/man/man1
	oe_runmake prefix=${prefix} DESTDIR=${D} install
}

