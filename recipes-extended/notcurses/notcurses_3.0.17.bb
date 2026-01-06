SUMMARY = "Notcurses: blingful TUIs and character graphics"
HOMEPAGE = "https://github.com/dankamongmen/notcurses"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=9d4fc1f864192e96250fc5464c06737e"

inherit cmake pkgconfig

SRC_URI = "git://github.com/dankamongmen/notcurses.git;protocol=https;branch=master"
SRCREV = "77672788db0765ab868abafebbaadd8cfe133781"

DEPENDS = "libffi libdeflate gpm zlib libunistring"
DEPENDS += "${@bb.utils.contains('LICENSE_FLAGS_ACCEPTED', 'commercial', 'ffmpeg', '', d)}"

EXTRA_OECMAKE = "-DUSE_DOCTEST=OFF -DUSE_PANDOC=OFF"
