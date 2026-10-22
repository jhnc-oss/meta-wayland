SUMMARY = "yt-dlp is a feature-rich command-line audio/video downloader with support for thousands of sites"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"

inherit python_hatchling

SRC_URI += "git://github.com/yt-dlp/yt-dlp.git;protocol=https;nobranch=1;tag=2026.10.21"
SRCREV = "6ccd977303412151ee23352c6257dd658ffc1987"

RRECOMMENDS:${PN} += "ejs ffmpeg"
RDEPENDS:${PN} = " \
	brotli \
	curl \
	python3-asyncio \
	python3-brotli \
	python3-certifi \
	python3-chardet \
	python3-charset-normalizer \
	python3-compression \
	python3-core \
	python3-crypt \
	python3-ctypes \
	python3-datetime \
	python3-email \
	python3-html \
	python3-idna \
	python3-io \
	python3-json \
	python3-logging \
	python3-markdown-it-py \
	python3-math \
	python3-mdurl \
	python3-mime \
	python3-misc \
	python3-mutagen \
	python3-netclient \
	python3-numbers \
	python3-pycparser \
	python3-pycryptodomex \
	python3-pycurl \
	python3-pygments \
	python3-requests \
	python3-rich \
	python3-shell \
	python3-sqlite3 \
	python3-stringold \
	python3-terminal \
	python3-typing-extensions \
	python3-unixadmin \
	python3-urllib3 \
	python3-websockets \
	python3-xml \
"
