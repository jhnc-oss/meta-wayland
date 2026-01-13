SUMMARY = "The Clipboard Project is a fast, lightweight and user friendly tool that lets you do more on the computer in style"
HOMEPAGE = "https://github.com/Slackadays/Clipboard"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += " \
    alsa-lib \
    openssl \
    wayland \
    wayland-native \
    wayland-protocols \
"

SRC_URI = "git://github.com/Slackadays/Clipboard.git;protocol=https;branch=main"

SRCREV = "3a0ecd13f8cde269b8fa27f583f2fd5a873528d8"

inherit cmake pkgconfig bash-completion

EXTRA_OECMAKE += "-DMSVC=ON -DCMAKE_BUILD_TYPE=Debug"

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = ",-DNO_X11=ON,libx11"

FILES:${PN} += "${libdir}/libcbx11.so ${libdir}/libcbwayland.so"
FILES:${PN}-dev = ""
