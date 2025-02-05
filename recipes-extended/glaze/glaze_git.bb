SUMMARY = "Glaze reads and writes from object memory, simplifying interfaces and offering incredible performance"
HOMEPAGE = "https://github.com/stephenberry/glaze"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea4d29875d83fbbf50485c846dbbbed8"

SRC_URI = "git://github.com/stephenberry/glaze.git;protocol=https;nobranch=1"
SRCREV = "dfdb2ea5e878e8eff9f863b50728d860f663764f"
PV = "4.2.3"
S = "${WORKDIR}/git"

DEPENDS += "gcc-sanitizers libeigen"
inherit cmake

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

do_install:append() {
    install -d ${D}${datadir}/pkgconfig
    cat >${D}${datadir}/pkgconfig/glaze.pc <<EOF
prefix=${prefix}
includedir=${includedir}/glaze

Name: glaze
Description: one of the fastest JSON libraries
Version: ${PV}
URL: github.com/stephenberry/glaze
EOF
}


