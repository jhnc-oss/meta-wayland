SUMMARY = "GUI wallpaper setter for Wayland and Xorg window managers."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/anufrievroman/waypaper.git;protocol=https;branch=main"

inherit python_setuptools_build_meta

S = "${WORKDIR}/git"
PV = "2.4"
SRCREV = "4e1c73b56e6fc306d3cd601d1c28635419a23f17"

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} = " \
	python3-imageio \
	python3-imageio-ffmpeg \
	python3-importlib-metadata \
	python3-pathlib2 \
	python3-pillow \
	python3-platformdirs \
	python3-pygobject \
	python3-screeninfo \
	socat \
"
