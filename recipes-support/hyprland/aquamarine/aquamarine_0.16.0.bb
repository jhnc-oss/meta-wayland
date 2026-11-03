SUMMARY = "Aquamarine is a very light linux rendering backend library"
HOMEPAGE = "https:/github.com/hyprwm/aquamarine"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = " \
    hwdata \
    hyprutils \
    hyprwayland-scanner-native \
    libdrm \
    libdisplay-info \
    libinput \
    seatd \
    pixman \
    virtual/egl \
    virtual/libgbm \
    virtual/libgles3 \
    wayland \
    wayland-native \
    wayland-protocols \
"

SRC_URI = "git://github.com/hyprwm/aquamarine.git;protocol=https;branch=main;tag=v${PV}"
SRCREV = "b77d67648336223a6c8fb88844ae316e7b72b574"

inherit cmake pkgconfig
