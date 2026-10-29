SUMMARY = "yt-dlp is a feature-rich command-line audio/video downloader with support for thousands of sites"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"

inherit python_hatchling

SRC_URI += "git://github.com/yt-dlp/yt-dlp.git;protocol=https;nobranch=1;tag=2026.10.21"
SRCREV = "6ccd977303412151ee23352c6257dd658ffc1987"

RRECOMMENDS:${PN} += " \
	ejs \
	ffmpeg \
	python3-brotli \
	python3-certifi \
	python3-mutagen \
	python3-pycryptodomex \
	python3-requests \
	python3-urllib3 \
	python3-websockets \
"
RDEPENDS:${PN} = " \
	python3-asyncio \
	python3-compression \
	python3-core \
	python3-crypt \
	python3-ctypes \
	python3-datetime \
	python3-email \
	python3-html \
	python3-io \
	python3-json \
	python3-logging \
	python3-math \
	python3-mime \
	python3-misc \
	python3-netclient \
	python3-numbers \
	python3-shell \
	python3-sqlite3 \
	python3-stringold \
	python3-terminal \
	python3-unixadmin \
	python3-xml \
"
