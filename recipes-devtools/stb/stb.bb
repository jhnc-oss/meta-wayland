SUMMARY = "stb is a set of single-file libraries for C/C++"
HOMEPAGE = "https://github.com/nothings/stb"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb994481c55623ef338885280e676f3b"

SRC_URI = "git://github.com/nothings/stb.git;protocol=https;branch=master"
SRCREV = "013ac3beddff3dbffafd5177e7972067cd2b5083"

do_install() {
	install -d ${D}${includedir}/stb
	for file in ${S}/*.h; do
		install -m 0644 $file ${D}${includedir}/stb
	done
	# needed for gamescope
	install -m 0644 deprecated/stb_image_resize.h ${D}${includedir}/stb
}

