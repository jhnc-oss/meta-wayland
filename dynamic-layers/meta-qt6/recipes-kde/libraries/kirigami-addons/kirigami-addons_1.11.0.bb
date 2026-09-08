SUMMARY = "Add-ons for the Kirigami framework"
HOMEPAGE = "https://invent.kde.org/libraries/kirigami-addons"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC-BY-SA-4.0 AND CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9 \
    file://LICENSES/BSD-3-Clause.txt;md5=71f739ef75581cae312e8c711bcdab16 \
    file://LICENSES/CC-BY-SA-4.0.txt;md5=7130783469368ceb248a4f03e89ea4b8 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-only.txt;md5=e3e049b303846e4de3eeafccf035a404 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=6a2eced623a7c9d0c8996ce24917d006 \
    file://LICENSES/MIT.txt;md5=e267b5203c8a34cf7f21e5a2102df564 \
"

SRC_URI = "git://invent.kde.org/libraries/kirigami-addons.git;protocol=https;nobranch=1;tag=v1.11.0"
SRCREV = "10ad7ec72702b6eddaab037e379f0df6aaddd310"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kirigami \
    ki18n \
    kconfig \
    kcoreaddons \
    kcrash \
    kguiaddons \
    kcolorscheme \
    kglobalaccel \
    kiconthemes \
"

inherit kf6 gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_EXAMPLES=OFF"

FILES:${PN} += "${libdir}/qml ${datadir}"

RDEPENDS:${PN} += "kirigami"
