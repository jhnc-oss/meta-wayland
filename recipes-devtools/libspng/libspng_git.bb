SUMMARY = "libspng is a C library for reading and writing PNG format files with a focus on security and ease of use"
HOMEPAGE = "https://github.com/randy408/libspng"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=29809adc19b040d93257a61c5bff614b"

SRC_URI = "git://github.com/randy408/libspng.git;protocol=https;branch=master"
SRCREV = "fb768002d4288590083a476af628e51c3f1d47cd"
S = "${WORKDIR}/git"
PV = "0.7.4"

DEPENDS = "libdeflate"

inherit cmake

EXTRA_OECMAKE += "-DSPNG_STATIC=OFF -DBUILD_EXAMPLES=OFF"

FILES:${PN} = "${libdir}/libspng.so"
FILES:${PN}-dev = "${libdir}/cmake ${libdir}/pkgconfig ${includedir}"
