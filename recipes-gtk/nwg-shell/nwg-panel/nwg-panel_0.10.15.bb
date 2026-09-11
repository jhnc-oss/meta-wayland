SUMMARY = "GTK3-based panel for wayland."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da62111cfafe45015704951c9d602bb2"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-panel.git;protocol=https;branch=master;tag=v0.10.15 \
"

RDEPENDS:${PN} = "\
	bash \
	python3 \
	python-i3ipc \
	python3-psutil \
	python3-pygobject \
	python3-requests \
	swaync \
"

inherit setuptools3

SRCREV = "2b3ddef5129a0d3540832bb7fa48ce6d1a40b99f"

