SUMMARY = "A modern C++ Wayland-native GUI toolkit"
HOMEPAGE = "https:/github.com/hyprwm/hyprtoolkit"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = " \
  aquamarine \
  cairo \
  hyprgraphics \
  hyprlang \
  hyprutils \
  hyprwayland-scanner-native \
  iniparser \
  libdrm \
  libxkbcommon \
  pango \
  pixman \
  virtual/egl \
  virtual/libgbm \
  virtual/libgles3 \
  wayland \
  wayland-native \
  wayland-protocols \
 "

SRC_URI = "git://github.com/hyprwm/hyprtoolkit.git;protocol=https;branch=main"
SRC_URI += "file://0001-CMakeLists.txt-fix-linking-with-opengl.patch"

SRCREV = "d4f41571373e7dbe299410a89e921c41786b9c92"

inherit cmake pkgconfig


PACKAGECONFIG ?= ""
PACKAGECONFIG[tests] = ",-DDISABLE_TESTS=ON,gtest"
