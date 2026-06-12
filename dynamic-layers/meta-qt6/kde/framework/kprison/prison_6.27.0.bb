SUMMARY = "A barcode abstraction layer providing uniform access to generation of barcodes with data"
HOMEPAGE = "https://invent.kde.org/frameworks/prison"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/prison.git;protocol=https;nobranch=1"
SRCREV = "db4e7602e3e9e566f6ba65d880d5fed4cac9ad1d"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    qtquick3d \
    qtmultimedia \
    qrencode \
    libdmtx \
"

inherit qt6-cmake gettext

FILES:${PN} += "${libdir}/qml ${datadir}"


