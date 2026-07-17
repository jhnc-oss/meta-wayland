SUMMARY = "Converting physical units"
HOMEPAGE = "https://invent.kde.org/frameworks/kunitconversion"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kunitconversion.git;protocol=https;nobranch=1"
SRCREV = "e660dca5102456827719ef28aecf6fd703b8b265"

DEPENDS = " \
    clang-native \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    ki18n \
    python3-shiboken6-generator-native \
    python3-pyside6 \
"

inherit qt6-cmake gettext

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

replace_llvm_config_path() {
    if [ -f "${STAGING_BINDIR_CROSS}/llvm-config" ]; then
        sed -i \
            's#@LLVM_CONFIG_PATH@#${STAGING_BINDIR_NATIVE}/llvm-config#g' \
            ${STAGING_BINDIR_CROSS}/llvm-config
    fi
}

do_configure:prepend:class-target() {
    replace_llvm_config_path
}

do_configure:prepend:class-nativesdk() {
    replace_llvm_config_path
}

FILES:${PN} += "${libdir} ${datadir}/qlogging-categories6"
