SUMMARY = "Front-end to Hyprland's screen shader feature."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f474868a1fb358d268959345d24546cb"

SRC_URI += "git://github.com/loqusion/hyprshade.git;protocol=https;nobranch=1"

RDEPENDS:${PN} += "python3-more-itertools python3-click python3-chevron"

inherit python_hatchling

SRCREV = "ac3a18c501ead4c2f15c4c5eba2fbc0c455d19f3"
