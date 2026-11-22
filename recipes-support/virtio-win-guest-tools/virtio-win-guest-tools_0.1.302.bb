SUMMARY = "virtio drivers, SPICE agent and QEMU guest agent for Windows guests"
HOMEPAGE = "https://github.com/virtio-win/virtio-win-pkg-scripts"
LICENSE = "MS-RL & GPL-2.0-only & Apache-2.0"
LIC_FILES_CHKSUM = " \
	file://${COMMON_LICENSE_DIR}/MS-RL;md5=3535ded4dbb8b9b8c08d529cfd963c83 \
	file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6 \
	file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10 \
"

SRC_URI = "https://fedorapeople.org/groups/virt/virtio-win/direct-downloads/archive-virtio/virtio-win-${PV}-1/virtio-win-guest-tools.exe;unpack=0"
SRC_URI[sha256sum] = "d8ae9ea1e943384ac195e012cd36f82c3161620e5fc9529be4e42e6f420e222d"

UPSTREAM_CHECK_URI = "https://fedorapeople.org/groups/virt/virtio-win/direct-downloads/archive-virtio/"
UPSTREAM_CHECK_REGEX = "virtio-win-(?P<pver>\d+(\.\d+)+)-1/"

inherit allarch

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
	install -Dm 0644 ${UNPACKDIR}/virtio-win-guest-tools.exe ${D}${datadir}/virtio-win/virtio-win-guest-tools.exe
}

FILES:${PN} = "${datadir}/virtio-win"
