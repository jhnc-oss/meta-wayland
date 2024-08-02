SUMMARY = "Raw wayland greeter for greetd, to be run under sway or similar."
HOMEPAGE = "https://git.sr.ht/~kennylevinsen/wlgreet"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = "wayland wayland-protocols wayland-native"
RDEPENDS:${PN} = "greetd"

inherit cargo pkgconfig

SRC_URI = "git://git.sr.ht/~kennylevinsen/wlgreet;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "0.5.0"
SRCREV = "e4a7d1ff7f91bc28794e2420c7651a8e296c6509"

SRC_URI += " \
    crate://crates.io/ab_glyph_rasterizer/0.1.8 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/autocfg/1.2.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bumpalo/3.16.0 \
    crate://crates.io/calloop/0.9.3 \
    crate://crates.io/cc/1.0.95 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.38 \
    crate://crates.io/core-foundation-sys/0.8.6 \
    crate://crates.io/dlib/0.5.2 \
    crate://crates.io/downcast-rs/1.2.1 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/greetd_ipc/0.10.0 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/iana-time-zone/0.1.60 \
    crate://crates.io/itoa/1.0.11 \
    crate://crates.io/js-sys/0.3.69 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.153 \
    crate://crates.io/libloading/0.8.3 \
    crate://crates.io/log/0.4.21 \
    crate://crates.io/memmap2/0.3.1 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/nix/0.22.3 \
    crate://crates.io/nix/0.24.3 \
    crate://crates.io/nix/0.25.1 \
    crate://crates.io/num-traits/0.2.18 \
    crate://crates.io/once_cell/1.19.0 \
    crate://crates.io/os_pipe/1.1.5 \
    crate://crates.io/owned_ttf_parser/0.15.2 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.30 \
    crate://crates.io/proc-macro2/1.0.81 \
    crate://crates.io/quote/1.0.36 \
    crate://crates.io/rusttype/0.9.3 \
    crate://crates.io/ryu/1.0.17 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/serde/1.0.198 \
    crate://crates.io/serde_derive/1.0.198 \
    crate://crates.io/serde_json/1.0.116 \
    crate://crates.io/smallvec/1.13.2 \
    crate://crates.io/smithay-client-toolkit/0.15.4 \
    crate://crates.io/syn/2.0.60 \
    crate://crates.io/thiserror-impl/1.0.58 \
    crate://crates.io/thiserror/1.0.58 \
    crate://crates.io/toml/0.5.11 \
    crate://crates.io/ttf-parser/0.15.2 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/unicode-width/0.1.11 \
    crate://crates.io/wasm-bindgen-backend/0.2.92 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.92 \
    crate://crates.io/wasm-bindgen-macro/0.2.92 \
    crate://crates.io/wasm-bindgen-shared/0.2.92 \
    crate://crates.io/wasm-bindgen/0.2.92 \
    crate://crates.io/wayland-client/0.29.5 \
    crate://crates.io/wayland-commons/0.29.5 \
    crate://crates.io/wayland-cursor/0.29.5 \
    crate://crates.io/wayland-protocols/0.29.5 \
    crate://crates.io/wayland-scanner/0.29.5 \
    crate://crates.io/wayland-sys/0.29.5 \
    crate://crates.io/windows-core/0.52.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-targets/0.52.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.5 \
    crate://crates.io/windows_i686_gnu/0.52.5 \
    crate://crates.io/windows_i686_gnullvm/0.52.5 \
    crate://crates.io/windows_i686_msvc/0.52.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.5 \
    crate://crates.io/xcursor/0.3.5 \
    crate://crates.io/xml-rs/0.8.20 \
"

