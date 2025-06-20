SUMMARY = "Clean and customizable greeter for greetd"
HOMEPAGE = "https://github.com/rharish101/ReGreet/"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8da5784ab1c72e63ac74971f88658166"

SRC_URI += " \
    git://github.com/rharish101/ReGreet.git;protocol=https;nobranch=1;branch=main \
    crate://crates.io/addr2line/0.21.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/ahash/0.8.7 \
    crate://crates.io/aho-corasick/1.1.2 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anstream/0.6.11 \
    crate://crates.io/anstyle-parse/0.2.3 \
    crate://crates.io/anstyle-query/1.0.2 \
    crate://crates.io/anstyle-wincon/3.0.2 \
    crate://crates.io/anstyle/1.0.4 \
    crate://crates.io/anyhow/1.0.79 \
    crate://crates.io/async-trait/0.1.77 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.69 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bumpalo/3.14.0 \
    crate://crates.io/bytes/1.5.0 \
    crate://crates.io/cairo-rs/0.16.7 \
    crate://crates.io/cairo-sys-rs/0.16.3 \
    crate://crates.io/cc/1.0.83 \
    crate://crates.io/cfg-expr/0.15.6 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.31 \
    crate://crates.io/clap/4.4.18 \
    crate://crates.io/clap_builder/4.4.18 \
    crate://crates.io/clap_derive/4.4.7 \
    crate://crates.io/clap_lex/0.6.0 \
    crate://crates.io/colorchoice/1.0.0 \
    crate://crates.io/const_format/0.2.32 \
    crate://crates.io/const_format_proc_macros/0.2.32 \
    crate://crates.io/core-foundation-sys/0.8.6 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crossbeam-channel/0.5.11 \
    crate://crates.io/crossbeam-utils/0.8.19 \
    crate://crates.io/deranged/0.3.11 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/field-offset/0.3.6 \
    crate://crates.io/file-rotate/0.7.5 \
    crate://crates.io/flate2/1.0.28 \
    crate://crates.io/flume/0.10.14 \
    crate://crates.io/fragile/2.0.0 \
    crate://crates.io/futures-channel/0.3.30 \
    crate://crates.io/futures-core/0.3.30 \
    crate://crates.io/futures-executor/0.3.30 \
    crate://crates.io/futures-io/0.3.30 \
    crate://crates.io/futures-macro/0.3.30 \
    crate://crates.io/futures-sink/0.3.30 \
    crate://crates.io/futures-task/0.3.30 \
    crate://crates.io/futures-util/0.3.30 \
    crate://crates.io/futures/0.3.30 \
    crate://crates.io/gdk-pixbuf-sys/0.16.3 \
    crate://crates.io/gdk-pixbuf/0.16.7 \
    crate://crates.io/gdk4-sys/0.5.5 \
    crate://crates.io/gdk4/0.5.5 \
    crate://crates.io/getrandom/0.2.12 \
    crate://crates.io/gimli/0.28.1 \
    crate://crates.io/gio-sys/0.16.3 \
    crate://crates.io/gio/0.16.7 \
    crate://crates.io/glib-macros/0.16.8 \
    crate://crates.io/glib-sys/0.16.3 \
    crate://crates.io/glib/0.16.9 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/gobject-sys/0.16.3 \
    crate://crates.io/graphene-rs/0.16.3 \
    crate://crates.io/graphene-sys/0.16.3 \
    crate://crates.io/greetd_ipc/0.9.0 \
    crate://crates.io/gsk4-sys/0.5.5 \
    crate://crates.io/gsk4/0.5.5 \
    crate://crates.io/gtk4-macros/0.5.6 \
    crate://crates.io/gtk4-sys/0.5.5 \
    crate://crates.io/gtk4/0.5.5 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hashbrown/0.13.2 \
    crate://crates.io/hashbrown/0.14.3 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.3.4 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/iana-time-zone/0.1.59 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/indexmap/2.1.0 \
    crate://crates.io/itoa/1.0.10 \
    crate://crates.io/js-sys/0.3.67 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.152 \
    crate://crates.io/lock_api/0.4.11 \
    crate://crates.io/log/0.4.20 \
    crate://crates.io/lru/0.9.0 \
    crate://crates.io/memchr/2.7.1 \
    crate://crates.io/memoffset/0.9.0 \
    crate://crates.io/miniz_oxide/0.7.1 \
    crate://crates.io/mio/0.8.11 \
    crate://crates.io/nanorand/0.7.0 \
    crate://crates.io/nom8/0.2.0 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/num-traits/0.2.17 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/num_threads/0.1.6 \
    crate://crates.io/object/0.32.2 \
    crate://crates.io/once_cell/1.19.0 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/pango-sys/0.16.3 \
    crate://crates.io/pango/0.16.5 \
    crate://crates.io/pin-project-internal/1.1.3 \
    crate://crates.io/pin-project-lite/0.2.13 \
    crate://crates.io/pin-project/1.1.3 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.29 \
    crate://crates.io/powerfmt/0.2.0 \
    crate://crates.io/proc-macro-crate/1.3.1 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.76 \
    crate://crates.io/pwd/1.4.0 \
    crate://crates.io/quote/1.0.35 \
    crate://crates.io/regex-automata/0.4.3 \
    crate://crates.io/regex-syntax/0.8.2 \
    crate://crates.io/regex/1.10.2 \
    crate://crates.io/relm4-macros/0.5.1 \
    crate://crates.io/relm4/0.5.1 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/ryu/1.0.16 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/semver/1.0.21 \
    crate://crates.io/serde/1.0.195 \
    crate://crates.io/serde_derive/1.0.195 \
    crate://crates.io/serde_json/1.0.111 \
    crate://crates.io/serde_spanned/0.6.5 \
    crate://crates.io/sharded-slab/0.1.7 \
    crate://crates.io/shlex/1.3.0 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/smallvec/1.12.0 \
    crate://crates.io/socket2/0.5.5 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.48 \
    crate://crates.io/system-deps/6.2.0 \
    crate://crates.io/target-lexicon/0.12.13 \
    crate://crates.io/thiserror-impl/1.0.56 \
    crate://crates.io/thiserror/1.0.56 \
    crate://crates.io/thread_local/1.1.7 \
    crate://crates.io/time-core/0.1.2 \
    crate://crates.io/time-macros/0.2.16 \
    crate://crates.io/time/0.3.31 \
    crate://crates.io/tokio/1.35.1 \
    crate://crates.io/toml/0.6.0 \
    crate://crates.io/toml/0.8.8 \
    crate://crates.io/toml_datetime/0.5.1 \
    crate://crates.io/toml_datetime/0.6.5 \
    crate://crates.io/toml_edit/0.18.1 \
    crate://crates.io/toml_edit/0.19.15 \
    crate://crates.io/toml_edit/0.21.0 \
    crate://crates.io/tracing-appender/0.2.3 \
    crate://crates.io/tracing-attributes/0.1.27 \
    crate://crates.io/tracing-core/0.1.32 \
    crate://crates.io/tracing-log/0.2.0 \
    crate://crates.io/tracing-subscriber/0.3.18 \
    crate://crates.io/tracing/0.1.40 \
    crate://crates.io/tracker-macros/0.2.1 \
    crate://crates.io/tracker/0.2.1 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/unicode-xid/0.2.4 \
    crate://crates.io/utf8parse/0.2.1 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/version-compare/0.1.1 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.90 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.90 \
    crate://crates.io/wasm-bindgen-macro/0.2.90 \
    crate://crates.io/wasm-bindgen-shared/0.2.90 \
    crate://crates.io/wasm-bindgen/0.2.90 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-core/0.52.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.0 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.0 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.52.0 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.52.0 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.0 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.0 \
    crate://crates.io/winnow/0.5.34 \
    crate://crates.io/zerocopy-derive/0.7.32 \
    crate://crates.io/zerocopy/0.7.32 \
"

