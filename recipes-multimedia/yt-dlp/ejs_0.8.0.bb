SUMMARY = "External JavaScript for yt-dlp supporting many runtimes"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f4c62131f879a8445e16a7f265aea635"

inherit python_hatchling

DEPENDS = "hatch-vcs-native nodejs-native"

SRC_URI += "git://github.com/yt-dlp/ejs.git;protocol=https;nobranch=1"
SRCREV = "4fb477f4af56880cfd324c48bd4294a2d2294e50"

RDEPENDS:${PN} = "nodejs"

# avoid 'npm error request to https://registry.npmjs.org/yocto-queue/-/yocto-queue-0.1.0.tgz failed'
do_compile[network] = "1"
