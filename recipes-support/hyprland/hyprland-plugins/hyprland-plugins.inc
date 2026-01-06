SRC_URI = "git://github.com/hyprwm/hyprland-plugins.git;protocol=https;branch=main"
SRCREV = "0b356053fa4e6a6f5e857529654ff45eba2859d8"

DEPENDS += " \
    pixman \
    libdrm \
    hyprland \
    libinput \
    udev \
    pango \
    cairo \
    wayland-native \
    libxkbcommon \
    hyprutils \
"

inherit cmake pkgconfig

FILES:${PN}-dev = ""
