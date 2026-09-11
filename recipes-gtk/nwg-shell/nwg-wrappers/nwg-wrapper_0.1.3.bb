SUMMARY = "GTK3-based wrapper to display a script output, or a text file content on the desktop in wlroots-based compositors."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f8c294ba3ca22f2369223ac6415d1168"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-wrapper.git;protocol=https;branch=master;tag=v0.1.3 \
"

DEPENDS = "python3"
RDEPENDS:${PN} = "python3-pygobject"

inherit setuptools3 gobject-introspection

SRCREV = "ad1d8607838185d7cb69d66e89856c8ba0103a47"

