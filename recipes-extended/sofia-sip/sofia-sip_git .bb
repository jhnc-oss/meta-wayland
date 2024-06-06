DESCRIPTION = "RFC3261 compliant SIP User-Agent library."
HOMEPAGE = "https://github.com/freeswitch/sofia-sip"
SECTION = "libs"

DEPENDS = "glib-2.0 dbus-glib openssl"

LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=03068f550c635f6520e0f0252da412fc"

S = "${WORKDIR}/git"
SRCREV = "6198851a610b7889c17e2d98fb84617bc1dd7aec"
PV = "1.13.17"

SRC_URI = "git://github.com/freeswitch/sofia-sip.git;protocol=https;branch=master"

inherit autotools pkgconfig

EXTRA_OECONF += "--with-glib"

CFLAGS += "-Wno-incompatible-pointer-types"

