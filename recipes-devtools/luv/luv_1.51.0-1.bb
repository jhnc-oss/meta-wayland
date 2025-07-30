SUMMARY = "libuv bindings for luajit and lua 5.1/ 5.2/ 5.3/ 5.4"
HOMEPAGE = "https://github.com/luvit/luv"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "gitsm://github.com/luvit/luv.git;protocol=https;branch=master"
SRCREV = "4c9fbc6cf6f3338bb0e0426710cf885ee557b540"

DEPENDS = "luajit-native libuv"

inherit cmake

EXTRA_OECMAKE = " \
	-DBUILD_SHARED_LIBS=ON \
	-DWITH_SHARED_LIBUV=ON \
	-DBUILD_MODULE=OFF \
	-DLUA_BUILD_TYPE=System \
	-DWITH_LUA_ENGINE=LuaJIT \
	-DLUA_COMPAT53_DIR=${S}/deps/lua-compat-5.3 \
"
