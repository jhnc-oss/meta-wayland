SUMMARY = "Native Wayland file manager using Noctalia rendering and controls"
HOMEPAGE = "https://github.com/noctalia-dev/luciole"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=5bd433caa90a88d62bd293dabc90f4a3 \
	file://lib/assets/fonts/tabler-icons-license.txt;md5=ed422355f685d767a7c19898a8afa7d9 \
"

SRC_URI = " \
	git://github.com/noctalia-dev/luciole.git;protocol=https;branch=main \
	file://0001-build-prefix-the-GLib-isystem-path-with-the-cross-sys_root.patch \
"
SRCREV = "601df8b37529693945bf7fb4d48848b7ca8a2783"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
	wayland \
	wayland-native \
	wayland-protocols \
	virtual/egl \
	virtual/libgles2 \
	glib-2.0 \
	curl \
	libxml2 \
	gdk-pixbuf \
	librsvg \
	libpng \
	libarchive \
	xz \
	acl \
	freetype \
	fontconfig \
	cairo \
	pango \
	harfbuzz \
	libxkbcommon \
	stb \
	tomlplusplus \
	nlohmann-json \
"

inherit meson pkgconfig features_check mime-xdg bash-completion

EXTRA_OEMESON += " \
	-Dtests=disabled \
	-Dwerror=false \
	-Dbuild_revision=${SRCREV} \
"

FILES:${PN} += " \
	${datadir}/dbus-1 \
	${datadir}/xdg-desktop-portal \
	${datadir}/luciole \
	${datadir}/licenses \
	${datadir}/zsh \
	${datadir}/fish \
	${datadir}/icons \
"

RDEPENDS:${PN} += " \
	gvfs \
	gvfsd-trash \
	shared-mime-info \
	gsettings-desktop-schemas \
	dconf \
"

RRECOMMENDS:${PN} += " \
	glib-networking \
	gvfsd-sftp \
	ffmpeg \
	poppler \
	7zip \
	xdg-terminal-exec \
"
