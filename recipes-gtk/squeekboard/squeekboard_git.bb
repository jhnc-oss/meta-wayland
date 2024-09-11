SUMMARY = "A Wayland virtual keyboard"
DESCRIPTION = "Squeekboard is a virtual keyboard supporting Wayland, built \
primarily for the Librem 5 phone. \
It squeaks because some Rust got inside."
HOMEPAGE = "https://developer.puri.sm/projects/squeekboard/"
BUGTRACKER = "https://gitlab.gnome.org/World/Phosh/squeekboard/-/issues"
LICENSE = "GPL-3.0-only & GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    file://debian/copyright;md5=4dbf2d985c407c84a6622b9c95f23802"

DEPENDS = "\
    feedbackd \
    glib-2.0 \
    glib-2.0-native \
    gnome-desktop \
    gtk+3 \
    libbsd \
    libxkbcommon \
    wayland \
    wayland-native \
    wayland-protocols \
    "

SRC_URI = "\
    git://gitlab.gnome.org/World/Phosh/squeekboard.git;protocol=https;nobranch=1 \
    file://0001-Pass-additional-arguments-to-cargo.patch \
    crate://crates.io/anstyle/1.0.8 \
    crate://crates.io/async-io/1.13.0 \
    crate://crates.io/async-lock/2.8.0 \
    crate://crates.io/atk-sys/0.18.0 \
    crate://crates.io/atk/0.18.0 \
    crate://crates.io/autocfg/1.3.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.6.0 \
    crate://crates.io/byteorder/1.5.0 \
    crate://crates.io/cairo-rs/0.18.5 \
    crate://crates.io/cairo-sys-rs/0.18.2 \
    crate://crates.io/cc/1.1.11 \
    crate://crates.io/cfg-expr/0.15.8 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap/4.5.15 \
    crate://crates.io/clap_builder/4.5.15 \
    crate://crates.io/clap_lex/0.7.2 \
    crate://crates.io/concurrent-queue/2.5.0 \
    crate://crates.io/crossbeam-utils/0.8.20 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/enumflags2/0.6.4 \
    crate://crates.io/enumflags2_derive/0.6.4 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno/0.3.9 \
    crate://crates.io/event-listener/2.5.3 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/field-offset/0.3.6 \
    crate://crates.io/futures-channel/0.3.30 \
    crate://crates.io/futures-core/0.3.30 \
    crate://crates.io/futures-executor/0.3.30 \
    crate://crates.io/futures-io/0.3.30 \
    crate://crates.io/futures-lite/1.13.0 \
    crate://crates.io/futures-macro/0.3.30 \
    crate://crates.io/futures-sink/0.3.30 \
    crate://crates.io/futures-task/0.3.30 \
    crate://crates.io/futures-util/0.3.30 \
    crate://crates.io/futures/0.3.30 \
    crate://crates.io/gdk-pixbuf-sys/0.18.0 \
    crate://crates.io/gdk-pixbuf/0.18.5 \
    crate://crates.io/gdk-sys/0.18.0 \
    crate://crates.io/gdk/0.18.0 \
    crate://crates.io/gio-sys/0.18.1 \
    crate://crates.io/gio/0.18.4 \
    crate://crates.io/glib-macros/0.18.5 \
    crate://crates.io/glib-sys/0.18.1 \
    crate://crates.io/glib/0.18.5 \
    crate://crates.io/gobject-sys/0.18.0 \
    crate://crates.io/gtk-sys/0.18.0 \
    crate://crates.io/gtk/0.18.1 \
    crate://crates.io/gtk3-macros/0.18.0 \
    crate://crates.io/hashbrown/0.14.5 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/heck/0.5.0 \
    crate://crates.io/hermit-abi/0.3.9 \
    crate://crates.io/indexmap/2.4.0 \
    crate://crates.io/instant/0.1.13 \
    crate://crates.io/io-lifetimes/1.0.11 \
    crate://crates.io/itoa/1.0.11 \
    crate://crates.io/libc/0.2.155 \
    crate://crates.io/linux-raw-sys/0.3.8 \
    crate://crates.io/log/0.4.22 \
    crate://crates.io/maplit/1.0.2 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/memmap2/0.8.0 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/memoffset/0.9.1 \
    crate://crates.io/nb-connect/1.2.0 \
    crate://crates.io/nix/0.22.3 \
    crate://crates.io/once_cell/1.19.0 \
    crate://crates.io/pango-sys/0.18.0 \
    crate://crates.io/pango/0.18.3 \
    crate://crates.io/parking/2.2.0 \
    crate://crates.io/pin-project-lite/0.2.14 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.30 \
    crate://crates.io/polling/2.8.0 \
    crate://crates.io/proc-macro-crate/0.1.5 \
    crate://crates.io/proc-macro-crate/1.3.1 \
    crate://crates.io/proc-macro-crate/2.0.2 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.86 \
    crate://crates.io/quote/1.0.36 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.37.27 \
    crate://crates.io/ryu/1.0.18 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/semver/1.0.23 \
    crate://crates.io/serde/1.0.207 \
    crate://crates.io/serde_derive/1.0.207 \
    crate://crates.io/serde_repr/0.1.19 \
    crate://crates.io/serde_spanned/0.6.7 \
    crate://crates.io/serde_yaml/0.9.34+deprecated \
    crate://crates.io/shlex/1.3.0 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/smallvec/1.13.2 \
    crate://crates.io/socket2/0.4.10 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.74 \
    crate://crates.io/system-deps/6.2.2 \
    crate://crates.io/target-lexicon/0.12.16 \
    crate://crates.io/thiserror-impl/1.0.63 \
    crate://crates.io/thiserror/1.0.63 \
    crate://crates.io/toml/0.5.11 \
    crate://crates.io/toml/0.8.2 \
    crate://crates.io/toml_datetime/0.6.3 \
    crate://crates.io/toml_edit/0.19.15 \
    crate://crates.io/toml_edit/0.20.2 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/unsafe-libyaml/0.2.11 \
    crate://crates.io/version-compare/0.2.0 \
    crate://crates.io/version_check/0.9.5 \
    crate://crates.io/waker-fn/1.2.0 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.6 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.6 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.6 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.52.6 \
    crate://crates.io/windows_i686_gnullvm/0.52.6 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.52.6 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.6 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.6 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.6 \
    crate://crates.io/winnow/0.5.40 \
    crate://crates.io/xkbcommon/0.7.0 \
    crate://crates.io/xkeysym/0.2.1 \
    crate://crates.io/zbus/1.9.3 \
    crate://crates.io/zbus_macros/1.9.3 \
    crate://crates.io/zvariant/2.10.0 \
    crate://crates.io/zvariant_derive/2.10.0 \
"

