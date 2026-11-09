SUMMARY = "Scanner Access Now Easy - backends and scanimage"
HOMEPAGE = "http://www.sane-project.org/"
LICENSE = "GPL-2.0-or-later AND GPL-2.0-or-later WITH SANE-exception"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSE;md5=c5c0f16c05b412905646291e1ba88b68 \
"

SRC_URI = " \
    https://gitlab.com/-/project/429008/uploads/843c156420e211859e974f78f64c3ea3/${BP}.tar.gz \
    file://0001-escl-don-t-fclose-NULL-file.patch \
    file://0002-escl-Fix-scanning-with-LaserJet-Pro-MFP-M227fdn.patch \
    file://0003-escl-map-HTTP-responses-to-SANE-status.patch \
"
SRC_URI[sha256sum] = "f99205c903dfe2fb8990f0c531232c9a00ec9c2c66ac7cb0ce50b4af9f407a72"

UPSTREAM_CHECK_URI = "https://gitlab.com/sane-project/backends/-/releases"
UPSTREAM_CHECK_REGEX = "releases/(?P<pver>\d+(\.\d+)+)"

DEPENDS = "autoconf-archive-native"

inherit autotools pkgconfig gettext

PACKAGECONFIG ??= " \
    avahi \
    curl \
    jpeg \
    png \
    tiff \
    usb \
    xml \
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
"
PACKAGECONFIG[avahi] = "--with-avahi,--without-avahi,avahi"
PACKAGECONFIG[curl] = "--with-libcurl,--without-libcurl,curl"
PACKAGECONFIG[jpeg] = ",,jpeg"
PACKAGECONFIG[png] = ",,libpng"
PACKAGECONFIG[tiff] = ",,tiff"
PACKAGECONFIG[usb] = "--with-usb,--without-usb,libusb1"
PACKAGECONFIG[xml] = "--with-usb-record-replay,--without-usb-record-replay,libxml2"
PACKAGECONFIG[systemd] = "--with-systemd,--without-systemd,systemd"

EXTRA_OECONF += " \
    --disable-locking \
    --without-gphoto2 \
    --without-v4l \
    --without-snmp \
    --without-poppler-glib \
"

do_configure:append() {
    sed -i 's/^\(SUBDIRS = .*\) doc /\1 /' ${B}/Makefile
}

python populate_packages:prepend() {
    def add_conf(f, pkg, file_regex, output_pattern, modulename):
        conf = d.expand('${sysconfdir}/sane.d/%s.conf' % modulename)
        if os.path.exists(d.getVar('PKGD') + conf) and conf not in (d.getVar('FILES:' + pkg) or ''):
            d.appendVar('FILES:' + pkg, ' ' + conf)
            d.appendVar('CONFFILES:' + pkg, ' ' + conf)

    do_split_packages(d, d.expand('${libdir}/sane'), r'^libsane-((?!dll\.).*)\.so\..*', 'sane-backends-%s', 'SANE backend for %s', extra_depends='', allow_links=True, hook=add_conf)
}

PACKAGES_DYNAMIC += "^sane-backends-.*"
PACKAGES =+ "${PN}-saned ${PN}-tools"

FILES:${PN}-saned = "${sbindir}/saned"
FILES:${PN}-tools = "${bindir}/sane-find-scanner ${bindir}/gamma4scanimage ${bindir}/umax_pp"
FILES:${PN} = " \
    ${bindir}/scanimage \
    ${libdir}/libsane.so.* \
    ${libdir}/sane/libsane-dll.so.* \
    ${sysconfdir}/sane.d/dll.conf \
    ${sysconfdir}/sane.d/dll.d \
    ${sysconfdir}/sane.d/saned.conf \
    ${datadir}/sane \
"
FILES:${PN}-dev += "${bindir}/sane-config ${libdir}/sane/*.so ${libdir}/sane/*.la"

CONFFILES:${PN} = "${sysconfdir}/sane.d/dll.conf ${sysconfdir}/sane.d/saned.conf"
