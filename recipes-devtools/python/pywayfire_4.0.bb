SUMMARY = "Python ipc bindings for wayfire"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=12a8965e31d96ba989d4294f1e2cd525"

inherit python_setuptools_build_meta

DEPENDS += "python3-wheel-native"

SRC_URI = "git://github.com/WayfireWM/pywayfire.git;protocol=https;branch=main;tag=v4.0"
SRCREV = "d1010318cdddafc5307645b28e3130beeb00c9c3"

