SUMMARY = "Small and embeddable JavaScript engine"
HOMEPAGE = "https://github.com/quickjs-ng/quickjs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7d9f1f9af65f3cca7f8bcc065cc4c4e3"

SRC_URI = "git://github.com/quickjs-ng/quickjs.git;protocol=https;branch=master;tag=v${PV}"
SRCREV = "6d46d07d04041b40f4f49eaa7fdebe44c314c699"

inherit cmake

EXTRA_OECMAKE = " \
    -DBUILD_SHARED_LIBS=ON \
    -DQJS_BUILD_EXAMPLES=OFF \
"

PACKAGES =+ "${PN}-compiler"

FILES:${PN}-compiler = "${bindir}/qjsc"

BBCLASSEXTEND = "native nativesdk"
