SRC_URI = "git://github.com/hyprwm/hyprland-plugins.git;protocol=https;branch=main"
SRCREV = "4b6887679ed2fb6ac8d96c3e842bfa23bf5429b5"

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
