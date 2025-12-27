SUMMARY = "Ueberzug++ is a command line utility which allows to draw images on terminals"
HOMEPAGE = "https://github.com/jstkdng/ueberzugpp"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit cmake pkgconfig

SRC_URI = "git://github.com/jstkdng/ueberzugpp.git;protocol=https;branch=master"
SRCREV = "c1c76e34bac97403ed3f2f403fcf96b5cfd0b914"

DEPENDS = "openssl cli11 fmt spdlog range-v3 libvips libsixel extra-cmake-modules chafa nlohmann-json"

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'wayland x11 dbus', d)} opencv"
PACKAGECONFIG[x11] = "-DENABLE_X11=ON -DENABLE_XCB_ERRORS=ON,-DENABLE_X11=OFF -DENABLE_XCB_ERRORS=OFF,libx11 libxcb xcb-util-image xcb-util-errors"
PACKAGECONFIG[wayland] = "-DENABLE_WAYLAND=ON,-DENABLE_WAYLAND=OFF,wayland wayland-native"
PACKAGECONFIG[opencv] = "-DENABLE_OPENCV=ON,-DENABLE_OPENCV=OFF,opencv"
PACKAGECONFIG[dbus] = "-DENABLE_DBUS=ON,-DENABLE_DBUS=OFF,dbus"


