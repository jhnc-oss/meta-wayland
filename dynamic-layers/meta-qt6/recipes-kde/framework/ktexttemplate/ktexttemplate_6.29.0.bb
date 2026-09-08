SUMMARY = "String template engine with Django like syntax"
HOMEPAGE = "https://invent.kde.org/frameworks/ktexttemplate"
LICENSE = "BSD-2-Clause AND CC0-1.0 AND LGPL-2.0-or-later AND LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=d0f280d1058e77e66264a9b9e10e6c89 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
"

SRC_URI = "git://invent.kde.org/frameworks/ktexttemplate.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "47d30d141049c094125cb2b874756c2b92faccf3"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    qtdeclarative \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
