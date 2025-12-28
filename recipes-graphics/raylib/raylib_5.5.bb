SUMMARY = "raylib is a simple and easy-to-use library to enjoy videogames programming"
HOMEPAGE = "https://github.com/raysan5/raylib"
LICENSE = "zlib-acknowledgement"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5c04526673eda16f837e05cb1177261"

DEPENDS = "glfw"

SRC_URI = "git://github.com/raysan5/raylib.git;protocol=https;nobranch=1"
SRCREV = "c1ab645ca298a2801097931d1079b10ff7eb9df8"

inherit cmake
