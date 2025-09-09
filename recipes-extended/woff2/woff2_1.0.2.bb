SUMMARY = "font compression reference code"
HOMEPAGE = "https://github.com/google/woff2"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=027c71da9e4664fdf192e6ec615f4d18"

inherit cmake pkgconfig

DEPENDS += "brotli"

SRC_URI = "git://github.com/google/woff2.git;protocol=https;branch=master"
SR_URI += "file://0001-include-woff2-output.h-include-missing-cstdint.patch"
SRCREV = "1bccf208bca986e53a647dfe4811322adb06ecf8"

EXTRA_OECMAKE += "-DCMAKE_POLICY_VERSION_MINIMUM=3.5"

do_install:append() {
	install -d ${D}${bindir}
	for file in woff2_compress woff2_decompress woff2_info; do
		install -m 755 ${B}/$file ${D}${bindir}
	done
}
