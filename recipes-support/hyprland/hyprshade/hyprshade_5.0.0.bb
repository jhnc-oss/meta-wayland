SUMMARY = "Front-end to Hyprland's screen shader feature."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f474868a1fb358d268959345d24546cb"

SRC_URI += "git://github.com/loqusion/hyprshade.git;protocol=https;nobranch=1"

RDEPENDS:${PN} += "python3-more-itertools python3-click python3-chevron"

inherit python_hatchling

SRCREV = "5195f8b84bf8fead4aa39c47785fc85b87a5746e"
