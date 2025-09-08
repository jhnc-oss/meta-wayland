SUMMARY = "Proposal for XDG Default Terminal Execution Specification and reference shell-based implementation"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/Vladimir-csp/xdg-terminal-exec.git;protocol=https;branch=master"
SRCREV = "65cdde23699bebdb3443a16031e7fa1c64633dd0"

DEPENDS = "scdoc-native gzip-native"

do_compile()  {
	oe_runmake prefix=${prefix} 
}

do_install() {
	install -Dpm755 xdg-terminal-exec -t ${D}${bindir}
	install -Dpm644 xdg-terminals.list -t ${D}${datadir}/xdg-terminal-exec
	install -Dpm644 xdg-terminal-exec.1.gz -t ${D}${datadir}/man/man1
}
