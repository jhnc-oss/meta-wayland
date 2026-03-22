SUMMARY = "An improved Python library to control i3wm and sway."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3961efb54421653518521529853444c4"

RDEPENDS:${PN} = "python3"

SRC_URI = "git://github.com/altdesktop/i3ipc-python.git;protocol=https;branch=master"
SRCREV  = "9de8e885536bf611c96cc7c8ea0b2f19dd40f4f2"

inherit setuptools3

