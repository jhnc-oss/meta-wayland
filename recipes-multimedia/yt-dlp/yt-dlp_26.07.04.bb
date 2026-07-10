SUMMARY = "yt-dlp is a feature-rich command-line audio/video downloader with support for thousands of sites"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"

inherit python_hatchling

SRC_URI += "git://github.com/yt-dlp/yt-dlp.git;protocol=https;nobranch=1"
SRCREV = "fdec00e0bf530dc6c3cc7b1dd780e95d9ae460e9"

RRECOMMENDS:${PN} += "ejs ffmpeg"
RDEPENDS:${PN} = " \
	brotli \
	curl \
	python3-brotli \
	python3-certifi \
	python3-cffi \
	python3-chardet \
	python3-charset-normalizer \
	python3-cryptography \
	python3-pycryptodomex \
	python3-pycurl \
	python3-idna \
	python3-markdown-it-py \
	python3-mdurl \
	python3-mutagen \
	python3-pycparser \
	python3-pygments \
	python3-requests \
	python3-rich \
	python3-typing-extensions \
	python3-urllib3 \
	python3-websockets \
"
