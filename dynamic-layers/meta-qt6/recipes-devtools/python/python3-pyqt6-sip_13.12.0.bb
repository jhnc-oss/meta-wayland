SUMMARY = "Runtime support module for PyQt6 bindings"
HOMEPAGE = "https://www.riverbankcomputing.com/software/sip/"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc996f4e03c98eae60de43496026f863"

PYPI_PACKAGE = "pyqt6_sip"

SRC_URI[sha256sum] = "a7ad45c1e3cec3a2473d37ea9870b6c3baeccc560298623c8eb59265714c06e2"

inherit pypi python_setuptools_build_meta
