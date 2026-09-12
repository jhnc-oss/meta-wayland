SUMMARY = "PEP 517 compliant build system for PyQt and related projects"
HOMEPAGE = "https://github.com/Python-PyQt/PyQt-builder"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=236276327275fdb261636fb40b18d88d"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "pyqt_builder"

SRC_URI[sha256sum] = "6af6646ba29668751b039bfdced51642cb510e300796b58a4d68b7f956a024d8"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
    python3-packaging \
    sip \
"

BBCLASSEXTEND = "native nativesdk"
