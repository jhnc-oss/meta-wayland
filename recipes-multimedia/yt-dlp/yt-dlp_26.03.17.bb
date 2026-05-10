SUMMARY = "yt-dlp is a feature-rich command-line audio/video downloader with support for thousands of sites"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"

inherit python_hatchling

SRC_URI += "git://github.com/yt-dlp/yt-dlp.git;protocol=https;nobranch=1"
SRCREV = "7fd74d10097833ebce0cb162e0ccf7825de9b768"

RRECOMMENDS:${PN} += "ejs ffmpeg"
