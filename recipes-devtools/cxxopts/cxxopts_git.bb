SUMMARY = "This is a lightweight C++ option parser library, supporting the standard GNU style syntax for options."
HOMEPAGE = "https://github.com/jarro2783/cxxopts"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8de00431559a76a1b43f6fd44f8f6689"

SRC_URI = "git://github.com/jarro2783/cxxopts.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "3.2.1"
SRCREV = "4bf61f08697b110d9e3991864650a405b3dd515d"

inherit cmake

	
