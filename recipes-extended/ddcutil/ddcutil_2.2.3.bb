SUMMARY = "ddcutil is a Linux program for querying and changing monitor settings, such as brightness and color levels."
HOMEPAGE = "https://github.com/rockowitz/ddcutil"
SECTION = "libs"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/rockowitz/ddcutil.git;protocol=https;branch=master"

DEPENDS = "i2c-tools glib-2.0 kmod jansson"

SRCREV = "8660f29c0370ca093d45ea6c91277edd00d51301"

inherit autotools-brokensep pkgconfig gobject-introspection

EXTRA_OECONF:remove = '--enable-introspection'

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11 systemd', d)} drm usb"

PACKAGECONFIG[drm] = "--enable-drm=yes,--enable-drm=no,libdrm"
PACKAGECONFIG[systemd] = "--enable-udev=yes,--enable-udev=no,udev"
PACKAGECONFIG[usb] = "--enable-usb=yes,--enable-usb=no,libusb1"
PACKAGECONFIG[x11] = "--enable-x11=yes,--enable-x11=no,libx11 xrandr"

do_install:append () {
	install -d ${D}${sysconfdir}/udev/rules.d
	echo 'SUBSYSTEM=="i2c-dev", KERNEL=="i2c-[0-9]*", ATTRS{class}=="0x030000", TAG+="uaccess" ' > ${D}${sysconfdir}/udev/rules.d/60-ddcutil-i2c.rules
}

FILES:${PN} += "${sysconfdir} ${libdir}/modules-load.d/ddcutil.conf"

