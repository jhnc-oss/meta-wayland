SUMMARY = "GUI for setting wallpapers, written in Rust"
HOMEPAGE = "https://github.com/nnyyxxxx/hyprpapergui.git"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI += "git://github.com/nnyyxxxx/hyprwall.git;protocol=https;nobranch=1;branch=main"
SRC_URI += "file://0001-Cargo.toml-set-panic-to-unwind-dont-strip.patch"
SRC_URI += "file://0001-main.rs-adjust-application_id.patch"
SRCREV = "65773367eac77d1e122a607ca64008841f70ddc7"
S = "${WORKDIR}/git"
PV = "0.1.6"

DEPENDS = "gdk-pixbuf graphene gtk4"

inherit cargo pkgconfig gtk-icon-cache

SRC_URI += " \
    crate://crates.io/addr2line/0.24.2 \
    crate://crates.io/adler2/2.0.0 \
    crate://crates.io/anstream/0.6.17 \
    crate://crates.io/anstyle-parse/0.2.6 \
    crate://crates.io/anstyle-query/1.1.2 \
    crate://crates.io/anstyle-wincon/3.0.6 \
    crate://crates.io/anstyle/1.0.9 \
    crate://crates.io/autocfg/1.4.0 \
    crate://crates.io/backtrace/0.3.74 \
    crate://crates.io/bitflags/2.6.0 \
    crate://crates.io/byteorder/1.5.0 \
    crate://crates.io/bytes/1.8.0 \
    crate://crates.io/cairo-rs/0.18.5 \
    crate://crates.io/cairo-rs/0.20.1 \
    crate://crates.io/cairo-sys-rs/0.18.2 \
    crate://crates.io/cairo-sys-rs/0.20.0 \
    crate://crates.io/cfg-expr/0.15.8 \
    crate://crates.io/cfg-expr/0.17.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap/4.5.20 \
    crate://crates.io/clap_builder/4.5.20 \
    crate://crates.io/clap_derive/4.5.18 \
    crate://crates.io/clap_lex/0.7.2 \
    crate://crates.io/colorchoice/1.0.3 \
    crate://crates.io/crossbeam-channel/0.5.13 \
    crate://crates.io/crossbeam-deque/0.8.5 \
    crate://crates.io/crossbeam-epoch/0.9.18 \
    crate://crates.io/crossbeam-utils/0.8.20 \
    crate://crates.io/dirs-sys/0.4.1 \
    crate://crates.io/dirs/5.0.1 \
    crate://crates.io/either/1.13.0 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/field-offset/0.3.6 \
    crate://crates.io/futures-channel/0.3.31 \
    crate://crates.io/futures-core/0.3.31 \
    crate://crates.io/futures-executor/0.3.31 \
    crate://crates.io/futures-io/0.3.31 \
    crate://crates.io/futures-macro/0.3.31 \
    crate://crates.io/futures-task/0.3.31 \
    crate://crates.io/futures-util/0.3.31 \
    crate://crates.io/gdk-pixbuf-sys/0.18.0 \
    crate://crates.io/gdk-pixbuf-sys/0.20.4 \
    crate://crates.io/gdk-pixbuf/0.18.5 \
    crate://crates.io/gdk-pixbuf/0.20.4 \
    crate://crates.io/gdk-sys/0.18.0 \
    crate://crates.io/gdk/0.18.0 \
    crate://crates.io/gdk4-sys/0.9.2 \
    crate://crates.io/gdk4/0.9.2 \
    crate://crates.io/getrandom/0.2.15 \
    crate://crates.io/gimli/0.31.1 \
    crate://crates.io/gio-sys/0.18.1 \
    crate://crates.io/gio-sys/0.20.4 \
    crate://crates.io/gio/0.18.4 \
    crate://crates.io/gio/0.20.4 \
    crate://crates.io/glib-macros/0.18.5 \
    crate://crates.io/glib-macros/0.20.4 \
    crate://crates.io/glib-sys/0.18.1 \
    crate://crates.io/glib-sys/0.20.4 \
    crate://crates.io/glib/0.18.5 \
    crate://crates.io/glib/0.20.4 \
    crate://crates.io/gobject-sys/0.18.0 \
    crate://crates.io/gobject-sys/0.20.4 \
    crate://crates.io/graphene-rs/0.20.4 \
    crate://crates.io/graphene-sys/0.20.4 \
    crate://crates.io/gsk4-sys/0.9.2 \
    crate://crates.io/gsk4/0.9.2 \
    crate://crates.io/gtk4-macros/0.9.1 \
    crate://crates.io/gtk4-sys/0.9.2 \
    crate://crates.io/gtk4/0.9.2 \
    crate://crates.io/hashbrown/0.15.0 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/heck/0.5.0 \
    crate://crates.io/hermit-abi/0.3.9 \
    crate://crates.io/indexmap/2.6.0 \
    crate://crates.io/is_terminal_polyfill/1.70.1 \
    crate://crates.io/lazy_static/1.5.0 \
    crate://crates.io/libc/0.2.161 \
    crate://crates.io/libredox/0.1.3 \
    crate://crates.io/lock_api/0.4.12 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/memoffset/0.9.1 \
    crate://crates.io/miniz_oxide/0.8.0 \
    crate://crates.io/mio/1.0.2 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/object/0.36.5 \
    crate://crates.io/once_cell/1.20.2 \
    crate://crates.io/option-ext/0.2.0 \
    crate://crates.io/pango-sys/0.18.0 \
    crate://crates.io/pango-sys/0.20.4 \
    crate://crates.io/pango/0.18.3 \
    crate://crates.io/pango/0.20.4 \
    crate://crates.io/parking_lot/0.12.3 \
    crate://crates.io/parking_lot_core/0.9.10 \
    crate://crates.io/pin-project-lite/0.2.15 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.31 \
    crate://crates.io/ppv-lite86/0.2.20 \
    crate://crates.io/proc-macro-crate/2.0.0 \
    crate://crates.io/proc-macro-crate/3.2.0 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.89 \
    crate://crates.io/quote/1.0.37 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rayon-core/1.12.1 \
    crate://crates.io/rayon/1.10.0 \
    crate://crates.io/redox_syscall/0.5.7 \
    crate://crates.io/redox_users/0.4.6 \
    crate://crates.io/rustc-demangle/0.1.24 \
    crate://crates.io/rustc_version/0.4.1 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/semver/1.0.23 \
    crate://crates.io/serde/1.0.213 \
    crate://crates.io/serde_derive/1.0.213 \
    crate://crates.io/serde_spanned/0.6.8 \
    crate://crates.io/shellexpand/3.1.0 \
    crate://crates.io/signal-hook-registry/1.4.2 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/smallvec/1.13.2 \
    crate://crates.io/socket2/0.5.7 \
    crate://crates.io/strsim/0.11.1 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.85 \
    crate://crates.io/system-deps/6.2.2 \
    crate://crates.io/system-deps/7.0.3 \
    crate://crates.io/target-lexicon/0.12.16 \
    crate://crates.io/thiserror-impl/1.0.65 \
    crate://crates.io/thiserror/1.0.65 \
    crate://crates.io/tokio-macros/2.4.0 \
    crate://crates.io/tokio/1.41.0 \
    crate://crates.io/toml/0.8.19 \
    crate://crates.io/toml_datetime/0.6.8 \
    crate://crates.io/toml_edit/0.20.7 \
    crate://crates.io/toml_edit/0.22.22 \
    crate://crates.io/unicode-ident/1.0.13 \
    crate://crates.io/utf8parse/0.2.2 \
    crate://crates.io/version-compare/0.2.0 \
    crate://crates.io/version_check/0.9.5 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-sys/0.59.0 \
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
    crate://crates.io/winnow/0.6.20 \
    crate://crates.io/zerocopy-derive/0.7.35 \
    crate://crates.io/zerocopy/0.7.35 \
