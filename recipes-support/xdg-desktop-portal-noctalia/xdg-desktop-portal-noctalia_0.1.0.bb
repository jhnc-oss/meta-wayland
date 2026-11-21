SUMMARY = "xdg-desktop-portal backend for the Noctalia desktop, without GTK or Qt"
HOMEPAGE = "https://github.com/MarkusVolk/xdg-desktop-portal-noctalia"
LICENSE = "MIT AND (Apache-2.0 OR MIT)"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=5cea96956976339e8b0ee437ca04d69f \
	file://lib/assets/fonts/tabler-icons-license.txt;md5=ed422355f685d767a7c19898a8afa7d9 \
	file://lib/third_party/wuffs/LICENSE-MIT;md5=a59c0e35aa9faf7527a90afb44114e50 \
	file://lib/third_party/wuffs/LICENSE-APACHE;md5=2ee41112a44fe7014dce33e26468ba93 \
"

SRC_URI = "git://github.com/MarkusVolk/xdg-desktop-portal-noctalia.git;protocol=https;branch=main"
SRCREV = "c125b0cee1ef3d9d98226fee02bea029907e6340"

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
	librsvg \
	libwebp \
	libjxl \
	cups \
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
