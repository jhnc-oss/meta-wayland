SUMMARY = "Glaze reads and writes from object memory, simplifying interfaces and offering incredible performance"
HOMEPAGE = "https://github.com/stephenberry/glaze"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea4d29875d83fbbf50485c846dbbbed8"

SRC_URI = "git://github.com/stephenberry/glaze.git;protocol=https;nobranch=1"
SRCREV = "7fccd73a5e1d9723a4a26d77979ecaa554c45a14"

DEPENDS += "gcc-sanitizers libeigen"

inherit cmake

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

PACKAGECONFIG ?= ""
PACKAGECONFIG[openssl] = "-Dglaze_ENABLE_SSL=ON,-Dglaze_ENABLE_SSL=OFF,openssl"

FILES:${PN} += "${datadir}"
