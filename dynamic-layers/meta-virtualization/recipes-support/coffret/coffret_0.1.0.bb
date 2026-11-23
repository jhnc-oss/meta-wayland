SUMMARY = "Virtual machines in the style of the Noctalia desktop"
HOMEPAGE = "https://github.com/MarkusVolk/coffret"
LICENSE = "MIT AND (Apache-2.0 OR MIT) AND BSD-3-Clause"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=5cea96956976339e8b0ee437ca04d69f \
	file://lib/assets/fonts/tabler-icons-license.txt;md5=ed422355f685d767a7c19898a8afa7d9 \
	file://lib/third_party/wuffs/LICENSE-MIT;md5=a59c0e35aa9faf7527a90afb44114e50 \
	file://lib/third_party/wuffs/LICENSE-APACHE;md5=2ee41112a44fe7014dce33e26468ba93 \
	file://third_party/keycodemapdb/LICENSE.BSD;md5=5ae30ba4123bc4f2fa49aa0b0dce887b \
"

SRC_URI = "git://github.com/MarkusVolk/coffret.git;protocol=https;branch=main"
SRCREV = "6492daa5975d71a2545daa4745f9157903e2dca8"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
	wayland \
	wayland-native \
	wayland-protocols \
	virtual/egl \
	virtual/libgles2 \
	glib-2.0 \
	libvirt \
	libosinfo \
	pugixml \
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

inherit meson pkgconfig features_check

EXTRA_OEMESON += " \
	-Dtests=disabled \
	-Dbuild_revision=${SRCREV} \
"

FILES:${PN} += " \
	${datadir}/coffret \
	${datadir}/licenses \
	${datadir}/icons \
	${datadir}/polkit-1 \
"

RDEPENDS:${PN} += " \
	acl \
	libvirt-libvirtd \
	osinfo-db \
	passt \
	polkit \
	qemu-common \
	qemu-system-x86-64 \
	swtpm \
	virtiofsd \
	xorriso \
"

RRECOMMENDS:${PN} += "virtio-win-guest-tools viogpu3d-win"
