SUMMARY = "A python implementation of the mustache templating language."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a2d7b4be06609e1a683e7d895c75c02"

SRC_URI = "git://github.com/noahmorrison/chevron;protocol=https;branch=main"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.13.1"
SRCREV = "d7f6bd54a296620068570fb83b91a43958ee5e37"

