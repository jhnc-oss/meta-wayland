SUMMARY = "Store for Flatpak apps in the style of the Noctalia desktop"
HOMEPAGE = "https://github.com/MarkusVolk/etal"
LICENSE = "MIT AND (Apache-2.0 OR MIT)"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=5cea96956976339e8b0ee437ca04d69f \
	file://lib/assets/fonts/tabler-icons-license.txt;md5=ed422355f685d767a7c19898a8afa7d9 \
	file://lib/third_party/wuffs/LICENSE-MIT;md5=a59c0e35aa9faf7527a90afb44114e50 \
	file://lib/third_party/wuffs/LICENSE-APACHE;md5=2ee41112a44fe7014dce33e26468ba93 \
"

SRC_URI = "git://github.com/MarkusVolk/etal.git;protocol=https;branch=main"
SRCREV = "8f364921ad487acad04fba4eafedc7ba5d746dcb"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
	wayland \
	wayland-native \
	wayland-protocols \
	virtual/egl \
	virtual/libgles2 \
	glib-2.0 \
	flatpak \
	appstream \
	curl \
	freetype \
	fontconfig \
	cairo \
	pango \
	harfbuzz \
	libxkbcommon \
	stb \
	tomlplusplus \
	nlohmann-json \
	librsvg \
	libwebp \
	libjxl \
"

inherit meson pkgconfig features_check mime-xdg

EXTRA_OEMESON += " \
	-Dtests=disabled \
	-Dbuild_revision=${SRCREV} \
"

FILES:${PN} += " \
	${datadir}/etal \
	${datadir}/licenses \
	${datadir}/icons \
	${systemd_user_unitdir} \
"

RDEPENDS:${PN} += "flatpak"
