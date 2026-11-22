SUMMARY = "VirtIO GPU driver with Direct3D and Vulkan for Windows guests"
HOMEPAGE = "https://github.com/utmapp/viogpu-wddm"
LICENSE = "BSD-2-Clause AND MIT"
LIC_FILES_CHKSUM = " \
	file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=cb641bc04cda31daea161b1bc15da69f \
	file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
"

SRC_URI = "https://github.com/utmapp/viogpu-wddm/releases/download/v${PV}/viogpu3d-x64-signed.zip;subdir=viogpu3d-${PV}"
SRC_URI[sha256sum] = "0e7aa5d17daeba5a8c2d0859c2651e8146fefe358680ca4686a747ae8afdb717"

UPSTREAM_CHECK_URI = "https://github.com/utmapp/viogpu-wddm/releases"
UPSTREAM_CHECK_REGEX = "releases/tag/v(?P<pver>\d+(\.\d+)+)"

S = "${UNPACKDIR}/viogpu3d-${PV}"

inherit allarch

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
	install -d ${D}${datadir}/viogpu3d
	install -m 0644 ${S}/drivers/viogpu3d/* ${D}${datadir}/viogpu3d/
}

FILES:${PN} = "${datadir}/viogpu3d"
