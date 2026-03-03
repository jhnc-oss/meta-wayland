SUMMARY = "QuaZip is the C++ wrapper for Gilles Vollant's ZIP/UNZIP package (AKA Minizip) using Qt library"
HOMEPAGE = "https://github.com/stachenov/quazip"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=af67f05b2b6abf61e608dcfccb94b3e1"

DEPENDS = "qtbase qt5compat qttools-native zlib"

inherit qt6-cmake

SRC_URI = "git://github.com/stachenov/quazip.git;protocol=https;nobranch=1"
SRCREV = "3fd3b299b875fbd2beac4894b8a870d80022cad7"

EXTRA_OECMAKE = "-DBUILD_SHARED_LIBS=ON -DQUAZIP_BZIP2=OFF"

