SUMMARY = "FFMPEG wrapper for Python"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a2d7b4be06609e1a683e7d895c75c02"

SRC_URI = "git://github.com/imageio/imageio-ffmpeg.git;protocol=https;branch=master"

inherit python_setuptools_build_meta

S = "${WORKDIR}/git"
PV = "0.5.1"
SRCREV = "b53cbc534f19df1496b516974f32bc3d4c25d3cc"

RDEPENDS:${PN} += "ffmpeg python3-imageio"
