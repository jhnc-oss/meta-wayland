SUMMARY = "Classes to read and interact with KColorScheme"
HOMEPAGE = "https://api.kde.org/frameworks/kcolorscheme/html/index.html"
LICENSE = "BSD-2-Clause AND CC-BY-SA-4.0 AND CC0-1.0 AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=d0f280d1058e77e66264a9b9e10e6c89 \
    file://LICENSES/CC-BY-SA-4.0.txt;md5=7130783469368ceb248a4f03e89ea4b8 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=e3e049b303846e4de3eeafccf035a404 \
    file://LICENSES/LGPL-2.1-only.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/LGPL-3.0-only.txt;md5=852ecadc0ac7e6f4d7144d5544a3815b \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/frameworks/kcolorscheme.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "c88bf7184bbae0f819b01ae65ef1b85f3003ba01"

DEPENDS = " \
	appstream-native \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	ki18n \
	kguiaddons \
"

inherit kf6 gettext pkgconfig

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