SRC_URI[addr2line-0.21.0.sha256sum] = "8a30b2e23b9e17a9f90641c7ab1549cd9b44f296d3ccbf309d2863cfe398a0cb"
SRC_URI[adler-1.0.2.sha256sum] = "f26201604c87b1e01bd3d98f8d5d9a8fcbb815e8cedb41ffccbeb4bf593a35fe"
SRC_URI[ahash-0.8.7.sha256sum] = "77c3a9648d43b9cd48db467b3f87fdd6e146bcc88ab0180006cef2179fe11d01"
SRC_URI[aho-corasick-1.1.2.sha256sum] = "b2969dcb958b36655471fc61f7e416fa76033bdd4bfed0678d8fee1e2d07a1f0"
SRC_URI[android-tzdata-0.1.1.sha256sum] = "e999941b234f3131b00bc13c22d06e8c5ff726d1b6318ac7eb276997bbb4fef0"
SRC_URI[android_system_properties-0.1.5.sha256sum] = "819e7219dbd41043ac279b19830f2efc897156490d7fd6ea916720117ee66311"
SRC_URI[anstream-0.6.11.sha256sum] = "6e2e1ebcb11de5c03c67de28a7df593d32191b44939c482e97702baaaa6ab6a5"
SRC_URI[anstyle-parse-0.2.3.sha256sum] = "c75ac65da39e5fe5ab759307499ddad880d724eed2f6ce5b5e8a26f4f387928c"
SRC_URI[anstyle-query-1.0.2.sha256sum] = "e28923312444cdd728e4738b3f9c9cac739500909bb3d3c94b43551b16517648"
SRC_URI[anstyle-wincon-3.0.2.sha256sum] = "1cd54b81ec8d6180e24654d0b371ad22fc3dd083b6ff8ba325b72e00c87660a7"
SRC_URI[anstyle-1.0.4.sha256sum] = "7079075b41f533b8c61d2a4d073c4676e1f8b249ff94a393b0595db304e0dd87"
SRC_URI[anyhow-1.0.79.sha256sum] = "080e9890a082662b09c1ad45f567faeeb47f22b5fb23895fbe1e651e718e25ca"
SRC_URI[async-trait-0.1.77.sha256sum] = "c980ee35e870bd1a4d2c8294d4c04d0499e67bca1e4b5cefcc693c2fa00caea9"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[backtrace-0.3.69.sha256sum] = "2089b7e3f35b9dd2d0ed921ead4f6d318c27680d4a5bd167b3ee120edb105837"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bumpalo-3.14.0.sha256sum] = "7f30e7476521f6f8af1a1c4c0b8cc94f0bee37d91763d0ca2665f299b6cd8aec"
SRC_URI[bytes-1.5.0.sha256sum] = "a2bd12c1caf447e69cd4528f47f94d203fd2582878ecb9e9465484c4148a8223"
SRC_URI[cairo-rs-0.16.7.sha256sum] = "f3125b15ec28b84c238f6f476c6034016a5f6cc0221cb514ca46c532139fc97d"
SRC_URI[cairo-sys-rs-0.16.3.sha256sum] = "7c48f4af05fabdcfa9658178e1326efa061853f040ce7d72e33af6885196f421"
SRC_URI[cc-1.0.83.sha256sum] = "f1174fb0b6ec23863f8b971027804a42614e347eafb0a95bf0b12cdae21fc4d0"
SRC_URI[cfg-expr-0.15.6.sha256sum] = "6100bc57b6209840798d95cb2775684849d332f7bd788db2a8c8caf7ef82a41a"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[chrono-0.4.31.sha256sum] = "7f2c685bad3eb3d45a01354cedb7d5faa66194d1d58ba6e267a8de788f79db38"
SRC_URI[clap-4.4.18.sha256sum] = "1e578d6ec4194633722ccf9544794b71b1385c3c027efe0c55db226fc880865c"
SRC_URI[clap_builder-4.4.18.sha256sum] = "4df4df40ec50c46000231c914968278b1eb05098cf8f1b3a518a95030e71d1c7"
SRC_URI[clap_derive-4.4.7.sha256sum] = "cf9804afaaf59a91e75b022a30fb7229a7901f60c755489cc61c9b423b836442"
SRC_URI[clap_lex-0.6.0.sha256sum] = "702fc72eb24e5a1e48ce58027a675bc24edd52096d5397d4aea7c6dd9eca0bd1"
SRC_URI[colorchoice-1.0.0.sha256sum] = "acbf1af155f9b9ef647e42cdc158db4b64a1b61f743629225fde6f3e0be2a7c7"
SRC_URI[const_format-0.2.32.sha256sum] = "e3a214c7af3d04997541b18d432afaff4c455e79e2029079647e72fc2bd27673"
SRC_URI[const_format_proc_macros-0.2.32.sha256sum] = "c7f6ff08fd20f4f299298a28e2dfa8a8ba1036e6cd2460ac1de7b425d76f2500"
SRC_URI[core-foundation-sys-0.8.6.sha256sum] = "06ea2b9bc92be3c2baa9334a323ebca2d6f074ff852cd1d7b11064035cd3868f"
SRC_URI[crc32fast-1.3.2.sha256sum] = "b540bd8bc810d3885c6ea91e2018302f68baba2129ab3e88f32389ee9370880d"
SRC_URI[crossbeam-channel-0.5.11.sha256sum] = "176dc175b78f56c0f321911d9c8eb2b77a78a4860b9c19db83835fea1a46649b"
SRC_URI[crossbeam-utils-0.8.19.sha256sum] = "248e3bacc7dc6baa3b21e405ee045c3047101a49145e7e9eca583ab4c2ca5345"
SRC_URI[deranged-0.3.11.sha256sum] = "b42b6fa04a440b495c8b04d0e71b707c585f83cb9cb28cf8cd0d976c315e31b4"
SRC_URI[derivative-2.2.0.sha256sum] = "fcc3dd5e9e9c0b295d6e1e4d811fb6f157d5ffd784b8d202fc62eac8035a770b"
SRC_URI[equivalent-1.0.1.sha256sum] = "5443807d6dff69373d433ab9ef5378ad8df50ca6298caf15de6e52e24aaf54d5"
SRC_URI[field-offset-0.3.6.sha256sum] = "38e2275cc4e4fc009b0669731a1e5ab7ebf11f469eaede2bab9309a5b4d6057f"
SRC_URI[file-rotate-0.7.5.sha256sum] = "ddf221ceec4517f3cb764dae3541b2bd87666fc8832e51322fbb97250b468c71"
SRC_URI[flate2-1.0.28.sha256sum] = "46303f565772937ffe1d394a4fac6f411c6013172fadde9dcdb1e147a086940e"
SRC_URI[flume-0.10.14.sha256sum] = "1657b4441c3403d9f7b3409e47575237dac27b1b5726df654a6ecbf92f0f7577"
SRC_URI[fragile-2.0.0.sha256sum] = "6c2141d6d6c8512188a7891b4b01590a45f6dac67afb4f255c4124dbb86d4eaa"
SRC_URI[futures-channel-0.3.30.sha256sum] = "eac8f7d7865dcb88bd4373ab671c8cf4508703796caa2b1985a9ca867b3fcb78"
SRC_URI[futures-core-0.3.30.sha256sum] = "dfc6580bb841c5a68e9ef15c77ccc837b40a7504914d52e47b8b0e9bbda25a1d"
SRC_URI[futures-executor-0.3.30.sha256sum] = "a576fc72ae164fca6b9db127eaa9a9dda0d61316034f33a0a0d4eda41f02b01d"
SRC_URI[futures-io-0.3.30.sha256sum] = "a44623e20b9681a318efdd71c299b6b222ed6f231972bfe2f224ebad6311f0c1"
SRC_URI[futures-macro-0.3.30.sha256sum] = "87750cf4b7a4c0625b1529e4c543c2182106e4dedc60a2a6455e00d212c489ac"
SRC_URI[futures-sink-0.3.30.sha256sum] = "9fb8e00e87438d937621c1c6269e53f536c14d3fbd6a042bb24879e57d474fb5"
SRC_URI[futures-task-0.3.30.sha256sum] = "38d84fa142264698cdce1a9f9172cf383a0c82de1bddcf3092901442c4097004"
SRC_URI[futures-util-0.3.30.sha256sum] = "3d6401deb83407ab3da39eba7e33987a73c3df0c82b4bb5813ee871c19c41d48"
SRC_URI[futures-0.3.30.sha256sum] = "645c6916888f6cb6350d2550b80fb63e734897a8498abe35cfb732b6487804b0"
SRC_URI[gdk-pixbuf-sys-0.16.3.sha256sum] = "3092cf797a5f1210479ea38070d9ae8a5b8e9f8f1be9f32f4643c529c7d70016"
SRC_URI[gdk-pixbuf-0.16.7.sha256sum] = "c3578c60dee9d029ad86593ed88cb40f35c1b83360e12498d055022385dd9a05"
SRC_URI[gdk4-sys-0.5.5.sha256sum] = "de55cb49432901fe2b3534177fa06844665b9b0911d85d8601a8d8b88b7791db"
SRC_URI[gdk4-0.5.5.sha256sum] = "bb2181330ebf9d091f8ea7fed6877f7adc92114128592e1fdaeb1da28e0d01e9"
SRC_URI[getrandom-0.2.12.sha256sum] = "190092ea657667030ac6a35e305e62fc4dd69fd98ac98631e5d3a2b1575a12b5"
SRC_URI[gimli-0.28.1.sha256sum] = "4271d37baee1b8c7e4b708028c57d816cf9d2434acb33a549475f78c181f6253"
SRC_URI[gio-sys-0.16.3.sha256sum] = "e9b693b8e39d042a95547fc258a7b07349b1f0b48f4b2fa3108ba3c51c0b5229"
SRC_URI[gio-0.16.7.sha256sum] = "2a1c84b4534a290a29160ef5c6eff2a9c95833111472e824fc5cb78b513dd092"
SRC_URI[glib-macros-0.16.8.sha256sum] = "fb1a9325847aa46f1e96ffea37611b9d51fc4827e67f79e7de502a297560a67b"
SRC_URI[glib-sys-0.16.3.sha256sum] = "c61a4f46316d06bfa33a7ac22df6f0524c8be58e3db2d9ca99ccb1f357b62a65"
SRC_URI[glib-0.16.9.sha256sum] = "16aa2475c9debed5a32832cb5ff2af5a3f9e1ab9e69df58eaadc1ab2004d6eba"
SRC_URI[glob-0.3.1.sha256sum] = "d2fabcfbdc87f4758337ca535fb41a6d701b65693ce38287d856d1674551ec9b"
SRC_URI[gobject-sys-0.16.3.sha256sum] = "3520bb9c07ae2a12c7f2fbb24d4efc11231c8146a86956413fb1a79bb760a0f1"
SRC_URI[graphene-rs-0.16.3.sha256sum] = "95ecb4d347e6d09820df3bdfd89a74a8eec07753a06bb92a3aac3ad31d04447b"
SRC_URI[graphene-sys-0.16.3.sha256sum] = "b9aa82337d3972b4eafdea71e607c23f47be6f27f749aab613f1ad8ddbe6dcd6"
SRC_URI[greetd_ipc-0.9.0.sha256sum] = "839390036de887ed0e6a58a82fc03619b27c96f24ac6425f7c9a6c397a6482f6"
SRC_URI[gsk4-sys-0.5.5.sha256sum] = "195a63f0be42529f98c3eb3bae0decfd0428ba2cc683b3e20ced88f340904ec5"
SRC_URI[gsk4-0.5.5.sha256sum] = "591239f5c52ca803b222124ac9c47f230cd180cee9b114c4d672e4a94b74f491"
SRC_URI[gtk4-macros-0.5.6.sha256sum] = "42829d621396a69b352d80b952dfcb4ecb4272506b2e10a65457013af1b395a4"
SRC_URI[gtk4-sys-0.5.5.sha256sum] = "e370564e3fdacff7cffc99f7366b6a4689feb44e819d3ccee598a9a215b71605"
SRC_URI[gtk4-0.5.5.sha256sum] = "fd89dba65def483a233dc4fdd3f3dab01576e3d83f80f6c9303ebe421661855e"
SRC_URI[hashbrown-0.12.3.sha256sum] = "8a9ee70c43aaf417c914396645a0fa852624801b24ebb7ae78fe8272889ac888"
SRC_URI[hashbrown-0.13.2.sha256sum] = "43a3c133739dddd0d2990f9a4bdf8eb4b21ef50e4851ca85ab661199821d510e"
SRC_URI[hashbrown-0.14.3.sha256sum] = "290f1a1d9242c78d09ce40a5e87e7554ee637af1351968159f4952f028f75604"
SRC_URI[heck-0.4.1.sha256sum] = "95505c38b4572b2d910cecb0281560f54b440a19336cbbcb27bf6ce6adc6f5a8"
SRC_URI[hermit-abi-0.3.4.sha256sum] = "5d3d0e0f38255e7fa3cf31335b3a56f05febd18025f4db5ef7a0cfb4f8da651f"
SRC_URI[iana-time-zone-haiku-0.1.2.sha256sum] = "f31827a206f56af32e590ba56d5d2d085f558508192593743f16b2306495269f"
SRC_URI[iana-time-zone-0.1.59.sha256sum] = "b6a67363e2aa4443928ce15e57ebae94fd8949958fd1223c4cfc0cd473ad7539"
SRC_URI[indexmap-1.9.3.sha256sum] = "bd070e393353796e801d209ad339e89596eb4c8d430d18ede6a1cced8fafbd99"
SRC_URI[indexmap-2.1.0.sha256sum] = "d530e1a18b1cb4c484e6e34556a0d948706958449fca0cab753d649f2bce3d1f"
SRC_URI[itoa-1.0.10.sha256sum] = "b1a46d1a171d865aa5f83f92695765caa047a9b4cbae2cbf37dbd613a793fd4c"
SRC_URI[js-sys-0.3.67.sha256sum] = "9a1d36f1235bc969acba30b7f5990b864423a6068a10f7c90ae8f0112e3a59d1"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[libc-0.2.152.sha256sum] = "13e3bf6590cbc649f4d1a3eefc9d5d6eb746f5200ffb04e5e142700b8faa56e7"
SRC_URI[lock_api-0.4.11.sha256sum] = "3c168f8615b12bc01f9c17e2eb0cc07dcae1940121185446edc3744920e8ef45"
SRC_URI[log-0.4.20.sha256sum] = "b5e6163cb8c49088c2c36f57875e58ccd8c87c7427f7fbd50ea6710b2f3f2e8f"
SRC_URI[lru-0.9.0.sha256sum] = "71e7d46de488603ffdd5f30afbc64fbba2378214a2c3a2fb83abf3d33126df17"
SRC_URI[memchr-2.7.1.sha256sum] = "523dc4f511e55ab87b694dc30d0f820d60906ef06413f93d4d7a1385599cc149"
SRC_URI[memoffset-0.9.0.sha256sum] = "5a634b1c61a95585bd15607c6ab0c4e5b226e695ff2800ba0cdccddf208c406c"
SRC_URI[miniz_oxide-0.7.1.sha256sum] = "e7810e0be55b428ada41041c41f32c9f1a42817901b4ccf45fa3d4b6561e74c7"
SRC_URI[mio-0.8.11.sha256sum] = "a4a650543ca06a924e8b371db273b2756685faae30f8487da1b56505a8f78b0c"
SRC_URI[nanorand-0.7.0.sha256sum] = "6a51313c5820b0b02bd422f4b44776fbf47961755c74ce64afc73bfad10226c3"
SRC_URI[nom8-0.2.0.sha256sum] = "ae01545c9c7fc4486ab7debaf2aad7003ac19431791868fb2e8066df97fad2f8"
SRC_URI[nu-ansi-term-0.46.0.sha256sum] = "77a8165726e8236064dbb45459242600304b42a5ea24ee2948e18e023bf7ba84"
SRC_URI[num-traits-0.2.17.sha256sum] = "39e3200413f237f41ab11ad6d161bc7239c84dcb631773ccd7de3dfe4b5c267c"
SRC_URI[num_cpus-1.16.0.sha256sum] = "4161fcb6d602d4d2081af7c3a45852d875a03dd337a6bfdd6e06407b61342a43"
SRC_URI[num_threads-0.1.6.sha256sum] = "2819ce041d2ee131036f4fc9d6ae7ae125a3a40e97ba64d04fe799ad9dabbb44"
SRC_URI[object-0.32.2.sha256sum] = "a6a622008b6e321afc04970976f62ee297fdbaa6f95318ca343e3eebb9648441"
SRC_URI[once_cell-1.19.0.sha256sum] = "3fdb12b2476b595f9358c5161aa467c2438859caa136dec86c26fdd2efe17b92"
SRC_URI[overload-0.1.1.sha256sum] = "b15813163c1d831bf4a13c3610c05c0d03b39feb07f7e09fa234dac9b15aaf39"
SRC_URI[pango-sys-0.16.3.sha256sum] = "9e134909a9a293e04d2cc31928aa95679c5e4df954d0b85483159bd20d8f047f"
SRC_URI[pango-0.16.5.sha256sum] = "cdff66b271861037b89d028656184059e03b0b6ccb36003820be19f7200b1e94"
SRC_URI[pin-project-internal-1.1.3.sha256sum] = "4359fd9c9171ec6e8c62926d6faaf553a8dc3f64e1507e76da7911b4f6a04405"
SRC_URI[pin-project-lite-0.2.13.sha256sum] = "8afb450f006bf6385ca15ef45d71d2288452bc3683ce2e2cacc0d18e4be60b58"
SRC_URI[pin-project-1.1.3.sha256sum] = "fda4ed1c6c173e3fc7a83629421152e01d7b1f9b7f65fb301e490e8cfc656422"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.29.sha256sum] = "2900ede94e305130c13ddd391e0ab7cbaeb783945ae07a279c268cb05109c6cb"
SRC_URI[powerfmt-0.2.0.sha256sum] = "439ee305def115ba05938db6eb1644ff94165c5ab5e9420d1c1bcedbba909391"
SRC_URI[proc-macro-crate-1.3.1.sha256sum] = "7f4c021e1093a56626774e81216a4ce732a735e5bad4868a03f3ed65ca0c3919"
SRC_URI[proc-macro-error-attr-1.0.4.sha256sum] = "a1be40180e52ecc98ad80b184934baf3d0d29f979574e439af5a55274b35f869"
SRC_URI[proc-macro-error-1.0.4.sha256sum] = "da25490ff9892aab3fcf7c36f08cfb902dd3e71ca0f9f9517bea02a73a5ce38c"
SRC_URI[proc-macro2-1.0.76.sha256sum] = "95fc56cda0b5c3325f5fbbd7ff9fda9e02bb00bb3dac51252d2f1bfa1cb8cc8c"
SRC_URI[pwd-1.4.0.sha256sum] = "72c71c0c79b9701efe4e1e4b563b2016dd4ee789eb99badcb09d61ac4b92e4a2"
SRC_URI[quote-1.0.35.sha256sum] = "291ec9ab5efd934aaf503a6466c5d5251535d108ee747472c3977cc5acc868ef"
SRC_URI[regex-automata-0.4.3.sha256sum] = "5f804c7828047e88b2d32e2d7fe5a105da8ee3264f01902f796c8e067dc2483f"
SRC_URI[regex-syntax-0.8.2.sha256sum] = "c08c74e62047bb2de4ff487b251e4a92e24f48745648451635cec7d591162d9f"
SRC_URI[regex-1.10.2.sha256sum] = "380b951a9c5e80ddfd6136919eef32310721aa4aacd4889a8d39124b026ab343"
SRC_URI[relm4-macros-0.5.1.sha256sum] = "24d4191e434a6524bb17d16addb3a0aff740e13f1c32a4a2e9562b590d27a326"
SRC_URI[relm4-0.5.1.sha256sum] = "01a298c830b43bdafdef3d6eeb2d48920b04f541974b03caa52b840e8afb8fbf"
SRC_URI[rustc-demangle-0.1.23.sha256sum] = "d626bb9dae77e28219937af045c257c28bfd3f69333c512553507f5f9798cb76"
SRC_URI[rustc_version-0.4.0.sha256sum] = "bfa0f585226d2e68097d4f95d113b15b83a82e819ab25717ec0590d9584ef366"
SRC_URI[ryu-1.0.16.sha256sum] = "f98d2aa92eebf49b69786be48e4477826b256916e84a57ff2a4f21923b48eb4c"
SRC_URI[scopeguard-1.2.0.sha256sum] = "94143f37725109f92c262ed2cf5e59bce7498c01bcc1502d7b9afe439a4e9f49"
SRC_URI[semver-1.0.21.sha256sum] = "b97ed7a9823b74f99c7742f5336af7be5ecd3eeafcb1507d1fa93347b1d589b0"
SRC_URI[serde-1.0.195.sha256sum] = "63261df402c67811e9ac6def069e4786148c4563f4b50fd4bf30aa370d626b02"
SRC_URI[serde_derive-1.0.195.sha256sum] = "46fe8f8603d81ba86327b23a2e9cdf49e1255fb94a4c5f297f6ee0547178ea2c"
SRC_URI[serde_json-1.0.111.sha256sum] = "176e46fa42316f18edd598015a5166857fc835ec732f5215eac6b7bdbf0a84f4"
SRC_URI[serde_spanned-0.6.5.sha256sum] = "eb3622f419d1296904700073ea6cc23ad690adbd66f13ea683df73298736f0c1"
SRC_URI[sharded-slab-0.1.7.sha256sum] = "f40ca3c46823713e0d4209592e8d6e826aa57e928f09752619fc696c499637f6"
SRC_URI[shlex-1.3.0.sha256sum] = "0fda2ff0d084019ba4d7c6f371c95d8fd75ce3524c3cb8fb653a3023f6323e64"
SRC_URI[slab-0.4.9.sha256sum] = "8f92a496fb766b417c996b9c5e57daf2f7ad3b0bebe1ccfca4856390e3d3bb67"
SRC_URI[smallvec-1.12.0.sha256sum] = "2593d31f82ead8df961d8bd23a64c2ccf2eb5dd34b0a34bfb4dd54011c72009e"
SRC_URI[socket2-0.5.5.sha256sum] = "7b5fac59a5cb5dd637972e5fca70daf0523c9067fcdc4842f053dae04a18f8e9"
SRC_URI[spin-0.9.8.sha256sum] = "6980e8d7511241f8acf4aebddbb1ff938df5eebe98691418c4468d0b72a96a67"
SRC_URI[strsim-0.10.0.sha256sum] = "73473c0e59e6d5812c5dfe2a064a6444949f089e20eec9a2e5506596494e4623"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn-2.0.48.sha256sum] = "0f3531638e407dfc0814761abb7c00a5b54992b849452a0646b7f65c9f770f3f"
SRC_URI[system-deps-6.2.0.sha256sum] = "2a2d580ff6a20c55dfb86be5f9c238f67835d0e81cbdea8bf5680e0897320331"
SRC_URI[target-lexicon-0.12.13.sha256sum] = "69758bda2e78f098e4ccb393021a0963bb3442eac05f135c30f61b7370bbafae"
SRC_URI[thiserror-impl-1.0.56.sha256sum] = "fa0faa943b50f3db30a20aa7e265dbc66076993efed8463e8de414e5d06d3471"
SRC_URI[thiserror-1.0.56.sha256sum] = "d54378c645627613241d077a3a79db965db602882668f9136ac42af9ecb730ad"
SRC_URI[thread_local-1.1.7.sha256sum] = "3fdd6f064ccff2d6567adcb3873ca630700f00b5ad3f060c25b5dcfd9a4ce152"
SRC_URI[time-core-0.1.2.sha256sum] = "ef927ca75afb808a4d64dd374f00a2adf8d0fcff8e7b184af886c3c87ec4a3f3"
SRC_URI[time-macros-0.2.16.sha256sum] = "26197e33420244aeb70c3e8c78376ca46571bc4e701e4791c2cd9f57dcb3a43f"
SRC_URI[time-0.3.31.sha256sum] = "f657ba42c3f86e7680e53c8cd3af8abbe56b5491790b46e22e19c0d57463583e"
SRC_URI[tokio-1.35.1.sha256sum] = "c89b4efa943be685f629b149f53829423f8f5531ea21249408e8e2f8671ec104"
SRC_URI[toml-0.6.0.sha256sum] = "4fb9d890e4dc9298b70f740f615f2e05b9db37dce531f6b24fb77ac993f9f217"
SRC_URI[toml-0.8.8.sha256sum] = "a1a195ec8c9da26928f773888e0742ca3ca1040c6cd859c919c9f59c1954ab35"
SRC_URI[toml_datetime-0.5.1.sha256sum] = "4553f467ac8e3d374bc9a177a26801e5d0f9b211aa1673fb137a403afd1c9cf5"
SRC_URI[toml_datetime-0.6.5.sha256sum] = "3550f4e9685620ac18a50ed434eb3aec30db8ba93b0287467bca5826ea25baf1"
SRC_URI[toml_edit-0.18.1.sha256sum] = "56c59d8dd7d0dcbc6428bf7aa2f0e823e26e43b3c9aca15bbc9475d23e5fa12b"
SRC_URI[toml_edit-0.19.15.sha256sum] = "1b5bb770da30e5cbfde35a2d7b9b8a2c4b8ef89548a7a6aeab5c9a576e3e7421"
SRC_URI[toml_edit-0.21.0.sha256sum] = "d34d383cd00a163b4a5b85053df514d45bc330f6de7737edfe0a93311d1eaa03"
SRC_URI[tracing-appender-0.2.3.sha256sum] = "3566e8ce28cc0a3fe42519fc80e6b4c943cc4c8cef275620eb8dac2d3d4e06cf"
SRC_URI[tracing-attributes-0.1.27.sha256sum] = "34704c8d6ebcbc939824180af020566b01a7c01f80641264eba0999f6c2b6be7"
SRC_URI[tracing-core-0.1.32.sha256sum] = "c06d3da6113f116aaee68e4d601191614c9053067f9ab7f6edbcb161237daa54"
SRC_URI[tracing-log-0.2.0.sha256sum] = "ee855f1f400bd0e5c02d150ae5de3840039a3f54b025156404e34c23c03f47c3"
SRC_URI[tracing-subscriber-0.3.18.sha256sum] = "ad0f048c97dbd9faa9b7df56362b8ebcaa52adb06b498c050d2f4e32f90a7a8b"
SRC_URI[tracing-0.1.40.sha256sum] = "c3523ab5a71916ccf420eebdf5521fcef02141234bbc0b8a49f2fdc4544364ef"
SRC_URI[tracker-macros-0.2.1.sha256sum] = "ca029746fbe0efda3298205de77bf759d7fef23ac97902641e0b49a623b0455f"
SRC_URI[tracker-0.2.1.sha256sum] = "ff9636d15e370187f6bf55b79ce62ebf4221998bc0ba1774d7fa208b007f6bf8"
SRC_URI[unicode-ident-1.0.12.sha256sum] = "3354b9ac3fae1ff6755cb6db53683adb661634f67557942dea4facebec0fee4b"
SRC_URI[unicode-xid-0.2.4.sha256sum] = "f962df74c8c05a667b5ee8bcf162993134c104e96440b663c8daa176dc772d8c"
SRC_URI[utf8parse-0.2.1.sha256sum] = "711b9620af191e0cdc7468a8d14e709c3dcdb115b36f838e601583af800a370a"
SRC_URI[valuable-0.1.0.sha256sum] = "830b7e5d4d90034032940e4ace0d9a9a057e7a45cd94e6c007832e39edb82f6d"
SRC_URI[version-compare-0.1.1.sha256sum] = "579a42fc0b8e0c63b76519a339be31bed574929511fa53c1a3acae26eb258f29"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasm-bindgen-backend-0.2.90.sha256sum] = "fcdc935b63408d58a32f8cc9738a0bffd8f05cc7c002086c6ef20b7312ad9dcd"
SRC_URI[wasm-bindgen-macro-support-0.2.90.sha256sum] = "bae1abb6806dc1ad9e560ed242107c0f6c84335f1749dd4e8ddb012ebd5e25a7"
SRC_URI[wasm-bindgen-macro-0.2.90.sha256sum] = "3e4c238561b2d428924c49815533a8b9121c664599558a5d9ec51f8a1740a999"
SRC_URI[wasm-bindgen-shared-0.2.90.sha256sum] = "4d91413b1c31d7539ba5ef2451af3f0b833a005eb27a631cec32bc0635a8602b"
SRC_URI[wasm-bindgen-0.2.90.sha256sum] = "b1223296a201415c7fad14792dbefaace9bd52b62d33453ade1c5b5f07555406"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[windows-core-0.52.0.sha256sum] = "33ab640c8d7e35bf8ba19b884ba838ceb4fba93a4e8c65a9059d08afcfc683d9"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-sys-0.52.0.sha256sum] = "282be5f36a8ce781fad8c8ae18fa3f9beff57ec1b52cb3de0789201425d9a33d"
SRC_URI[windows-targets-0.48.5.sha256sum] = "9a2fa6e2155d7247be68c096456083145c183cbbbc2764150dda45a87197940c"
SRC_URI[windows-targets-0.52.0.sha256sum] = "8a18201040b24831fbb9e4eb208f8892e1f50a37feb53cc7ff887feb8f50e7cd"
SRC_URI[windows_aarch64_gnullvm-0.48.5.sha256sum] = "2b38e32f0abccf9987a4e3079dfb67dcd799fb61361e53e2882c3cbaf0d905d8"
SRC_URI[windows_aarch64_gnullvm-0.52.0.sha256sum] = "cb7764e35d4db8a7921e09562a0304bf2f93e0a51bfccee0bd0bb0b666b015ea"
SRC_URI[windows_aarch64_msvc-0.48.5.sha256sum] = "dc35310971f3b2dbbf3f0690a219f40e2d9afcf64f9ab7cc1be722937c26b4bc"
SRC_URI[windows_aarch64_msvc-0.52.0.sha256sum] = "bbaa0368d4f1d2aaefc55b6fcfee13f41544ddf36801e793edbbfd7d7df075ef"
SRC_URI[windows_i686_gnu-0.48.5.sha256sum] = "a75915e7def60c94dcef72200b9a8e58e5091744960da64ec734a6c6e9b3743e"
SRC_URI[windows_i686_gnu-0.52.0.sha256sum] = "a28637cb1fa3560a16915793afb20081aba2c92ee8af57b4d5f28e4b3e7df313"
SRC_URI[windows_i686_msvc-0.48.5.sha256sum] = "8f55c233f70c4b27f66c523580f78f1004e8b5a8b659e05a4eb49d4166cca406"
SRC_URI[windows_i686_msvc-0.52.0.sha256sum] = "ffe5e8e31046ce6230cc7215707b816e339ff4d4d67c65dffa206fd0f7aa7b9a"
SRC_URI[windows_x86_64_gnu-0.48.5.sha256sum] = "53d40abd2583d23e4718fddf1ebec84dbff8381c07cae67ff7768bbf19c6718e"
SRC_URI[windows_x86_64_gnu-0.52.0.sha256sum] = "3d6fa32db2bc4a2f5abeacf2b69f7992cd09dca97498da74a151a3132c26befd"
SRC_URI[windows_x86_64_gnullvm-0.48.5.sha256sum] = "0b7b52767868a23d5bab768e390dc5f5c55825b6d30b86c844ff2dc7414044cc"
SRC_URI[windows_x86_64_gnullvm-0.52.0.sha256sum] = "1a657e1e9d3f514745a572a6846d3c7aa7dbe1658c056ed9c3344c4109a6949e"
SRC_URI[windows_x86_64_msvc-0.48.5.sha256sum] = "ed94fce61571a4006852b7389a063ab983c02eb1bb37b47f8272ce92d06d9538"
SRC_URI[windows_x86_64_msvc-0.52.0.sha256sum] = "dff9641d1cd4be8d1a070daf9e3773c5f67e78b4d9d42263020c057706765c04"
SRC_URI[winnow-0.5.34.sha256sum] = "b7cf47b659b318dccbd69cc4797a39ae128f533dce7902a1096044d1967b9c16"
SRC_URI[zerocopy-derive-0.7.32.sha256sum] = "9ce1b18ccd8e73a9321186f97e46f9f04b778851177567b1975109d26a08d2a6"
SRC_URI[zerocopy-0.7.32.sha256sum] = "74d4d3961e53fa4c9a25a8637fc2bfaf2595b3d3ae34875568a5cf64787716be"

DEPENDS = "glib-2.0 gtk4 cairo graphene gdk-pixbuf"

inherit cargo pkgconfig

SRCREV = "1b3b53278d9df5b9d48d7a9f467e199856b8c313"
PV = "0.1.1"

RDEPENDS:${PN} = "cage greetd"
