SUMMARY = "A minimal login greeter for greetd that matches the look and feel of Noctalia Shell"
HOMEPAGE = "https://github.com/noctalia-dev/noctalia-greeter"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5bd433caa90a88d62bd293dabc90f4a3"

DEPENDS = " \
	wayland \
	wayland-native \
	wayland-protocols \
	libxkbcommon \
	freetype \
	fontconfig \
	cairo \
	pango \
	librsvg \
	glib-2.0 \
	wlroots-0.20 \
	libinput \
	libwebp \
	tomlplusplus \
	nlohmann-json \
	stb \
	${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'virtual/egl virtual/libgles2', 'epoxy', d)} \
"

SRC_URI = "git://github.com/noctalia-dev/noctalia-greeter.git;protocol=https;branch=main;tag=v1.5.0"
SRC_URI += "file://0001-assets-buildpath.patch"
SRCREV = "5a450b891067c1f0cd7157f4f1091aa0e3014780"

inherit meson pkgconfig

FILES:${PN} += " \
	${datadir}/polkit-1/actions/org.noctalia.greeter.apply-appearance.policy \
	${nonarch_libdir}/tmpfiles.d \
"

RDEPENDS:${PN} += "greetd"
