SUMMARY = "geopy is a Python client for several popular geocoding web services."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b246754361f75980923b7feebfe71c15"

SRC_URI = " \
	git://github.com/geopy/geopy.git;protocol=https;branch=master;tag=2.5.0 \
"

RDEPENDS:${PN} = " \
	python3 \
"

inherit setuptools3

SRCREV = "402cbba8b093e5e3f89c81b902f576d65608a123"

