SUMMARY = "Simple Desktop Display Manager"
HOMEPAGE = "https://github.com/sddm/sddm"
LICENSE = "CC-BY-3.0 AND GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b \
    file://LICENSE.CC-BY-3.0;md5=36b7342d5619a3a0d3b581e89803ec25 \
"

SRC_URI = " \
    git://github.com/sddm/sddm.git;protocol=https;nobranch=1;tag=v0.21.0 \
    file://sddm \
    file://sddm-autologin \
    file://sddm-greeter \
"
SRCREV = "63780fcd79f1dbf81a30eef48c28c699ab15aded"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    libpam \
    libxau \
    libxcb \
    libxkbcommon \
    systemd \
"

inherit qt6-cmake pkgconfig systemd useradd features_check

REQUIRED_DISTRO_FEATURES = "pam systemd"

SDDM_INITIAL_VT ?= "7"

EXTRA_OECMAKE += " \
    -DCMAKE_POLICY_VERSION_MINIMUM=3.5 \
    -DBUILD_WITH_QT6=ON \
    -DBUILD_MAN_PAGES=OFF \
    -DINSTALL_PAM_CONFIGURATION=OFF \
    -DSDDM_INITIAL_VT=${SDDM_INITIAL_VT} \
    -DUID_MIN=1000 \
    -DUID_MAX=60000 \
    -DRUNTIME_DIR=/run/sddm \
    -DQT_IMPORTS_DIR=${QT6_INSTALL_QMLDIR} \
    -DSYSTEMD_SYSTEM_UNIT_DIR=${systemd_system_unitdir} \
    -DSYSTEMD_SYSUSERS_DIR=${nonarch_libdir}/sysusers.d \
    -DSYSTEMD_TMPFILES_DIR=${nonarch_libdir}/tmpfiles.d \
"

do_install:append() {
	install -d ${D}${sysconfdir}/pam.d
	install -m 0644 ${UNPACKDIR}/sddm ${UNPACKDIR}/sddm-autologin ${UNPACKDIR}/sddm-greeter ${D}${sysconfdir}/pam.d
}

USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "--system --home ${localstatedir}/lib/sddm --no-create-home --shell /bin/false --user-group sddm"

SYSTEMD_SERVICE:${PN} = "sddm.service"

FILES:${PN} += " \
    ${datadir}/sddm \
    ${datadir}/dbus-1 \
    ${libdir}/qml \
    ${nonarch_libdir}/sddm \
    ${nonarch_libdir}/sysusers.d \
    ${nonarch_libdir}/tmpfiles.d \
    ${libexecdir} \
"
