SUMMARY = "GTK3-based panel for wayland."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da62111cfafe45015704951c9d602bb2"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-panel.git;protocol=https;branch=master;tag=v${PV} \
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

SRCREV = "8d167ecd0aee752fdfd49158acb95d448282915a"

