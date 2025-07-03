SUMMARY = "greetd is a minimal and flexible login manager daemon that makes no assumptions about what you want to launch."
HOMEPAGE = "https://kl.wtf/projects/greetd"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI += " \
    git://git.sr.ht/~kennylevinsen/greetd;protocol=https;nobranch=1 \
    file://greetd.pam \
"
SRCREV = "08efe60feceea8c81f9571c666880ff1e1c2e3ff"

DEPENDS = "libpam"

inherit cargo pkgconfig cargo-update-recipe-crates useradd

require ${PN}-crates.inc

do_configure:prepend() {
    sed -i "s|abort|unwind|" ${S}/Cargo.toml
}

do_install:append() {
    install -d ${D}${systemd_system_unitdir} ${D}${sysconfdir}/greetd ${D}${sysconfdir}/pam.d
    install -m0644 ${S}/greetd.service ${D}${systemd_system_unitdir}
    install -m0644 ${S}/config.toml ${D}${sysconfdir}/greetd
    install -m0644 ${UNPACKDIR}/greetd.pam ${D}${sysconfdir}/pam.d/greetd
}

USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "--system --user-group --groups video --no-create-home --shell /bin/sh greeter"

PACKAGES += "agreety"

FILES:${PN} = "${bindir}/greetd ${bindir}/fakegreet ${sysconfdir} ${systemd_system_unitdir}"
FILES:agreety = "${bindir}/agreety"

