SUMMARY = "Glaze reads and writes from object memory, simplifying interfaces and offering incredible performance"
HOMEPAGE = "https://github.com/stephenberry/glaze"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea4d29875d83fbbf50485c846dbbbed8"

SRC_URI = "git://github.com/stephenberry/glaze.git;protocol=https;nobranch=1"
SRCREV = "f2ffb152b2c061330d415189e5088b249eb9d313"

DEPENDS += "gcc-sanitizers libeigen"

inherit cmake

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

PACKAGECONFIG ?= ""
PACKAGECONFIG[openssl] = "-Dglaze_ENABLE_SSL=ON,-Dglaze_ENABLE_SSL=OFF,openssl"

FILES:${PN} += "${datadir}"
