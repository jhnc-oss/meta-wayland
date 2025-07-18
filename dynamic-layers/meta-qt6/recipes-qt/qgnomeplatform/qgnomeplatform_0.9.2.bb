SUMMARY = "QGnomePlatform is a Qt Platform Theme designed to use as many of the GNOME settings as possible in unmodified Qt applications"
HOMEPAGE = "https://github.com/FedoraQt/QGnomePlatform"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40d2542b8c43a3ec2b7f5da31a697b88"

DEPENDS = " \
	adwaita-qt \
	glib-2.0 \
	gsettings-desktop-schemas \
	gtk+3 \
	qtbase \
	qtdeclarative \
	qtdeclarative-native \
	qtwayland \
	qtwayland-native \
"

RDEPENDS:${PN} = "adwaita-qt"

inherit qt6-cmake

EXTRA_OECMAKE += "-DUSE_QT6=ON -DCMAKE_POLICY_VERSION_MINIMUM=3.5"

SRC_URI = "git://github.com/FedoraQt/QGnomePlatform.git;protocol=https;nobranch=1"

SRCREV = "71f1fe577b5b665bc19c7ab3736ffe8387fa52ee"

FILES:${PN} += "${libdir} ${datadir}"
FILES:${PN}-dev = ""
