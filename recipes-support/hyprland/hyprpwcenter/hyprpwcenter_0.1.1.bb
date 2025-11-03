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

SRCREV = "fb8b44d49b9db36b973534b49dd7de696554137f"

inherit cmake pkgconfig

