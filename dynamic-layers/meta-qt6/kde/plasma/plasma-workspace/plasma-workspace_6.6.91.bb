SUMMARY = "Plasma Workspace is used as the base for Plasma Desktop, Mobile, and Bigscreen"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-workspace"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c"

SRC_URI = "git://invent.kde.org/plasma/plasma-workspace.git;protocol=https;nobranch=1"
SRCREV = "8abf204eb80760696e2c770364acf67bc70026b1"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    flatpak \
    pipewire \
    karchive \
    kauth \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    kwindowsystem \
    kdeclarative \
    kglobalaccel \
    kguiaddons \
    kholidays \
    ki18n \
    kiconthemes \
    kidletime \
    kitemmodels \
    kcmutils \
    kcmutils-tools-native \
    kded \
    kio \
    knewstuff \
    knotifications \
    kconfig \
    kconfig-native \
    kpackage \
    kparts \
    prison \
    krunner \
    kstatusnotifieritem \
    ksvg \
    ktexteditor \
    ktextwidgets \
    kwallet \
    kcolorscheme \
    plasma-activities \
    libplasma \
    kwayland \
    kwin \
    kirigami \
    networkmanager-qt \
    kquickcharts \
    libqalculate \
    systemd \
    libcanberra \
    breeze \
    zlib \
    freetype \
    fontconfig \
    plasma-wayland-protocols \
    wayland \
    wayland-native \
    icu \
    polkit-qt \
    kio-fuse \
    knighttime \
    qtquick3d \
    qcoro \
    kscreen \
    layer-shell-qt \
"

inherit qt6-cmake gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DWITH_X11=OFF"

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_BINDIR}/kpackagetool6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kcmdesktopfilegenerator ${STAGING_LIBEXECDIR}/kf6/kcmdesktopfilegenerator
}

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
