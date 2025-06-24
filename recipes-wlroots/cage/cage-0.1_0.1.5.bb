require cage.inc

DEPENDS += "\
    wlroots-0.16 \
"

SRCREV = "83ffc574be860527814c595756a558c228a3475d"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'xwayland', d)}"
PACKAGECONFIG[xwayland] = "-Dxwayland=true,-Dxwayland=false,xserver-xorg,xwayland"
