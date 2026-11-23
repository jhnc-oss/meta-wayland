SUMMARY = "Runtime support module for PyQt6 bindings"
HOMEPAGE = "https://www.riverbankcomputing.com/software/sip/"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc996f4e03c98eae60de43496026f863"

PYPI_PACKAGE = "pyqt6_sip"

SRC_URI[sha256sum] = "83c3c9cb93b6c631af7048084fb0f234b610a01edbf9b2b44c4ee4bda4197efe"

inherit pypi python_setuptools_build_meta
