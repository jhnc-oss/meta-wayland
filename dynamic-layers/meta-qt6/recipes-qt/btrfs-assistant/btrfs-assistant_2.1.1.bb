SUMMARY = "Btrfs Assistant is a GUI management tool to make managing a Btrfs filesystem easier."
HOMEPAGE = "https://gitlab.com/btrfs-assistant/btrfs-assistant"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf7e2ce7c2a6b6b42b34714d917ee2c7"

SRC_URI = "git://gitlab.com/btrfs-assistant/btrfs-assistant.git;protocol=https;nobranch=1"
SRCREV = "a8267fade8e9d7dcea83dc944ab7930a21793c14"

DEPENDS = "qtbase qtbase-native qttools-native  qtwayland qtwayland-native btrfs-tools"
RRECOMMENDS:${PN} = "snapper qadwaitadecorations"

inherit qt6-cmake

FILES:${PN} += "${datadir}"
