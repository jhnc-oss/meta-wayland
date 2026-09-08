SUMMARY = "A barcode abstraction layer providing uniform access to generation of barcodes with data"
HOMEPAGE = "https://invent.kde.org/frameworks/prison"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/frameworks/prison.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "5041d509f69b9db76bfd402782f7cf0b630ae55d"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    qtquick3d \
    qtmultimedia \
    qrencode \
    libdmtx \
"

EXTRA_OECMAKE += "-DWITH_ZXING=OFF"

inherit qt6-cmake gettext

FILES:${PN} += "${libdir}/qml ${datadir}"


