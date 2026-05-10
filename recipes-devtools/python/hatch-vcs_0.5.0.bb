SUMMARY = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=26501cfd0bbddf830ee820e95551fa3d"

inherit python_hatchling

SRC_URI += "git://github.com/ofek/hatch-vcs.git;protocol=https;nobranch=1"
SRCREV = "dfec2c06defdb4648eb66f6aadf7b57453d732cd"

BBCLASSEXTEND = "native"
