SUMMARY = "GTK3-based panel for wayland."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da62111cfafe45015704951c9d602bb2"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-panel.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = "\
	bash \
	light \
	python3 \
	python-i3ipc \
	python3-psutil \
	python3-pygobject \
	python3-requests \
	swaync \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.9.39"
SRCREV = "1673def21826e89172d64b483d6624fa57226c81"

