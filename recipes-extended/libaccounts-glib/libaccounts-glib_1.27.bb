SUMMARY = "Accounts database access library for the accounts-sso framework"
HOMEPAGE = "https://gitlab.com/accounts-sso/libaccounts-glib"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=243b725d71bb5df4a1e5920b344b86ad"

SRC_URI = "git://gitlab.com/accounts-sso/libaccounts-glib.git;protocol=https;branch=master;tag=VERSION_1.27 \
    file://0001-Add-some-meson-options-introspection-docs-tests-to-p.patch \
"
SRCREV = "26c54322304e9df598b2ba67427433a2e68b823e"

DEPENDS = " \
    glib-2.0 \
    libxml2 \
    sqlite3 \
"

inherit meson pkgconfig gobject-introspection vala

EXTRA_OEMESON += " \
    -Ddocs=false \
    -Dtests=false \
    -Dinstall-py-overrides=false \
"

FILES:${PN} += "${datadir}/xml ${datadir}/gettext ${datadir}/dbus-1"
