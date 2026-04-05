SUMMARY = "QR Code generator library"
HOMEPAGE = "https://github.com/nayuki/QR-Code-generator"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Readme.markdown;md5=2302d7e7d711345cc441b7eb593bbb95"

SRC_URI = "git://github.com/nayuki/QR-Code-generator;protocol=https;nobranch=1;name=qrcodegen"
SRC_URI += "git://github.com/EasyCoding/qrcodegen-cmake;protocol=https;name=qrcodegen-cmake;subdir=${S}/cmake;nobranch=1"
SRCREV_qrcodegen = "720f62bddb7226106071d4728c292cb1df519ceb"
SRCREV_qrcodegen-cmake = "53c28a05c2a97abacbcdb60924b2db7eb5779d89"
SRCREV_FORMAT = "qrcodegen"

inherit cmake

do_configure:prepend() {
	cp -rf ${S}/cmake/* ${S}
}

EXTRA_OECMAKE = " \
    -DCMAKE_BUILD_TYPE=None \
    -DBUILD_SHARED_LIBS=ON \
"
