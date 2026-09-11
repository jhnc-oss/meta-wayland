DESCRIPTION = "RFC3261 compliant SIP User-Agent library."
HOMEPAGE = "https://github.com/freeswitch/sofia-sip"
SECTION = "libs"

DEPENDS = "glib-2.0 dbus-glib openssl"

LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=03068f550c635f6520e0f0252da412fc"

SRCREV = "ad36ac8f755308e8b87f98a505e83d4e408e5cc3"

SRC_URI = "git://github.com/freeswitch/sofia-sip.git;protocol=https;branch=master;tag=v1.13.18"
SRC_URI += "file://0001-stun-use-TLS_client_method.patch"

inherit autotools pkgconfig

EXTRA_OECONF += "--with-glib"

CFLAGS += "-Wno-incompatible-pointer-types"

