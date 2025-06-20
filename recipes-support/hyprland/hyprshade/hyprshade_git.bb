SUMMARY = "Front-end to Hyprland's screen shader feature."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f474868a1fb358d268959345d24546cb"

SRC_URI += "git://github.com/loqusion/hyprshade.git;protocol=https;branch=main"

RDEPENDS:${PN} += "python3-more-itertools python3-click python3-chevron"

inherit python_hatchling

PV = "3.2.1"
SRCREV = "85c636823b7d54d1dba0cf612699f1f6289c1a00"
