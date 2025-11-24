FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://0001-libpyside-CMakeLists.txt-adjust-variables.patch"