SRC_URI[anstyle-1.0.8.sha256sum] = "1bec1de6f59aedf83baf9ff929c98f2ad654b97c9510f4e70cf6f661d49fd5b1"
SRC_URI[async-io-1.13.0.sha256sum] = "0fc5b45d93ef0529756f812ca52e44c221b35341892d3dcc34132ac02f3dd2af"
SRC_URI[async-lock-2.8.0.sha256sum] = "287272293e9d8c41773cec55e365490fe034813a2f172f502d6ddcf75b2f582b"
SRC_URI[atk-sys-0.18.0.sha256sum] = "251e0b7d90e33e0ba930891a505a9a35ece37b2dd37a14f3ffc306c13b980009"
SRC_URI[atk-0.18.0.sha256sum] = "b4af014b17dd80e8af9fa689b2d4a211ddba6eb583c1622f35d0cb543f6b17e4"
SRC_URI[autocfg-1.3.0.sha256sum] = "0c4b4d0bd25bd0b74681c0ad21497610ce1b7c91b1022cd21c80c6fbdd9476b0"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bitflags-2.6.0.sha256sum] = "b048fb63fd8b5923fc5aa7b340d8e156aec7ec02f0c78fa8a6ddc2613f6f71de"
SRC_URI[byteorder-1.5.0.sha256sum] = "1fd0f2584146f6f2ef48085050886acf353beff7305ebd1ae69500e27c67f64b"
SRC_URI[cairo-rs-0.18.5.sha256sum] = "8ca26ef0159422fb77631dc9d17b102f253b876fe1586b03b803e63a309b4ee2"
SRC_URI[cairo-sys-rs-0.18.2.sha256sum] = "685c9fa8e590b8b3d678873528d83411db17242a73fccaed827770ea0fedda51"
SRC_URI[cc-1.1.11.sha256sum] = "5fb8dd288a69fc53a1996d7ecfbf4a20d59065bff137ce7e56bbd620de191189"
SRC_URI[cfg-expr-0.15.8.sha256sum] = "d067ad48b8650848b989a59a86c6c36a995d02d2bf778d45c3c5d57bc2718f02"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[clap-4.5.15.sha256sum] = "11d8838454fda655dafd3accb2b6e2bea645b9e4078abe84a22ceb947235c5cc"
SRC_URI[clap_builder-4.5.15.sha256sum] = "216aec2b177652e3846684cbfe25c9964d18ec45234f0f5da5157b207ed1aab6"
SRC_URI[clap_lex-0.7.2.sha256sum] = "1462739cb27611015575c0c11df5df7601141071f07518d56fcc1be504cbec97"
SRC_URI[concurrent-queue-2.5.0.sha256sum] = "4ca0197aee26d1ae37445ee532fefce43251d24cc7c166799f4d46817f1d3973"
SRC_URI[crossbeam-utils-0.8.20.sha256sum] = "22ec99545bb0ed0ea7bb9b8e1e9122ea386ff8a48c0922e43f36d45ab09e0e80"
SRC_URI[derivative-2.2.0.sha256sum] = "fcc3dd5e9e9c0b295d6e1e4d811fb6f157d5ffd784b8d202fc62eac8035a770b"
SRC_URI[enumflags2-0.6.4.sha256sum] = "83c8d82922337cd23a15f88b70d8e4ef5f11da38dd7cdb55e84dd5de99695da0"
SRC_URI[enumflags2_derive-0.6.4.sha256sum] = "946ee94e3dbf58fdd324f9ce245c7b238d46a66f00e86a020b71996349e46cce"
SRC_URI[equivalent-1.0.1.sha256sum] = "5443807d6dff69373d433ab9ef5378ad8df50ca6298caf15de6e52e24aaf54d5"
SRC_URI[errno-0.3.9.sha256sum] = "534c5cf6194dfab3db3242765c03bbe257cf92f22b38f6bc0c58d59108a820ba"
SRC_URI[event-listener-2.5.3.sha256sum] = "0206175f82b8d6bf6652ff7d71a1e27fd2e4efde587fd368662814d6ec1d9ce0"
SRC_URI[fastrand-1.9.0.sha256sum] = "e51093e27b0797c359783294ca4f0a911c270184cb10f85783b118614a1501be"
SRC_URI[field-offset-0.3.6.sha256sum] = "38e2275cc4e4fc009b0669731a1e5ab7ebf11f469eaede2bab9309a5b4d6057f"
SRC_URI[futures-channel-0.3.30.sha256sum] = "eac8f7d7865dcb88bd4373ab671c8cf4508703796caa2b1985a9ca867b3fcb78"
SRC_URI[futures-core-0.3.30.sha256sum] = "dfc6580bb841c5a68e9ef15c77ccc837b40a7504914d52e47b8b0e9bbda25a1d"
SRC_URI[futures-executor-0.3.30.sha256sum] = "a576fc72ae164fca6b9db127eaa9a9dda0d61316034f33a0a0d4eda41f02b01d"
SRC_URI[futures-io-0.3.30.sha256sum] = "a44623e20b9681a318efdd71c299b6b222ed6f231972bfe2f224ebad6311f0c1"
SRC_URI[futures-lite-1.13.0.sha256sum] = "49a9d51ce47660b1e808d3c990b4709f2f415d928835a17dfd16991515c46bce"
SRC_URI[futures-macro-0.3.30.sha256sum] = "87750cf4b7a4c0625b1529e4c543c2182106e4dedc60a2a6455e00d212c489ac"
SRC_URI[futures-sink-0.3.30.sha256sum] = "9fb8e00e87438d937621c1c6269e53f536c14d3fbd6a042bb24879e57d474fb5"
SRC_URI[futures-task-0.3.30.sha256sum] = "38d84fa142264698cdce1a9f9172cf383a0c82de1bddcf3092901442c4097004"
SRC_URI[futures-util-0.3.30.sha256sum] = "3d6401deb83407ab3da39eba7e33987a73c3df0c82b4bb5813ee871c19c41d48"
SRC_URI[futures-0.3.30.sha256sum] = "645c6916888f6cb6350d2550b80fb63e734897a8498abe35cfb732b6487804b0"
SRC_URI[gdk-pixbuf-sys-0.18.0.sha256sum] = "3f9839ea644ed9c97a34d129ad56d38a25e6756f99f3a88e15cd39c20629caf7"
SRC_URI[gdk-pixbuf-0.18.5.sha256sum] = "50e1f5f1b0bfb830d6ccc8066d18db35c487b1b2b1e8589b5dfe9f07e8defaec"
SRC_URI[gdk-sys-0.18.0.sha256sum] = "31ff856cb3386dae1703a920f803abafcc580e9b5f711ca62ed1620c25b51ff2"
SRC_URI[gdk-0.18.0.sha256sum] = "f5ba081bdef3b75ebcdbfc953699ed2d7417d6bd853347a42a37d76406a33646"
SRC_URI[gio-sys-0.18.1.sha256sum] = "37566df850baf5e4cb0dfb78af2e4b9898d817ed9263d1090a2df958c64737d2"
SRC_URI[gio-0.18.4.sha256sum] = "d4fc8f532f87b79cbc51a79748f16a6828fb784be93145a322fa14d06d354c73"
SRC_URI[glib-macros-0.18.5.sha256sum] = "0bb0228f477c0900c880fd78c8759b95c7636dbd7842707f49e132378aa2acdc"
SRC_URI[glib-sys-0.18.1.sha256sum] = "063ce2eb6a8d0ea93d2bf8ba1957e78dbab6be1c2220dd3daca57d5a9d869898"
SRC_URI[glib-0.18.5.sha256sum] = "233daaf6e83ae6a12a52055f568f9d7cf4671dabb78ff9560ab6da230ce00ee5"
SRC_URI[gobject-sys-0.18.0.sha256sum] = "0850127b514d1c4a4654ead6dedadb18198999985908e6ffe4436f53c785ce44"
SRC_URI[gtk-sys-0.18.0.sha256sum] = "771437bf1de2c1c0b496c11505bdf748e26066bbe942dfc8f614c9460f6d7722"
SRC_URI[gtk-0.18.1.sha256sum] = "93c4f5e0e20b60e10631a5f06da7fe3dda744b05ad0ea71fee2f47adf865890c"
SRC_URI[gtk3-macros-0.18.0.sha256sum] = "c6063efb63db582968fb7df72e1ae68aa6360dcfb0a75143f34fc7d616bad75e"
SRC_URI[hashbrown-0.14.5.sha256sum] = "e5274423e17b7c9fc20b6e7e208532f9b19825d82dfd615708b70edd83df41f1"
SRC_URI[heck-0.4.1.sha256sum] = "95505c38b4572b2d910cecb0281560f54b440a19336cbbcb27bf6ce6adc6f5a8"
SRC_URI[heck-0.5.0.sha256sum] = "2304e00983f87ffb38b55b444b5e3b60a884b5d30c0fca7d82fe33449bbe55ea"
SRC_URI[hermit-abi-0.3.9.sha256sum] = "d231dfb89cfffdbc30e7fc41579ed6066ad03abda9e567ccafae602b97ec5024"
SRC_URI[indexmap-2.4.0.sha256sum] = "93ead53efc7ea8ed3cfb0c79fc8023fbb782a5432b52830b6518941cebe6505c"
SRC_URI[instant-0.1.13.sha256sum] = "e0242819d153cba4b4b05a5a8f2a7e9bbf97b6055b2a002b395c96b5ff3c0222"
SRC_URI[io-lifetimes-1.0.11.sha256sum] = "eae7b9aee968036d54dce06cebaefd919e4472e753296daccd6d344e3e2df0c2"
SRC_URI[itoa-1.0.11.sha256sum] = "49f1f14873335454500d59611f1cf4a4b0f786f9ac11f4312a78e4cf2566695b"
SRC_URI[libc-0.2.155.sha256sum] = "97b3888a4aecf77e811145cadf6eef5901f4782c53886191b2f693f24761847c"
SRC_URI[linux-raw-sys-0.3.8.sha256sum] = "ef53942eb7bf7ff43a617b3e2c1c4a5ecf5944a7c1bc12d7ee39bbb15e5c1519"
SRC_URI[log-0.4.22.sha256sum] = "a7a70ba024b9dc04c27ea2f0c0548feb474ec5c54bba33a7f72f873a39d07b24"
SRC_URI[maplit-1.0.2.sha256sum] = "3e2e65a1a2e43cfcb47a895c4c8b10d1f4a61097f9f254f183aee60cad9c651d"
SRC_URI[memchr-2.7.4.sha256sum] = "78ca9ab1a0babb1e7d5695e3530886289c18cf2f87ec19a575a0abdce112e3a3"
SRC_URI[memmap2-0.8.0.sha256sum] = "43a5a03cefb0d953ec0be133036f14e109412fa594edc2f77227249db66cc3ed"
SRC_URI[memoffset-0.6.5.sha256sum] = "5aa361d4faea93603064a027415f07bd8e1d5c88c9fbf68bf56a285428fd79ce"
SRC_URI[memoffset-0.9.1.sha256sum] = "488016bfae457b036d996092f6cb448677611ce4449e970ceaf42695203f218a"
SRC_URI[nb-connect-1.2.0.sha256sum] = "b1bb540dc6ef51cfe1916ec038ce7a620daf3a111e2502d745197cd53d6bca15"
SRC_URI[nix-0.22.3.sha256sum] = "e4916f159ed8e5de0082076562152a76b7a1f64a01fd9d1e0fea002c37624faf"
SRC_URI[once_cell-1.19.0.sha256sum] = "3fdb12b2476b595f9358c5161aa467c2438859caa136dec86c26fdd2efe17b92"
SRC_URI[pango-sys-0.18.0.sha256sum] = "436737e391a843e5933d6d9aa102cb126d501e815b83601365a948a518555dc5"
SRC_URI[pango-0.18.3.sha256sum] = "7ca27ec1eb0457ab26f3036ea52229edbdb74dee1edd29063f5b9b010e7ebee4"
SRC_URI[parking-2.2.0.sha256sum] = "bb813b8af86854136c6922af0598d719255ecb2179515e6e7730d468f05c9cae"
SRC_URI[pin-project-lite-0.2.14.sha256sum] = "bda66fc9667c18cb2758a2ac84d1167245054bcf85d5d1aaa6923f45801bdd02"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.30.sha256sum] = "d231b230927b5e4ad203db57bbcbee2802f6bce620b1e4a9024a07d94e2907ec"
SRC_URI[polling-2.8.0.sha256sum] = "4b2d323e8ca7996b3e23126511a523f7e62924d93ecd5ae73b333815b0eb3dce"
SRC_URI[proc-macro-crate-0.1.5.sha256sum] = "1d6ea3c4595b96363c13943497db34af4460fb474a95c43f4446ad341b8c9785"
SRC_URI[proc-macro-crate-1.3.1.sha256sum] = "7f4c021e1093a56626774e81216a4ce732a735e5bad4868a03f3ed65ca0c3919"
SRC_URI[proc-macro-crate-2.0.2.sha256sum] = "b00f26d3400549137f92511a46ac1cd8ce37cb5598a96d382381458b992a5d24"
SRC_URI[proc-macro-error-attr-1.0.4.sha256sum] = "a1be40180e52ecc98ad80b184934baf3d0d29f979574e439af5a55274b35f869"
SRC_URI[proc-macro-error-1.0.4.sha256sum] = "da25490ff9892aab3fcf7c36f08cfb902dd3e71ca0f9f9517bea02a73a5ce38c"
SRC_URI[proc-macro2-1.0.86.sha256sum] = "5e719e8df665df0d1c8fbfd238015744736151d4445ec0836b8e628aae103b77"
SRC_URI[quote-1.0.36.sha256sum] = "0fa76aaf39101c457836aec0ce2316dbdc3ab723cdda1c6bd4e6ad4208acaca7"
SRC_URI[rustc_version-0.4.0.sha256sum] = "bfa0f585226d2e68097d4f95d113b15b83a82e819ab25717ec0590d9584ef366"
SRC_URI[rustix-0.37.27.sha256sum] = "fea8ca367a3a01fe35e6943c400addf443c0f57670e6ec51196f71a4b8762dd2"
SRC_URI[ryu-1.0.18.sha256sum] = "f3cb5ba0dc43242ce17de99c180e96db90b235b8a9fdc9543c96d2209116bd9f"
SRC_URI[scoped-tls-1.0.1.sha256sum] = "e1cf6437eb19a8f4a6cc0f7dca544973b0b78843adbfeb3683d1a94a0024a294"
SRC_URI[semver-1.0.23.sha256sum] = "61697e0a1c7e512e84a621326239844a24d8207b4669b41bc18b32ea5cbf988b"
SRC_URI[serde-1.0.207.sha256sum] = "5665e14a49a4ea1b91029ba7d3bca9f299e1f7cfa194388ccc20f14743e784f2"
SRC_URI[serde_derive-1.0.207.sha256sum] = "6aea2634c86b0e8ef2cfdc0c340baede54ec27b1e46febd7f80dffb2aa44a00e"
SRC_URI[serde_repr-0.1.19.sha256sum] = "6c64451ba24fc7a6a2d60fc75dd9c83c90903b19028d4eff35e88fc1e86564e9"
SRC_URI[serde_spanned-0.6.7.sha256sum] = "eb5b1b31579f3811bf615c144393417496f152e12ac8b7663bf664f4a815306d"
SRC_URI[serde_yaml-0.9.34+deprecated.sha256sum] = "6a8b1a1a2ebf674015cc02edccce75287f1a0130d394307b36743c2f5d504b47"
SRC_URI[shlex-1.3.0.sha256sum] = "0fda2ff0d084019ba4d7c6f371c95d8fd75ce3524c3cb8fb653a3023f6323e64"
SRC_URI[slab-0.4.9.sha256sum] = "8f92a496fb766b417c996b9c5e57daf2f7ad3b0bebe1ccfca4856390e3d3bb67"
SRC_URI[smallvec-1.13.2.sha256sum] = "3c5e1a9a646d36c3599cd173a41282daf47c44583ad367b8e6837255952e5c67"
SRC_URI[socket2-0.4.10.sha256sum] = "9f7916fc008ca5542385b89a3d3ce689953c143e9304a9bf8beec1de48994c0d"
SRC_URI[static_assertions-1.1.0.sha256sum] = "a2eb9349b6444b326872e140eb1cf5e7c522154d69e7a0ffb0fb81c06b37543f"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn-2.0.74.sha256sum] = "1fceb41e3d546d0bd83421d3409b1460cc7444cd389341a4c880fe7a042cb3d7"
SRC_URI[system-deps-6.2.2.sha256sum] = "a3e535eb8dded36d55ec13eddacd30dec501792ff23a0b1682c38601b8cf2349"
SRC_URI[target-lexicon-0.12.16.sha256sum] = "61c41af27dd6d1e27b1b16b489db798443478cef1f06a660c96db617ba5de3b1"
SRC_URI[thiserror-impl-1.0.63.sha256sum] = "a4558b58466b9ad7ca0f102865eccc95938dca1a74a856f2b57b6629050da261"
SRC_URI[thiserror-1.0.63.sha256sum] = "c0342370b38b6a11b6cc11d6a805569958d54cfa061a29969c3b5ce2ea405724"
SRC_URI[toml-0.5.11.sha256sum] = "f4f7f0dd8d50a853a531c426359045b1998f04219d88799810762cd4ad314234"
SRC_URI[toml-0.8.2.sha256sum] = "185d8ab0dfbb35cf1399a6344d8484209c088f75f8f68230da55d48d95d43e3d"
SRC_URI[toml_datetime-0.6.3.sha256sum] = "7cda73e2f1397b1262d6dfdcef8aafae14d1de7748d66822d3bfeeb6d03e5e4b"
SRC_URI[toml_edit-0.19.15.sha256sum] = "1b5bb770da30e5cbfde35a2d7b9b8a2c4b8ef89548a7a6aeab5c9a576e3e7421"
SRC_URI[toml_edit-0.20.2.sha256sum] = "396e4d48bbb2b7554c944bde63101b5ae446cff6ec4a24227428f15eb72ef338"
SRC_URI[unicode-ident-1.0.12.sha256sum] = "3354b9ac3fae1ff6755cb6db53683adb661634f67557942dea4facebec0fee4b"
SRC_URI[unsafe-libyaml-0.2.11.sha256sum] = "673aac59facbab8a9007c7f6108d11f63b603f7cabff99fabf650fea5c32b861"
SRC_URI[version-compare-0.2.0.sha256sum] = "852e951cb7832cb45cb1169900d19760cfa39b82bc0ea9c0e5a14ae88411c98b"
SRC_URI[version_check-0.9.5.sha256sum] = "0b928f33d975fc6ad9f86c8f283853ad26bdd5b10b7f1542aa2fa15e2289105a"
SRC_URI[waker-fn-1.2.0.sha256sum] = "317211a0dc0ceedd78fb2ca9a44aed3d7b9b26f81870d485c07122b4350673b7"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-sys-0.52.0.sha256sum] = "282be5f36a8ce781fad8c8ae18fa3f9beff57ec1b52cb3de0789201425d9a33d"
SRC_URI[windows-targets-0.48.5.sha256sum] = "9a2fa6e2155d7247be68c096456083145c183cbbbc2764150dda45a87197940c"
SRC_URI[windows-targets-0.52.6.sha256sum] = "9b724f72796e036ab90c1021d4780d4d3d648aca59e491e6b98e725b84e99973"
SRC_URI[windows_aarch64_gnullvm-0.48.5.sha256sum] = "2b38e32f0abccf9987a4e3079dfb67dcd799fb61361e53e2882c3cbaf0d905d8"
SRC_URI[windows_aarch64_gnullvm-0.52.6.sha256sum] = "32a4622180e7a0ec044bb555404c800bc9fd9ec262ec147edd5989ccd0c02cd3"
SRC_URI[windows_aarch64_msvc-0.48.5.sha256sum] = "dc35310971f3b2dbbf3f0690a219f40e2d9afcf64f9ab7cc1be722937c26b4bc"
SRC_URI[windows_aarch64_msvc-0.52.6.sha256sum] = "09ec2a7bb152e2252b53fa7803150007879548bc709c039df7627cabbd05d469"
SRC_URI[windows_i686_gnu-0.48.5.sha256sum] = "a75915e7def60c94dcef72200b9a8e58e5091744960da64ec734a6c6e9b3743e"
SRC_URI[windows_i686_gnu-0.52.6.sha256sum] = "8e9b5ad5ab802e97eb8e295ac6720e509ee4c243f69d781394014ebfe8bbfa0b"
SRC_URI[windows_i686_gnullvm-0.52.6.sha256sum] = "0eee52d38c090b3caa76c563b86c3a4bd71ef1a819287c19d586d7334ae8ed66"
SRC_URI[windows_i686_msvc-0.48.5.sha256sum] = "8f55c233f70c4b27f66c523580f78f1004e8b5a8b659e05a4eb49d4166cca406"
SRC_URI[windows_i686_msvc-0.52.6.sha256sum] = "240948bc05c5e7c6dabba28bf89d89ffce3e303022809e73deaefe4f6ec56c66"
SRC_URI[windows_x86_64_gnu-0.48.5.sha256sum] = "53d40abd2583d23e4718fddf1ebec84dbff8381c07cae67ff7768bbf19c6718e"
SRC_URI[windows_x86_64_gnu-0.52.6.sha256sum] = "147a5c80aabfbf0c7d901cb5895d1de30ef2907eb21fbbab29ca94c5b08b1a78"
SRC_URI[windows_x86_64_gnullvm-0.48.5.sha256sum] = "0b7b52767868a23d5bab768e390dc5f5c55825b6d30b86c844ff2dc7414044cc"
SRC_URI[windows_x86_64_gnullvm-0.52.6.sha256sum] = "24d5b23dc417412679681396f2b49f3de8c1473deb516bd34410872eff51ed0d"
SRC_URI[windows_x86_64_msvc-0.48.5.sha256sum] = "ed94fce61571a4006852b7389a063ab983c02eb1bb37b47f8272ce92d06d9538"
SRC_URI[windows_x86_64_msvc-0.52.6.sha256sum] = "589f6da84c646204747d1270a2a5661ea66ed1cced2631d546fdfb155959f9ec"
SRC_URI[winnow-0.5.40.sha256sum] = "f593a95398737aeed53e489c785df13f3618e41dbcd6718c6addbf1395aa6876"
SRC_URI[xkbcommon-0.7.0.sha256sum] = "13867d259930edc7091a6c41b4ce6eee464328c6ff9659b7e4c668ca20d4c91e"
SRC_URI[xkeysym-0.2.1.sha256sum] = "b9cc00251562a284751c9973bace760d86c0276c471b4be569fe6b068ee97a56"
SRC_URI[zbus-1.9.3.sha256sum] = "9cbeb2291cd7267a94489b71376eda33496c1b9881adf6b36f26cc2779f3fc49"
SRC_URI[zbus_macros-1.9.3.sha256sum] = "fa3959a7847cf95e3d51e312856617c5b1b77191176c65a79a5f14d778bbe0a6"
SRC_URI[zvariant-2.10.0.sha256sum] = "a68c7b55f2074489b7e8e07d2d0a6ee6b4f233867a653c664d8020ba53692525"
SRC_URI[zvariant_derive-2.10.0.sha256sum] = "e4ca5e22593eb4212382d60d26350065bf2a02c34b85bc850474a74b589a3de9"

# Modify these as desired
PV = "1.41.0"
SRCREV = "35785f3d41def08106a3a563fa1ea4e3c8e9b2c7"

S = "${WORKDIR}/git"

inherit cargo meson rust pkgconfig

EXTRA_OEMESON = "\
    -Dcargo-flags=[\'--target\',\'${RUST_HOST_SYS}\',\'-v\'] \
    -Dtests=false \
    -Ddepdatadir=${datadir} \
"

export CARGO_FEATURE_STD = "1"

do_configure() {
    cargo_common_do_configure
    meson_do_configure
}

do_compile() {
    oe_cargo_fix_env
    export RUSTFLAGS="${RUSTFLAGS}"
    export RUST_TARGET_PATH="${RUST_TARGET_PATH}"
    meson_do_compile
}

do_install() {
    oe_cargo_fix_env
    export RUSTFLAGS="${RUSTFLAGS}"
    export RUST_TARGET_PATH="${RUST_TARGET_PATH}"
    meson_do_install

    install -d ${D}${sysconfdir}/xdg/autostart
    cp ${D}${datadir}/applications/sm.puri.Squeekboard.desktop ${D}${sysconfdir}/xdg/autostart
}