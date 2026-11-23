SUMMARY = "PEP 517 compliant build system for PyQt and related projects"
HOMEPAGE = "https://github.com/Python-PyQt/PyQt-builder"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=236276327275fdb261636fb40b18d88d"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "pyqt_builder"

SRC_URI[sha256sum] = "673efa27237a81ffefc7d9a6419565600a129b4f4cf4d358c89a348b39b3a454"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
    python3-packaging \
    sip \
"

BBCLASSEXTEND = "native nativesdk"
