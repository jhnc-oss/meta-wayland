SUMMARY = "Tools based on KDE Frameworks to better interact with the system"
HOMEPAGE = "https://invent.kde.org/plasma/kde-cli-tools"
LICENSE = "Artistic-2.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/Artistic-2.0.txt;md5=7f086b1df814d268c59965d8db41f13c \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/plasma/kde-cli-tools.git;protocol=https;nobranch=1;tag=v6.7.4"
SRCREV = "27ddf92e73f8b13168f2f0b6da131801ec179cd7"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtsvg \
    extra-cmake-modules \
    kconfig \
    kiconthemes \
    ki18n \
    kcmutils \
    kio \
    kservice \
    kwindowsystem \
    kparts \
    kcoreaddons \
    kdesu \
    kwidgetsaddons \
"

inherit kf6 gettext mime-xdg

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DWITH_X11=ON,-DWITH_X11=OFF,libx11"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_DOC=OFF"

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig"
