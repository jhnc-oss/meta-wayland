SUMMARY = "raylib is a simple and easy-to-use library to enjoy videogames programming"
HOMEPAGE = "https://github.com/raysan5/raylib"
LICENSE = "zlib-acknowledgement"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4f718fed396a1bda683c98481e5b57a8"

DEPENDS = "glfw xext"

SRC_URI = "git://github.com/raysan5/raylib.git;protocol=https;nobranch=1"
SRCREV = "dbc56a87da87d973a9c5baa4e7438a9d20121d28"

inherit cmake

EXTRA_OECMAKE += "-DBUILD_SHARED_LIBS=ON"
