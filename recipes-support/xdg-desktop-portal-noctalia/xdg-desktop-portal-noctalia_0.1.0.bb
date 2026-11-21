SUMMARY = "xdg-desktop-portal backend for the Noctalia desktop, without GTK or Qt"
HOMEPAGE = "https://github.com/MarkusVolk/xdg-desktop-portal-noctalia"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=5cea96956976339e8b0ee437ca04d69f \
	file://lib/assets/fonts/tabler-icons-license.txt;md5=ed422355f685d767a7c19898a8afa7d9 \
"

SRC_URI = "git://github.com/MarkusVolk/xdg-desktop-portal-noctalia.git;protocol=https;branch=main"
SRCREV = "9adc61ed4479568cc8267e8f34990c646aac064e"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
	glib-2.0 \
	nlohmann-json \
	wayland \
	wayland-native \
	wayland-protocols \
	virtual/egl \
	virtual/libgles2 \
	freetype \
	fontconfig \
	cairo \
	pango \
	harfbuzz \
	libxkbcommon \
	stb \
	tomlplusplus \
"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "-Dtests=false"

FILES:${PN} += " \
	${datadir}/xdg-desktop-portal \
	${datadir}/dbus-1 \
	${datadir}/xdg-desktop-portal-noctalia \
	${systemd_user_unitdir} \
"

RDEPENDS:${PN} += " \
	gsettings-desktop-schemas \
	xdg-desktop-portal \
"