SRC_URI[ab_glyph_rasterizer-0.1.8.sha256sum] = "c71b1793ee61086797f5c80b6efa2b8ffa6d5dd703f118545808a7f2e27f7046"
SRC_URI[android-tzdata-0.1.1.sha256sum] = "e999941b234f3131b00bc13c22d06e8c5ff726d1b6318ac7eb276997bbb4fef0"
SRC_URI[android_system_properties-0.1.5.sha256sum] = "819e7219dbd41043ac279b19830f2efc897156490d7fd6ea916720117ee66311"
SRC_URI[autocfg-1.2.0.sha256sum] = "f1fdabc7756949593fe60f30ec81974b613357de856987752631dea1e3394c80"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bumpalo-3.16.0.sha256sum] = "79296716171880943b8470b5f8d03aa55eb2e645a4874bdbb28adb49162e012c"
SRC_URI[calloop-0.9.3.sha256sum] = "bf2eec61efe56aa1e813f5126959296933cf0700030e4314786c48779a66ab82"
SRC_URI[cc-1.0.95.sha256sum] = "d32a725bc159af97c3e629873bb9f88fb8cf8a4867175f76dc987815ea07c83b"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[chrono-0.4.38.sha256sum] = "a21f936df1771bf62b77f047b726c4625ff2e8aa607c01ec06e5a05bd8463401"
SRC_URI[core-foundation-sys-0.8.6.sha256sum] = "06ea2b9bc92be3c2baa9334a323ebca2d6f074ff852cd1d7b11064035cd3868f"
SRC_URI[dlib-0.5.2.sha256sum] = "330c60081dcc4c72131f8eb70510f1ac07223e5d4163db481a04a0befcffa412"
SRC_URI[downcast-rs-1.2.1.sha256sum] = "75b325c5dbd37f80359721ad39aca5a29fb04c89279657cffdda8736d0c0b9d2"
SRC_URI[getopts-0.2.21.sha256sum] = "14dbbfd5c71d70241ecf9e6f13737f7b5ce823821063188d7e46c41d371eebd5"
SRC_URI[greetd_ipc-0.10.0.sha256sum] = "1600ad23798daf53f5c336ebca8a7c603696ef4455103e9c713fab574131eb35"
SRC_URI[iana-time-zone-haiku-0.1.2.sha256sum] = "f31827a206f56af32e590ba56d5d2d085f558508192593743f16b2306495269f"
SRC_URI[iana-time-zone-0.1.60.sha256sum] = "e7ffbb5a1b541ea2561f8c41c087286cc091e21e556a4f09a8f6cbf17b69b141"
SRC_URI[itoa-1.0.11.sha256sum] = "49f1f14873335454500d59611f1cf4a4b0f786f9ac11f4312a78e4cf2566695b"
SRC_URI[js-sys-0.3.69.sha256sum] = "29c15563dc2726973df627357ce0c9ddddbea194836909d655df6a75d2cf296d"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[libc-0.2.153.sha256sum] = "9c198f91728a82281a64e1f4f9eeb25d82cb32a5de251c6bd1b5154d63a8e7bd"
SRC_URI[libloading-0.8.3.sha256sum] = "0c2a198fb6b0eada2a8df47933734e6d35d350665a33a3593d7164fa52c75c19"
SRC_URI[log-0.4.21.sha256sum] = "90ed8c1e510134f979dbc4f070f87d4313098b704861a105fe34231c70a3901c"
SRC_URI[memmap2-0.3.1.sha256sum] = "00b6c2ebff6180198788f5db08d7ce3bc1d0b617176678831a7510825973e357"
SRC_URI[memoffset-0.6.5.sha256sum] = "5aa361d4faea93603064a027415f07bd8e1d5c88c9fbf68bf56a285428fd79ce"
SRC_URI[nix-0.22.3.sha256sum] = "e4916f159ed8e5de0082076562152a76b7a1f64a01fd9d1e0fea002c37624faf"
SRC_URI[nix-0.24.3.sha256sum] = "fa52e972a9a719cecb6864fb88568781eb706bac2cd1d4f04a648542dbf78069"
SRC_URI[nix-0.25.1.sha256sum] = "f346ff70e7dbfd675fe90590b92d59ef2de15a8779ae305ebcbfd3f0caf59be4"
SRC_URI[num-traits-0.2.18.sha256sum] = "da0df0e5185db44f69b44f26786fe401b6c293d1907744beaa7fa62b2e5a517a"
SRC_URI[once_cell-1.19.0.sha256sum] = "3fdb12b2476b595f9358c5161aa467c2438859caa136dec86c26fdd2efe17b92"
SRC_URI[os_pipe-1.1.5.sha256sum] = "57119c3b893986491ec9aa85056780d3a0f3cf4da7cc09dd3650dbd6c6738fb9"
SRC_URI[owned_ttf_parser-0.15.2.sha256sum] = "05e6affeb1632d6ff6a23d2cd40ffed138e82f1532571a26f527c8a284bb2fbb"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.30.sha256sum] = "d231b230927b5e4ad203db57bbcbee2802f6bce620b1e4a9024a07d94e2907ec"
SRC_URI[proc-macro2-1.0.81.sha256sum] = "3d1597b0c024618f09a9c3b8655b7e430397a36d23fdafec26d6965e9eec3eba"
SRC_URI[quote-1.0.36.sha256sum] = "0fa76aaf39101c457836aec0ce2316dbdc3ab723cdda1c6bd4e6ad4208acaca7"
SRC_URI[rusttype-0.9.3.sha256sum] = "3ff8374aa04134254b7995b63ad3dc41c7f7236f69528b28553da7d72efaa967"
SRC_URI[ryu-1.0.17.sha256sum] = "e86697c916019a8588c99b5fac3cead74ec0b4b819707a682fd4d23fa0ce1ba1"
SRC_URI[scoped-tls-1.0.1.sha256sum] = "e1cf6437eb19a8f4a6cc0f7dca544973b0b78843adbfeb3683d1a94a0024a294"
SRC_URI[serde-1.0.198.sha256sum] = "9846a40c979031340571da2545a4e5b7c4163bdae79b301d5f86d03979451fcc"
SRC_URI[serde_derive-1.0.198.sha256sum] = "e88edab869b01783ba905e7d0153f9fc1a6505a96e4ad3018011eedb838566d9"
SRC_URI[serde_json-1.0.116.sha256sum] = "3e17db7126d17feb94eb3fad46bf1a96b034e8aacbc2e775fe81505f8b0b2813"
SRC_URI[smallvec-1.13.2.sha256sum] = "3c5e1a9a646d36c3599cd173a41282daf47c44583ad367b8e6837255952e5c67"
SRC_URI[smithay-client-toolkit-0.15.4.sha256sum] = "8a28f16a97fa0e8ce563b2774d1e732dd5d4025d2772c5dba0a41a0f90a29da3"
SRC_URI[syn-2.0.60.sha256sum] = "909518bc7b1c9b779f1bbf07f2929d35af9f0f37e47c6e9ef7f9dddc1e1821f3"
SRC_URI[thiserror-impl-1.0.58.sha256sum] = "c61f3ba182994efc43764a46c018c347bc492c79f024e705f46567b418f6d4f7"
SRC_URI[thiserror-1.0.58.sha256sum] = "03468839009160513471e86a034bb2c5c0e4baae3b43f79ffc55c4a5427b3297"
SRC_URI[toml-0.5.11.sha256sum] = "f4f7f0dd8d50a853a531c426359045b1998f04219d88799810762cd4ad314234"
SRC_URI[ttf-parser-0.15.2.sha256sum] = "7b3e06c9b9d80ed6b745c7159c40b311ad2916abb34a49e9be2653b90db0d8dd"
SRC_URI[unicode-ident-1.0.12.sha256sum] = "3354b9ac3fae1ff6755cb6db53683adb661634f67557942dea4facebec0fee4b"
SRC_URI[unicode-width-0.1.11.sha256sum] = "e51733f11c9c4f72aa0c160008246859e340b00807569a0da0e7a1079b27ba85"
SRC_URI[wasm-bindgen-backend-0.2.92.sha256sum] = "614d787b966d3989fa7bb98a654e369c762374fd3213d212cfc0251257e747da"
SRC_URI[wasm-bindgen-macro-support-0.2.92.sha256sum] = "e94f17b526d0a461a191c78ea52bbce64071ed5c04c9ffe424dcb38f74171bb7"
SRC_URI[wasm-bindgen-macro-0.2.92.sha256sum] = "a1f8823de937b71b9460c0c34e25f3da88250760bec0ebac694b49997550d726"
SRC_URI[wasm-bindgen-shared-0.2.92.sha256sum] = "af190c94f2773fdb3729c55b007a722abb5384da03bc0986df4c289bf5567e96"
SRC_URI[wasm-bindgen-0.2.92.sha256sum] = "4be2531df63900aeb2bca0daaaddec08491ee64ceecbee5076636a3b026795a8"
SRC_URI[wayland-client-0.29.5.sha256sum] = "3f3b068c05a039c9f755f881dc50f01732214f5685e379829759088967c46715"
SRC_URI[wayland-commons-0.29.5.sha256sum] = "8691f134d584a33a6606d9d717b95c4fa20065605f798a3f350d78dced02a902"
SRC_URI[wayland-cursor-0.29.5.sha256sum] = "6865c6b66f13d6257bef1cd40cbfe8ef2f150fb8ebbdb1e8e873455931377661"
SRC_URI[wayland-protocols-0.29.5.sha256sum] = "b950621f9354b322ee817a23474e479b34be96c2e909c14f7bc0100e9a970bc6"
SRC_URI[wayland-scanner-0.29.5.sha256sum] = "8f4303d8fa22ab852f789e75a967f0a2cdc430a607751c0499bada3e451cbd53"
SRC_URI[wayland-sys-0.29.5.sha256sum] = "be12ce1a3c39ec7dba25594b97b42cb3195d54953ddb9d3d95a7c3902bc6e9d4"
SRC_URI[windows-core-0.52.0.sha256sum] = "33ab640c8d7e35bf8ba19b884ba838ceb4fba93a4e8c65a9059d08afcfc683d9"
SRC_URI[windows-sys-0.52.0.sha256sum] = "282be5f36a8ce781fad8c8ae18fa3f9beff57ec1b52cb3de0789201425d9a33d"
SRC_URI[windows-targets-0.52.5.sha256sum] = "6f0713a46559409d202e70e28227288446bf7841d3211583a4b53e3f6d96e7eb"
SRC_URI[windows_aarch64_gnullvm-0.52.5.sha256sum] = "7088eed71e8b8dda258ecc8bac5fb1153c5cffaf2578fc8ff5d61e23578d3263"
SRC_URI[windows_aarch64_msvc-0.52.5.sha256sum] = "9985fd1504e250c615ca5f281c3f7a6da76213ebd5ccc9561496568a2752afb6"
SRC_URI[windows_i686_gnu-0.52.5.sha256sum] = "88ba073cf16d5372720ec942a8ccbf61626074c6d4dd2e745299726ce8b89670"
SRC_URI[windows_i686_gnullvm-0.52.5.sha256sum] = "87f4261229030a858f36b459e748ae97545d6f1ec60e5e0d6a3d32e0dc232ee9"
SRC_URI[windows_i686_msvc-0.52.5.sha256sum] = "db3c2bf3d13d5b658be73463284eaf12830ac9a26a90c717b7f771dfe97487bf"
SRC_URI[windows_x86_64_gnu-0.52.5.sha256sum] = "4e4246f76bdeff09eb48875a0fd3e2af6aada79d409d33011886d3e1581517d9"
SRC_URI[windows_x86_64_gnullvm-0.52.5.sha256sum] = "852298e482cd67c356ddd9570386e2862b5673c85bd5f88df9ab6802b334c596"
SRC_URI[windows_x86_64_msvc-0.52.5.sha256sum] = "bec47e5bfd1bff0eeaf6d8b485cc1074891a197ab4225d504cb7a1ab88b02bf0"
SRC_URI[xcursor-0.3.5.sha256sum] = "6a0ccd7b4a5345edfcd0c3535718a4e9ff7798ffc536bb5b5a0e26ff84732911"
SRC_URI[xml-rs-0.8.20.sha256sum] = "791978798f0597cfc70478424c2b4fdc2b7a8024aaff78497ef00f24ef674193"
