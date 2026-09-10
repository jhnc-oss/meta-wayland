SUMMARY = "External JavaScript for yt-dlp supporting many runtimes"
HOMEPAGE = "https://github.com/yt-dlp/ejs"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Unlicense;md5=7246f848faa4e9c9fc0ea91122d6e680"

inherit python_pep517

SRC_URI = "https://github.com/yt-dlp/ejs/releases/download/${PV}/yt_dlp_ejs-${PV}-py3-none-any.whl"
SRC_URI[sha256sum] = "79300e5fca7f937a1eeede11f0456862c1b41107ce1d726871e0207424f4bdb4"

S = "${UNPACKDIR}"
PEP517_WHEEL_PATH = "${UNPACKDIR}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

RDEPENDS:${PN} = "quickjs"
