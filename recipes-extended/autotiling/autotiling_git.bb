SUMMARY = "Switch the layout splith/splitv depending on the currently focused window dimensions."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = " \
	git://github.com/nwg-piotr/autotiling.git;protocol=https;branch=master \
"

DEPENDS = "python3-wheel-native"

RDEPENDS:${PN} = "python-i3ipc"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "1.9.2"
SRCREV = "d31aad311cd9280517e429eb397915fb4ff21a40"

