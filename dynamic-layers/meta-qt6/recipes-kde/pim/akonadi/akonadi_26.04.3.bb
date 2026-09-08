SUMMARY = "PIM storage service"
HOMEPAGE = "https://invent.kde.org/pim/akonadi"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LicenseRef-KDE-Accepted-GPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GPL-2.0-only.txt;md5=5430828348d2cf7d4b5e8395f774a68e \
    file://LICENSES/GPL-2.0-or-later.txt;md5=261bea1168c0bdfa73232ee90df11eb6 \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
    file://LICENSES/Qt-LGPL-exception-1.1.txt;md5=38d22f987f077611a625f5729dd0fd39 \
"

SRC_URI = "git://invent.kde.org/pim/akonadi.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "abce26025bee1e43c724363ec0d190a1aed432e1"
SRC_URI += "file://0001-protocolgen-support-standalone-build-and-cross-compiling.patch"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    ki18n \
    kiconthemes \
    kitemmodels \
    kwidgetsaddons \
    kxmlgui \
    kcrash \
    kcolorscheme \
    qtdeclarative \
    shared-mime-info \
    xz \
    libxslt-native \
    akonadi-protocolgen-native \
    sqlite3 \
"

inherit kf6 gettext pkgconfig mime

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DDATABASE_BACKEND=SQLITE -DBUILD_DESIGNERPLUGIN=OFF -DINSTALL_APPARMOR=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${systemd_user_unitdir} ${datadir}"

RDEPENDS:${PN} += "qtbase-plugins shared-mime-info"

do_install:append() {
	sed -i 's|#include "${S}/|#include "|' ${B}/src/core/notificationsourceinterface.h
}
