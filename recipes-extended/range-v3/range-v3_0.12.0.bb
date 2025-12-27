SUMMARY = "Range library for C++14/17/20"
HOMEPAGE = "https://github.com/ericniebler/range-v3"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit cmake pkgconfig

SRC_URI = "git://github.com/ericniebler/range-v3.git;protocol=https;branch=master"
SRCREV = "a81477931a8aa2ad025c6bda0609f38e09e4d7ec"

CXXFLAGS += "-Wno-maybe-uninitialized"