"

SRC_URI[addr2line-0.24.2.sha256sum] = "dfbe277e56a376000877090da837660b4427aad530e3028d44e0bffe4f89a1c1"
SRC_URI[adler2-2.0.0.sha256sum] = "512761e0bb2578dd7380c6baaa0f4ce03e84f95e960231d1dec8bf4d7d6e2627"
SRC_URI[anstream-0.6.17.sha256sum] = "23a1e53f0f5d86382dafe1cf314783b2044280f406e7e1506368220ad11b1338"
SRC_URI[anstyle-parse-0.2.6.sha256sum] = "3b2d16507662817a6a20a9ea92df6652ee4f94f914589377d69f3b21bc5798a9"
SRC_URI[anstyle-query-1.1.2.sha256sum] = "79947af37f4177cfead1110013d678905c37501914fba0efea834c3fe9a8d60c"
SRC_URI[anstyle-wincon-3.0.6.sha256sum] = "2109dbce0e72be3ec00bed26e6a7479ca384ad226efdd66db8fa2e3a38c83125"
SRC_URI[anstyle-1.0.9.sha256sum] = "8365de52b16c035ff4fcafe0092ba9390540e3e352870ac09933bebcaa2c8c56"
SRC_URI[autocfg-1.4.0.sha256sum] = "ace50bade8e6234aa140d9a2f552bbee1db4d353f69b8217bc503490fc1a9f26"
SRC_URI[backtrace-0.3.74.sha256sum] = "8d82cb332cdfaed17ae235a638438ac4d4839913cc2af585c3c6746e8f8bee1a"
SRC_URI[bitflags-2.6.0.sha256sum] = "b048fb63fd8b5923fc5aa7b340d8e156aec7ec02f0c78fa8a6ddc2613f6f71de"
SRC_URI[byteorder-1.5.0.sha256sum] = "1fd0f2584146f6f2ef48085050886acf353beff7305ebd1ae69500e27c67f64b"
SRC_URI[bytes-1.8.0.sha256sum] = "9ac0150caa2ae65ca5bd83f25c7de183dea78d4d366469f148435e2acfbad0da"
SRC_URI[cairo-rs-0.18.5.sha256sum] = "8ca26ef0159422fb77631dc9d17b102f253b876fe1586b03b803e63a309b4ee2"
SRC_URI[cairo-rs-0.20.1.sha256sum] = "e8a0ea147c94108c9613235388f540e4d14c327f7081c9e471fc8ee8a2533e69"
SRC_URI[cairo-sys-rs-0.18.2.sha256sum] = "685c9fa8e590b8b3d678873528d83411db17242a73fccaed827770ea0fedda51"
SRC_URI[cairo-sys-rs-0.20.0.sha256sum] = "428290f914b9b86089f60f5d8a9f6e440508e1bcff23b25afd51502b0a2da88f"
SRC_URI[cfg-expr-0.15.8.sha256sum] = "d067ad48b8650848b989a59a86c6c36a995d02d2bf778d45c3c5d57bc2718f02"
SRC_URI[cfg-expr-0.17.0.sha256sum] = "d0890061c4d3223e7267f3bad2ec40b997d64faac1c2815a4a9d95018e2b9e9c"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[clap-4.5.20.sha256sum] = "b97f376d85a664d5837dbae44bf546e6477a679ff6610010f17276f686d867e8"
SRC_URI[clap_builder-4.5.20.sha256sum] = "19bc80abd44e4bed93ca373a0704ccbd1b710dc5749406201bb018272808dc54"
SRC_URI[clap_derive-4.5.18.sha256sum] = "4ac6a0c7b1a9e9a5186361f67dfa1b88213572f427fb9ab038efb2bd8c582dab"
SRC_URI[clap_lex-0.7.2.sha256sum] = "1462739cb27611015575c0c11df5df7601141071f07518d56fcc1be504cbec97"
SRC_URI[colorchoice-1.0.3.sha256sum] = "5b63caa9aa9397e2d9480a9b13673856c78d8ac123288526c37d7839f2a86990"
SRC_URI[crossbeam-channel-0.5.13.sha256sum] = "33480d6946193aa8033910124896ca395333cae7e2d1113d1fef6c3272217df2"
SRC_URI[crossbeam-deque-0.8.5.sha256sum] = "613f8cc01fe9cf1a3eb3d7f488fd2fa8388403e97039e2f73692932e291a770d"
SRC_URI[crossbeam-epoch-0.9.18.sha256sum] = "5b82ac4a3c2ca9c3460964f020e1402edd5753411d7737aa39c3714ad1b5420e"
SRC_URI[crossbeam-utils-0.8.20.sha256sum] = "22ec99545bb0ed0ea7bb9b8e1e9122ea386ff8a48c0922e43f36d45ab09e0e80"
SRC_URI[dirs-sys-0.4.1.sha256sum] = "520f05a5cbd335fae5a99ff7a6ab8627577660ee5cfd6a94a6a929b52ff0321c"
SRC_URI[dirs-5.0.1.sha256sum] = "44c45a9d03d6676652bcb5e724c7e988de1acad23a711b5217ab9cbecbec2225"
SRC_URI[either-1.13.0.sha256sum] = "60b1af1c220855b6ceac025d3f6ecdd2b7c4894bfe9cd9bda4fbb4bc7c0d4cf0"
SRC_URI[equivalent-1.0.1.sha256sum] = "5443807d6dff69373d433ab9ef5378ad8df50ca6298caf15de6e52e24aaf54d5"
SRC_URI[field-offset-0.3.6.sha256sum] = "38e2275cc4e4fc009b0669731a1e5ab7ebf11f469eaede2bab9309a5b4d6057f"
SRC_URI[futures-channel-0.3.31.sha256sum] = "2dff15bf788c671c1934e366d07e30c1814a8ef514e1af724a602e8a2fbe1b10"
SRC_URI[futures-core-0.3.31.sha256sum] = "05f29059c0c2090612e8d742178b0580d2dc940c837851ad723096f87af6663e"
SRC_URI[futures-executor-0.3.31.sha256sum] = "1e28d1d997f585e54aebc3f97d39e72338912123a67330d723fdbb564d646c9f"
SRC_URI[futures-io-0.3.31.sha256sum] = "9e5c1b78ca4aae1ac06c48a526a655760685149f0d465d21f37abfe57ce075c6"
SRC_URI[futures-macro-0.3.31.sha256sum] = "162ee34ebcb7c64a8abebc059ce0fee27c2262618d7b60ed8faf72fef13c3650"
SRC_URI[futures-task-0.3.31.sha256sum] = "f90f7dce0722e95104fcb095585910c0977252f286e354b5e3bd38902cd99988"
SRC_URI[futures-util-0.3.31.sha256sum] = "9fa08315bb612088cc391249efdc3bc77536f16c91f6cf495e6fbe85b20a4a81"
SRC_URI[gdk-pixbuf-sys-0.18.0.sha256sum] = "3f9839ea644ed9c97a34d129ad56d38a25e6756f99f3a88e15cd39c20629caf7"
SRC_URI[gdk-pixbuf-sys-0.20.4.sha256sum] = "687343b059b91df5f3fbd87b4307038fa9e647fcc0461d0d3f93e94fee20bf3d"
SRC_URI[gdk-pixbuf-0.18.5.sha256sum] = "50e1f5f1b0bfb830d6ccc8066d18db35c487b1b2b1e8589b5dfe9f07e8defaec"
SRC_URI[gdk-pixbuf-0.20.4.sha256sum] = "c4c29071a9e92337d8270a85cb0510cda4ac478be26d09ad027cc1d081911b19"
SRC_URI[gdk-sys-0.18.0.sha256sum] = "31ff856cb3386dae1703a920f803abafcc580e9b5f711ca62ed1620c25b51ff2"
SRC_URI[gdk-0.18.0.sha256sum] = "f5ba081bdef3b75ebcdbfc953699ed2d7417d6bd853347a42a37d76406a33646"
SRC_URI[gdk4-sys-0.9.2.sha256sum] = "7d3c03d1ea9d5199f14f060890fde68a3b5ec5699144773d1fa6abf337bfbc9c"
SRC_URI[gdk4-0.9.2.sha256sum] = "c121aeeb0cf7545877ae615dac6bfd088b739d8abee4d55e7143b06927d16a31"
SRC_URI[getrandom-0.2.15.sha256sum] = "c4567c8db10ae91089c99af84c68c38da3ec2f087c3f82960bcdbf3656b6f4d7"
SRC_URI[gimli-0.31.1.sha256sum] = "07e28edb80900c19c28f1072f2e8aeca7fa06b23cd4169cefe1af5aa3260783f"
SRC_URI[gio-sys-0.18.1.sha256sum] = "37566df850baf5e4cb0dfb78af2e4b9898d817ed9263d1090a2df958c64737d2"
SRC_URI[gio-sys-0.20.4.sha256sum] = "4f7efc368de04755344f0084104835b6bb71df2c1d41e37d863947392a894779"
SRC_URI[gio-0.18.4.sha256sum] = "d4fc8f532f87b79cbc51a79748f16a6828fb784be93145a322fa14d06d354c73"
SRC_URI[gio-0.20.4.sha256sum] = "b8d999e8fb09583e96080867e364bc1e701284ad206c76a5af480d63833ad43c"
SRC_URI[glib-macros-0.18.5.sha256sum] = "0bb0228f477c0900c880fd78c8759b95c7636dbd7842707f49e132378aa2acdc"
SRC_URI[glib-macros-0.20.4.sha256sum] = "a6bf88f70cd5720a6197639dcabcb378dd528d0cb68cb1f45e3b358bcb841cd7"
SRC_URI[glib-sys-0.18.1.sha256sum] = "063ce2eb6a8d0ea93d2bf8ba1957e78dbab6be1c2220dd3daca57d5a9d869898"
SRC_URI[glib-sys-0.20.4.sha256sum] = "5f9eca5d88cfa6a453b00d203287c34a2b7cac3a7831779aa2bb0b3c7233752b"
SRC_URI[glib-0.18.5.sha256sum] = "233daaf6e83ae6a12a52055f568f9d7cf4671dabb78ff9560ab6da230ce00ee5"
SRC_URI[glib-0.20.4.sha256sum] = "adcf1ec6d3650bf9fdbc6cee242d4fcebc6f6bfd9bea5b929b6a8b7344eb85ff"
SRC_URI[gobject-sys-0.18.0.sha256sum] = "0850127b514d1c4a4654ead6dedadb18198999985908e6ffe4436f53c785ce44"
SRC_URI[gobject-sys-0.20.4.sha256sum] = "a4c674d2ff8478cf0ec29d2be730ed779fef54415a2fb4b565c52def62696462"
SRC_URI[graphene-rs-0.20.4.sha256sum] = "1f53144c7fe78292705ff23935f1477d511366fb2f73c43d63b37be89076d2fe"
SRC_URI[graphene-sys-0.20.4.sha256sum] = "e741797dc5081e59877a4d72c442c72d61efdd99161a0b1c1b29b6b988934b99"
SRC_URI[gsk4-sys-0.9.2.sha256sum] = "0f9fb607554f9f4e8829eb7ea301b0fde051e1dbfd5d16b143a8a9c2fac6c01b"
SRC_URI[gsk4-0.9.2.sha256sum] = "aa21a2f7c51ee1c6cc1242c2faf3aae2b7566138f182696759987bde8219e922"
SRC_URI[gtk4-macros-0.9.1.sha256sum] = "e9e7b362c8fccd2712297903717d65d30defdab2b509bc9d209cbe5ffb9fabaf"
SRC_URI[gtk4-sys-0.9.2.sha256sum] = "cbe4325908b1c1642dbb48e9f49c07a73185babf43e8b2065b0f881a589f55b8"
SRC_URI[gtk4-0.9.2.sha256sum] = "31e2d105ce672f5cdcb5af2602e91c2901e91c72da15ab76f613ad57ecf04c6d"
SRC_URI[hashbrown-0.15.0.sha256sum] = "1e087f84d4f86bf4b218b927129862374b72199ae7d8657835f1e89000eea4fb"
SRC_URI[heck-0.4.1.sha256sum] = "95505c38b4572b2d910cecb0281560f54b440a19336cbbcb27bf6ce6adc6f5a8"
SRC_URI[heck-0.5.0.sha256sum] = "2304e00983f87ffb38b55b444b5e3b60a884b5d30c0fca7d82fe33449bbe55ea"
SRC_URI[hermit-abi-0.3.9.sha256sum] = "d231dfb89cfffdbc30e7fc41579ed6066ad03abda9e567ccafae602b97ec5024"
SRC_URI[indexmap-2.6.0.sha256sum] = "707907fe3c25f5424cce2cb7e1cbcafee6bdbe735ca90ef77c29e84591e5b9da"
SRC_URI[is_terminal_polyfill-1.70.1.sha256sum] = "7943c866cc5cd64cbc25b2e01621d07fa8eb2a1a23160ee81ce38704e97b8ecf"
SRC_URI[lazy_static-1.5.0.sha256sum] = "bbd2bcb4c963f2ddae06a2efc7e9f3591312473c50c6685e1f298068316e66fe"
SRC_URI[libc-0.2.161.sha256sum] = "8e9489c2807c139ffd9c1794f4af0ebe86a828db53ecdc7fea2111d0fed085d1"
SRC_URI[libredox-0.1.3.sha256sum] = "c0ff37bd590ca25063e35af745c343cb7a0271906fb7b37e4813e8f79f00268d"
SRC_URI[lock_api-0.4.12.sha256sum] = "07af8b9cdd281b7915f413fa73f29ebd5d55d0d3f0155584dade1ff18cea1b17"
SRC_URI[memchr-2.7.4.sha256sum] = "78ca9ab1a0babb1e7d5695e3530886289c18cf2f87ec19a575a0abdce112e3a3"
SRC_URI[memoffset-0.9.1.sha256sum] = "488016bfae457b036d996092f6cb448677611ce4449e970ceaf42695203f218a"
SRC_URI[miniz_oxide-0.8.0.sha256sum] = "e2d80299ef12ff69b16a84bb182e3b9df68b5a91574d3d4fa6e41b65deec4df1"
SRC_URI[mio-1.0.2.sha256sum] = "80e04d1dcff3aae0704555fe5fee3bcfaf3d1fdf8a7e521d5b9d2b42acb52cec"
SRC_URI[num_cpus-1.16.0.sha256sum] = "4161fcb6d602d4d2081af7c3a45852d875a03dd337a6bfdd6e06407b61342a43"
SRC_URI[object-0.36.5.sha256sum] = "aedf0a2d09c573ed1d8d85b30c119153926a2b36dce0ab28322c09a117a4683e"
SRC_URI[once_cell-1.20.2.sha256sum] = "1261fe7e33c73b354eab43b1273a57c8f967d0391e80353e51f764ac02cf6775"
SRC_URI[option-ext-0.2.0.sha256sum] = "04744f49eae99ab78e0d5c0b603ab218f515ea8cfe5a456d7629ad883a3b6e7d"
SRC_URI[pango-sys-0.18.0.sha256sum] = "436737e391a843e5933d6d9aa102cb126d501e815b83601365a948a518555dc5"
SRC_URI[pango-sys-0.20.4.sha256sum] = "84fd65917bf12f06544ae2bbc200abf9fc0a513a5a88a0fa81013893aef2b838"
SRC_URI[pango-0.18.3.sha256sum] = "7ca27ec1eb0457ab26f3036ea52229edbdb74dee1edd29063f5b9b010e7ebee4"
SRC_URI[pango-0.20.4.sha256sum] = "aa26aa54b11094d72141a754901cd71d9356432bb8147f9cace8d9c7ba95f356"
SRC_URI[parking_lot-0.12.3.sha256sum] = "f1bf18183cf54e8d6059647fc3063646a1801cf30896933ec2311622cc4b9a27"
SRC_URI[parking_lot_core-0.9.10.sha256sum] = "1e401f977ab385c9e4e3ab30627d6f26d00e2c73eef317493c4ec6d468726cf8"
SRC_URI[pin-project-lite-0.2.15.sha256sum] = "915a1e146535de9163f3987b8944ed8cf49a18bb0056bcebcdcece385cece4ff"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.31.sha256sum] = "953ec861398dccce10c670dfeaf3ec4911ca479e9c02154b3a215178c5f566f2"
SRC_URI[ppv-lite86-0.2.20.sha256sum] = "77957b295656769bb8ad2b6a6b09d897d94f05c41b069aede1fcdaa675eaea04"
SRC_URI[proc-macro-crate-2.0.0.sha256sum] = "7e8366a6159044a37876a2b9817124296703c586a5c92e2c53751fa06d8d43e8"
SRC_URI[proc-macro-crate-3.2.0.sha256sum] = "8ecf48c7ca261d60b74ab1a7b20da18bede46776b2e55535cb958eb595c5fa7b"
SRC_URI[proc-macro-error-attr-1.0.4.sha256sum] = "a1be40180e52ecc98ad80b184934baf3d0d29f979574e439af5a55274b35f869"
SRC_URI[proc-macro-error-1.0.4.sha256sum] = "da25490ff9892aab3fcf7c36f08cfb902dd3e71ca0f9f9517bea02a73a5ce38c"
SRC_URI[proc-macro2-1.0.89.sha256sum] = "f139b0662de085916d1fb67d2b4169d1addddda1919e696f3252b740b629986e"
SRC_URI[quote-1.0.37.sha256sum] = "b5b9d34b8991d19d98081b46eacdd8eb58c6f2b201139f7c5f643cc155a633af"
SRC_URI[rand-0.8.5.sha256sum] = "34af8d1a0e25924bc5b7c43c079c942339d8f0a8b57c39049bef581b46327404"
SRC_URI[rand_chacha-0.3.1.sha256sum] = "e6c10a63a0fa32252be49d21e7709d4d4baf8d231c2dbce1eaa8141b9b127d88"
SRC_URI[rand_core-0.6.4.sha256sum] = "ec0be4795e2f6a28069bec0b5ff3e2ac9bafc99e6a9a7dc3547996c5c816922c"
SRC_URI[rayon-core-1.12.1.sha256sum] = "1465873a3dfdaa8ae7cb14b4383657caab0b3e8a0aa9ae8e04b044854c8dfce2"
SRC_URI[rayon-1.10.0.sha256sum] = "b418a60154510ca1a002a752ca9714984e21e4241e804d32555251faf8b78ffa"
SRC_URI[redox_syscall-0.5.7.sha256sum] = "9b6dfecf2c74bce2466cabf93f6664d6998a69eb21e39f4207930065b27b771f"
SRC_URI[redox_users-0.4.6.sha256sum] = "ba009ff324d1fc1b900bd1fdb31564febe58a8ccc8a6fdbb93b543d33b13ca43"
SRC_URI[rustc-demangle-0.1.24.sha256sum] = "719b953e2095829ee67db738b3bfa9fa368c94900df327b3f07fe6e794d2fe1f"
SRC_URI[rustc_version-0.4.1.sha256sum] = "cfcb3a22ef46e85b45de6ee7e79d063319ebb6594faafcf1c225ea92ab6e9b92"
SRC_URI[scopeguard-1.2.0.sha256sum] = "94143f37725109f92c262ed2cf5e59bce7498c01bcc1502d7b9afe439a4e9f49"
SRC_URI[semver-1.0.23.sha256sum] = "61697e0a1c7e512e84a621326239844a24d8207b4669b41bc18b32ea5cbf988b"
SRC_URI[serde-1.0.213.sha256sum] = "3ea7893ff5e2466df8d720bb615088341b295f849602c6956047f8f80f0e9bc1"
SRC_URI[serde_derive-1.0.213.sha256sum] = "7e85ad2009c50b58e87caa8cd6dac16bdf511bbfb7af6c33df902396aa480fa5"
SRC_URI[serde_spanned-0.6.8.sha256sum] = "87607cb1398ed59d48732e575a4c28a7a8ebf2454b964fe3f224f2afc07909e1"
SRC_URI[shellexpand-3.1.0.sha256sum] = "da03fa3b94cc19e3ebfc88c4229c49d8f08cdbd1228870a45f0ffdf84988e14b"
SRC_URI[signal-hook-registry-1.4.2.sha256sum] = "a9e9e0b4211b72e7b8b6e85c807d36c212bdb33ea8587f7569562a84df5465b1"
SRC_URI[slab-0.4.9.sha256sum] = "8f92a496fb766b417c996b9c5e57daf2f7ad3b0bebe1ccfca4856390e3d3bb67"
SRC_URI[smallvec-1.13.2.sha256sum] = "3c5e1a9a646d36c3599cd173a41282daf47c44583ad367b8e6837255952e5c67"
SRC_URI[socket2-0.5.7.sha256sum] = "ce305eb0b4296696835b71df73eb912e0f1ffd2556a501fcede6e0c50349191c"
SRC_URI[strsim-0.11.1.sha256sum] = "7da8b5736845d9f2fcb837ea5d9e2628564b3b043a70948a3f0b778838c5fb4f"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn-2.0.85.sha256sum] = "5023162dfcd14ef8f32034d8bcd4cc5ddc61ef7a247c024a33e24e1f24d21b56"
SRC_URI[system-deps-6.2.2.sha256sum] = "a3e535eb8dded36d55ec13eddacd30dec501792ff23a0b1682c38601b8cf2349"
SRC_URI[system-deps-7.0.3.sha256sum] = "66d23aaf9f331227789a99e8de4c91bf46703add012bdfd45fdecdfb2975a005"
SRC_URI[target-lexicon-0.12.16.sha256sum] = "61c41af27dd6d1e27b1b16b489db798443478cef1f06a660c96db617ba5de3b1"
SRC_URI[thiserror-impl-1.0.65.sha256sum] = "ae71770322cbd277e69d762a16c444af02aa0575ac0d174f0b9562d3b37f8602"
SRC_URI[thiserror-1.0.65.sha256sum] = "5d11abd9594d9b38965ef50805c5e469ca9cc6f197f883f717e0269a3057b3d5"
SRC_URI[tokio-macros-2.4.0.sha256sum] = "693d596312e88961bc67d7f1f97af8a70227d9f90c31bba5806eec004978d752"
SRC_URI[tokio-1.41.0.sha256sum] = "145f3413504347a2be84393cc8a7d2fb4d863b375909ea59f2158261aa258bbb"
SRC_URI[toml-0.8.19.sha256sum] = "a1ed1f98e3fdc28d6d910e6737ae6ab1a93bf1985935a1193e68f93eeb68d24e"
SRC_URI[toml_datetime-0.6.8.sha256sum] = "0dd7358ecb8fc2f8d014bf86f6f638ce72ba252a2c3a2572f2a795f1d23efb41"
SRC_URI[toml_edit-0.20.7.sha256sum] = "70f427fce4d84c72b5b732388bf4a9f4531b53f74e2887e3ecb2481f68f66d81"
SRC_URI[toml_edit-0.22.22.sha256sum] = "4ae48d6208a266e853d946088ed816055e556cc6028c5e8e2b84d9fa5dd7c7f5"
SRC_URI[unicode-ident-1.0.13.sha256sum] = "e91b56cd4cadaeb79bbf1a5645f6b4f8dc5bde8834ad5894a8db35fda9efa1fe"
SRC_URI[utf8parse-0.2.2.sha256sum] = "06abde3611657adf66d383f00b093d7faecc7fa57071cce2578660c9f1010821"
SRC_URI[version-compare-0.2.0.sha256sum] = "852e951cb7832cb45cb1169900d19760cfa39b82bc0ea9c0e5a14ae88411c98b"
SRC_URI[version_check-0.9.5.sha256sum] = "0b928f33d975fc6ad9f86c8f283853ad26bdd5b10b7f1542aa2fa15e2289105a"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-sys-0.52.0.sha256sum] = "282be5f36a8ce781fad8c8ae18fa3f9beff57ec1b52cb3de0789201425d9a33d"
SRC_URI[windows-sys-0.59.0.sha256sum] = "1e38bc4d79ed67fd075bcc251a1c39b32a1776bbe92e5bef1f0bf1f8c531853b"
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
SRC_URI[winnow-0.6.20.sha256sum] = "36c1fec1a2bb5866f07c25f68c26e565c4c200aebb96d7e55710c19d3e8ac49b"
SRC_URI[zerocopy-derive-0.7.35.sha256sum] = "fa4f8080344d4671fb4e831a13ad1e68092748387dfc4f55e356242fae12ce3e"
SRC_URI[zerocopy-0.7.35.sha256sum] = "1b9b4fd18abc82b8136838da5d50bae7bdea537c574d8dc1a34ed098d6c166f0"

do_install:append() {
	install -d ${D}${datadir}/applications ${D}${datadir}/icons/hicolor/scalable/apps
	install -m 0644 ${S}/hyprwall.desktop ${D}${datadir}/applications
	install -m 0644 ${S}/hyprwall.svg ${D}${datadir}/icons/hicolor/scalable/apps
}

FILES:${PN} += "${datadir}"
