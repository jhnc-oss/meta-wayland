SUMMARY = "nwg-shell config utility."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-shell-config.git;protocol=https;branch=master;tag=v0.5.65 \
"

RDEPENDS:${PN} = "\
	python3 \
	python3-geopy \
	python-i3ipc \
	python3-pygobject \
	swaync \
"

inherit setuptools3

SRCREV = "59c56c449062042cac97923df07ad2c75de1c669"

