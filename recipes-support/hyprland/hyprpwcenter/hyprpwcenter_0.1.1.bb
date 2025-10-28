SUMMARY = "A GUI Pipewire control center built with hyprtoolkit"
HOMEPAGE = "https:/github.com/hyprwm/hyprpwcenter"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = " \
  pipewire \
  hyprtoolkit \
  pixman \
  libdrm \
  hyprutils \
 "

SRC_URI = "git://github.com/hyprwm/hyprpwcenter.git;protocol=https;branch=main"

SRCREV = "28703ffc0db1364e21ace263935fe07cf4ebeb11"

inherit cmake pkgconfig

