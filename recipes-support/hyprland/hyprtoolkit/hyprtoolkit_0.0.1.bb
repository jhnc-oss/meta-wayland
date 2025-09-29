SUMMARY = "A modern C++ Wayland-native GUI toolkit"
HOMEPAGE = "https:/github.com/hyprwm/hyprtoolkit"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = " \
  aquamarine \
  hyprgraphics \
  hyprlang \
  hyprutils \
  hyprwayland-scanner-native \
  libdrm \
  libxkbcommon \
  pango \
  pixman \
  virtual/egl \
  virtual/libgbm \
  virtual/libgles3 \
  wayland \
  wayland-protocols \
 "

SRC_URI = "git://github.com/hyprwm/hyprtoolkit.git;protocol=https;branch=main"
SRC_URI += "file://0001-CMakeLists.txt-fix-linking-with-opengl.patch"

SRCREV = "fb6892c513470ee8b5e61e0b2c21f5876d013ddb"

inherit cmake pkgconfig
