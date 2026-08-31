SUMMARY = "KDE Status Notifier Item Protocol Implementation"
HOMEPAGE = "https://invent.kde.org/frameworks/kstatusnotifieritem"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=e3e049b303846e4de3eeafccf035a404"

SRC_URI = "git://invent.kde.org/frameworks/kstatusnotifieritem.git;protocol=https;nobranch=1"
SRCREV = "e995a4320e563eb553cd169eb74aaf9d6293587b"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kwindowsystem \
	dbus \
	python3-shiboken6-generator-native \
	python3-pyside6 \
"

inherit qt6-cmake pkgconfig

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

EXTRA_OECMAKE += "-DWITHOUT_X11=ON"
FILES:${PN} += "${datadir} ${PYTHON_SITEPACKAGES_DIR}"
