SUMMARY = "A barcode abstraction layer providing uniform access to generation of barcodes with data"
HOMEPAGE = "https://invent.kde.org/frameworks/prison"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/prison.git;protocol=https;nobranch=1"
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


