SUMMARY = "OAuth 1.0 and 2.0 authentication plugin for signond"
HOMEPAGE = "https://gitlab.com/accounts-sso/signon-plugin-oauth2"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=243b725d71bb5df4a1e5920b344b86ad"

SRC_URI = "git://gitlab.com/accounts-sso/signon-plugin-oauth2.git;protocol=https;branch=master;tag=VERSION_0.25 \
    file://0001-Don-t-use-deprecated-QUrl-methods-to-inspect-the-que.patch \
    file://0002-OAuth1-replace-deprecated-toAscii-with-toLatin1.patch \
    file://0003-Replace-depreacated-toTime_t-with-toSecsSinceEpoch.patch \
    file://0004-build-disable-deprecation-warnings.patch \
    file://0005-build-stop-using-Werror.patch \
    file://0006-build-enable-again-Qt-deprecation-warnings.patch \
    file://0007-Port-QSignalSpys-to-PMF-syntax.patch \
    file://0008-Port-to-new-connection-syntax.patch \
    file://0009-Port-away-from-deprecated-error-signal.patch \
    file://0010-Port-away-from-deprecated-qrand.patch \
    file://0011-Fix-string-concatenation-in-Qt6.patch \
    file://0012-Port-away-from-deprecated-QRegExp.patch \
    file://0013-Build-with-C-17.patch \
    file://0014-Use-correct-signon-in-example.patch \
    file://0015-Port-away-from-deprecated-QString-SplitBehavior.patch \
    file://0016-Port-away-from-deprecated-QList-toSet.patch \
"
SRCREV = "091887d09bb635fa31f69ed16d384563cddc8009"

DEPENDS = " \
    qtbase \
    signond \
"

inherit qt6-qmake pkgconfig

EXTRA_QMAKEVARS_PRE = "PREFIX=${prefix} LIBDIR=${libdir} CONFIG+=nomake_tests"

FILES:${PN} += "${libdir}/signon"
