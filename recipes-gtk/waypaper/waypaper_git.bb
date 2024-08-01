SUMMARY = "GUI wallpaper setter for Wayland and Xorg window managers."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/anufrievroman/waypaper.git;protocol=https;branch=main"

RDEPENDS:${PN} = "python3-pygobject python3-importlib-metadata python3-platformdirs python3-pillow python3-pathlib2"

inherit python_setuptools_build_meta

S = "${WORKDIR}/git"
PV = "2.2"
SRCREV = "bbdca8a4d96208c748af7307fbcf3d61e46bc64e"

FILES:${PN} += "${datadir}"
