inherit qt6-cmake

DEPENDS:append:class-target = " kconfig-native kcmutils-tools-native kpackage-native"

EXTRA_OECMAKE:append:class-target = " -DKF6_HOST_TOOLING=${STAGING_LIBDIR_NATIVE}/cmake"
