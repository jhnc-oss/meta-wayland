SUMMARY = "Proposal for XDG Default Terminal Execution Specification and reference shell-based implementation"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/Vladimir-csp/xdg-terminal-exec.git;protocol=https;branch=master;tag=v0.14.3"
SRCREV = "065925df9f419008159258ae169018bfd23df71b"

DEPENDS = "scdoc-native"

do_install()  {
	install -d ${D}${bindir} ${D}${datadir}/man/man1
	oe_runmake prefix=${prefix} DESTDIR=${D} install
}

