SUMMARY = "FFMPEG wrapper for Python"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c1d517105fede816785b75e91a3a1e5"

SRC_URI = "git://github.com/imageio/imageio-ffmpeg.git;protocol=https;branch=main"

inherit python_setuptools_build_meta

SRCREV = "ae47d8028c237ca5507ceef1b843ee427b442887"

RDEPENDS:${PN} += "ffmpeg python3-imageio"
