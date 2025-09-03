SUMMARY = "Glaze reads and writes from object memory, simplifying interfaces and offering incredible performance"
HOMEPAGE = "https://github.com/stephenberry/glaze"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea4d29875d83fbbf50485c846dbbbed8"

SRC_URI = "git://github.com/stephenberry/glaze.git;protocol=https;nobranch=1"
SRCREV = "dc6e2bbc2dc7e0f3a65fec4fb78ae7b17b9a4648"

DEPENDS += "gcc-sanitizers libeigen"

inherit cmake

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

PACKAGECONFIG ?= ""
PACKAGECONFIG[openssl] = "-Dglaze_ENABLE_SSL=ON,-Dglaze_ENABLE_SSL=OFF,openssl"
