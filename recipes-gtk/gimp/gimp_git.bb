SUMMARY = "The GIMP is the GNU Image Manipulation Program"
HOMEPAGE = "http://www.gimp.org"
SECTION = "graphics"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=c678957b0c8e964aa6c70fd77641a71e"

DEPENDS = " \
    appstream-glib \
    atk \
    babl \
    bzip2 \
    bison-native \
    cairo \
    dbus-glib \
    fontconfig \
    freetype \
    gdk-pixbuf-native \
    gegl \
    gexiv2 \
    gtk+3 \
    harfbuzz \
    json-glib \
    lcms \
    libarchive \
    libexif \
    libmypaint \
    libpng \
    libxmu \
    libxslt-native \
    mypaint-brushes-1.0 \
    pango \
    poppler \
    poppler-data \
    python3-pygobject-native \
"

DEPENDS:append:libc-musl = " libexecinfo"
RDEPENDS:${PN} = "mypaint-brushes-1.0 glib-networking python3-pygobject"

inherit meson gtk-icon-cache mime-xdg pkgconfig gettext gobject-introspection vala

GIR_MESON_OPTION = 'can-crosscompile-gir'
VALA_MESON_OPTION = "vala"
VALA_MESON_ENABLE_FLAG = "enabled"
VALA_MESON_DISABLE_FLAG = "disabled"
GIDOCGEN_MESON_OPTION = "gi-docgen"
GIDOCGEN_MESON_ENABLE_FLAG = "enabled"
GIDOCGEN_MESON_DISABLE_FLAG = "disabled"

SRC_URI = "gitsm://github.com/GNOME/gimp.git;protocol=https;branch=master"
SRC_URI += "file://0001-gimp-cross-compile-fix-for-bz2.patch"
S = "${WORKDIR}/git"
SRCREV = "d52117a7f753353b5f900d8195a2443c603d6c94"
PV = "3.0.0-RC-2"

PACKAGECONFIG[aa] = "-Daa=enabled,-Daa=disabled,aalib"
PACKAGECONFIG[alsa] = "-Dalsa=enabled,-Dalsa=disabled,alsa-lib"
PACKAGECONFIG[appdata-test] = "-Dappdata-test=enabled,-Dappdata-test=disabled,appstream-glib-native"
PACKAGECONFIG[cairo-pdf] = "-Dcairo-pdf=enabled,-Dcairo-pdf=disabled"
PACKAGECONFIG[check-update] = "-Dcheck-update=yes,-Dcheck-update=no"
PACKAGECONFIG[ghostscript] = "-Dghostscript=enabled,-Dghostscript=disabled,ghostscript,ghostscript"
PACKAGECONFIG[gudev] = "-Dgudev=enabled,-Dgudev=disabled,libgudev"
PACKAGECONFIG[iso-codes] = ",,iso-codes"
PACKAGECONFIG[javascript] = "-Djavascript=enabled,-Djavascript=disabled,,gjs"
PACKAGECONFIG[jpeg2000] = "-Djpeg2000=enabled,-Djpeg2000=disabled,jasper"
PACKAGECONFIG[jpeg] = ",,jpeg"
PACKAGECONFIG[jpeg-xl] = ",,libjxl"
PACKAGECONFIG[libunwind] = ",,libunwind"
PACKAGECONFIG[libbacktrace] = ",,libbacktrace"
PACKAGECONFIG[lua] = "-Dlua=true,-Dlua=false,,luajit lua-lgi"
PACKAGECONFIG[lzma] = ",,xz"
PACKAGECONFIG[mng] = "-Dmng=enabled,-Dmng=disabled,libmng"
PACKAGECONFIG[rsvg] = ",,librsvg-native librsvg"
PACKAGECONFIG[tiff] = ",,tiff"
PACKAGECONFIG[vector-icons] = "-Dvector-icons=true,-Dvector-icons=false,librsvg shared-mime-info"
PACKAGECONFIG[webp] = "-Dwebp=enabled,-Dwebp=disabled,libwebp"
PACKAGECONFIG[xcursor] = "-Dxcursor=enabled,-Dxcursor=disabled,libxcursor"
PACKAGECONFIG[x11] = "-Dxpm=enabled,-Dxpm=disabled,libxpm libxext libxfixes"
PACKAGECONFIG[zlib] = ",,zlib"

PACKAGECONFIG ?= " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11 xcursor', '', d)} \
    aa \
    alsa \
    cairo-pdf \
    ghostscript \
    gudev \
    javascript \
    jpeg \
    jpeg2000 \
    jpeg-xl \
    lua \
    lzma \
    mng \
    rsvg \
    tiff \
    vector-icons \
    webp \
    zlib \
"

PACKAGECONFIG:remove:riscv32 = "lua"
PACKAGECONFIG:remove:riscv64 = "lua"
PACKAGECONFIG:remove:powerpc64 = "lua"
PACKAGECONFIG:remove:powerpc64le = "lua"

FILES:${PN} += "${datadir}/metainfo"

EXTRA_OEMESON += " \
    -Dshmem-type=posix \
    -Dlinux-input=enabled \
    --buildtype release \
    --cross-file=${WORKDIR}/meson-${PN}.cross \
"

do_write_config:append() {
    cat >${WORKDIR}/meson-${PN}.cross <<EOF
[binaries]
gjs = '${bindir}/gjs'
luajit = '${bindir}/luajit'
EOF
}

do_configure:append () {
    sed -i -e "s|${RECIPE_SYSROOT_NATIVE}||" ${B}/config.h
    sed -i -e "s|${RECIPE_SYSROOT_NATIVE}||" ${B}/config.h
}

do_install:prepend() {
    sed -i -e "s|${B}||" ${B}/app/widgets/gimplanguagestore-data.h
    sed -i -e "s|${B}||" ${B}/plug-ins/file-bmp/huffman.h
}
