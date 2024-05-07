SUMMARY = "nwg-shell config utility."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-shell-config.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = "\
	python3 \
	python3-geopy \
	python-i3ipc \
	python3-pygobject \
	swaync \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.5.37"
SRCREV = "0137ed8f8c999eb72b4dd3db996d25a241e161a8"

