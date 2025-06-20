SUMMARY = "A Solution to your Wayland Wallpaper Woes"
HOMEPAGE = "https://github.com/LGFae/swww"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit cargo pkgconfig

DEPENDS += "lz4"

CARGO_BUILD_FLAGS:remove = "--frozen"

SRCREV = "886ce3e9c5d88187fd765fe22c92338b038177c8"

SRC_URI += " \
    git://github.com/LGFae/swww.git;protocol=https;branch=main \
    file://0001-client-Cargo.toml-disable-dev-dependecies.patch \
    file://0001-Cargo.toml-dont-strip-by-default.patch \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aho-corasick/1.1.3 \
    crate://crates.io/anes/0.1.6 \
    crate://crates.io/anstream/0.6.15 \
    crate://crates.io/anstyle-parse/0.2.5 \
    crate://crates.io/anstyle-query/1.1.1 \
    crate://crates.io/anstyle-wincon/3.0.4 \
    crate://crates.io/anstyle/1.0.8 \
    crate://crates.io/assert/0.7.5 \
    crate://crates.io/autocfg/1.3.0 \
    crate://crates.io/bincode/1.3.3 \
    crate://crates.io/bit_field/0.10.2 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.6.0 \
    crate://crates.io/bs58/0.2.5 \
    crate://crates.io/bytemuck/1.16.3 \
    crate://crates.io/byteorder-lite/0.1.0 \
    crate://crates.io/cast/0.3.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/ciborium-io/0.2.2 \
    crate://crates.io/ciborium-ll/0.2.2 \
    crate://crates.io/ciborium/0.2.2 \
    crate://crates.io/clap/4.5.14 \
    crate://crates.io/clap_builder/4.5.14 \
    crate://crates.io/clap_complete/4.5.13 \
    crate://crates.io/clap_derive/4.5.13 \
    crate://crates.io/clap_lex/0.7.2 \
    crate://crates.io/color_quant/1.1.0 \
    crate://crates.io/colorchoice/1.0.2 \
    crate://crates.io/common/0.1.0 \
    crate://crates.io/crc32fast/1.4.2 \
    crate://crates.io/criterion-plot/0.5.0 \
    crate://crates.io/criterion/0.5.1 \
    crate://crates.io/crossbeam-deque/0.8.5 \
    crate://crates.io/crossbeam-epoch/0.9.18 \
    crate://crates.io/crossbeam-utils/0.8.20 \
    crate://crates.io/crunchy/0.2.2 \
    crate://crates.io/document-features/0.2.10 \
    crate://crates.io/either/1.13.0 \
    crate://crates.io/errno/0.3.9 \
    crate://crates.io/exr/1.72.0 \
    crate://crates.io/fast_image_resize/4.2.1 \
    crate://crates.io/fastrand/2.1.0 \
    crate://crates.io/fdeflate/0.3.4 \
    crate://crates.io/flate2/1.0.31 \
    crate://crates.io/flume/0.11.0 \
    crate://crates.io/generic-array/0.12.4 \
    crate://crates.io/gif/0.13.1 \
    crate://crates.io/half/2.4.1 \
    crate://crates.io/heck/0.5.0 \
    crate://crates.io/hermit-abi/0.3.9 \
    crate://crates.io/image-webp/0.1.3 \
    crate://crates.io/image/0.25.2 \
    crate://crates.io/is-terminal/0.4.12 \
    crate://crates.io/is_terminal_polyfill/1.70.1 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itoa/1.0.11 \
    crate://crates.io/jpeg-decoder/0.3.1 \
    crate://crates.io/keyframe/1.1.1 \
    crate://crates.io/lebe/0.5.2 \
    crate://crates.io/libc/0.2.155 \
    crate://crates.io/libm/0.2.8 \
    crate://crates.io/linux-raw-sys/0.4.14 \
    crate://crates.io/litrs/0.4.1 \
    crate://crates.io/lock_api/0.4.12 \
    crate://crates.io/log/0.4.22 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/miniz_oxide/0.7.4 \
    crate://crates.io/mint/0.5.9 \
    crate://crates.io/num-traits/0.2.19 \
    crate://crates.io/once_cell/1.19.0 \
    crate://crates.io/oorandom/11.1.4 \
    crate://crates.io/pkg-config/0.3.30 \
    crate://crates.io/png/0.17.13 \
    crate://crates.io/proc-macro2/1.0.86 \
    crate://crates.io/qoi/0.4.1 \
    crate://crates.io/quick-error/2.0.1 \
    crate://crates.io/quote/1.0.36 \
    crate://crates.io/rayon-core/1.12.1 \
    crate://crates.io/regex-automata/0.4.7 \
    crate://crates.io/regex-syntax/0.8.4 \
    crate://crates.io/regex/1.10.6 \
    crate://crates.io/rustix/0.38.34 \
    crate://crates.io/ryu/1.0.18 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/sd-notify/0.4.2 \
    crate://crates.io/serde/1.0.205 \
    crate://crates.io/serde_derive/1.0.205 \
    crate://crates.io/serde_json/1.0.122 \
    crate://crates.io/simd-adler32/0.3.7 \
    crate://crates.io/smallvec/1.13.2 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/strsim/0.11.1 \
    crate://crates.io/syn/2.0.72 \
    crate://crates.io/terminal_size/0.3.0 \
    crate://crates.io/thiserror-impl/1.0.63 \
    crate://crates.io/thiserror/1.0.63 \
    crate://crates.io/tiff/0.9.1 \
    crate://crates.io/tinytemplate/1.2.1 \
    crate://crates.io/typenum/1.17.0 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/utf8parse/0.2.2 \
    crate://crates.io/walkdir/2.5.0 \
    crate://crates.io/weezl/0.1.8 \
    crate://crates.io/winapi-util/0.1.9 \
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
    crate://crates.io/zune-core/0.4.12 \
    crate://crates.io/zune-inflate/0.2.54 \
    crate://crates.io/zune-jpeg/0.4.13 \
"

SRC_URI[adler-1.0.2.sha256sum] = "f26201604c87b1e01bd3d98f8d5d9a8fcbb815e8cedb41ffccbeb4bf593a35fe"
SRC_URI[aho-corasick-1.1.3.sha256sum] = "8e60d3430d3a69478ad0993f19238d2df97c507009a52b3c10addcd7f6bcb916"
SRC_URI[anes-0.1.6.sha256sum] = "4b46cbb362ab8752921c97e041f5e366ee6297bd428a31275b9fcf1e380f7299"
SRC_URI[anstream-0.6.15.sha256sum] = "64e15c1ab1f89faffbf04a634d5e1962e9074f2741eef6d97f3c4e322426d526"
SRC_URI[anstyle-parse-0.2.5.sha256sum] = "eb47de1e80c2b463c735db5b217a0ddc39d612e7ac9e2e96a5aed1f57616c1cb"
SRC_URI[anstyle-query-1.1.1.sha256sum] = "6d36fc52c7f6c869915e99412912f22093507da8d9e942ceaf66fe4b7c14422a"
SRC_URI[anstyle-wincon-3.0.4.sha256sum] = "5bf74e1b6e971609db8ca7a9ce79fd5768ab6ae46441c572e46cf596f59e57f8"
SRC_URI[anstyle-1.0.8.sha256sum] = "1bec1de6f59aedf83baf9ff929c98f2ad654b97c9510f4e70cf6f661d49fd5b1"
SRC_URI[assert-0.7.5.sha256sum] = "5647fc8bd8de4f8407f5df594200d55e81b3e4fdef11affb32d1e4eb11b7bcbb"
SRC_URI[autocfg-1.3.0.sha256sum] = "0c4b4d0bd25bd0b74681c0ad21497610ce1b7c91b1022cd21c80c6fbdd9476b0"
SRC_URI[bincode-1.3.3.sha256sum] = "b1f45e9417d87227c7a56d22e471c6206462cba514c7590c09aff4cf6d1ddcad"
SRC_URI[bit_field-0.10.2.sha256sum] = "dc827186963e592360843fb5ba4b973e145841266c1357f7180c43526f2e5b61"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bitflags-2.6.0.sha256sum] = "b048fb63fd8b5923fc5aa7b340d8e156aec7ec02f0c78fa8a6ddc2613f6f71de"
SRC_URI[bs58-0.2.5.sha256sum] = "c95ee6bba9d950218b6cc910cf62bc9e0a171d0f4537e3627b0f54d08549b188"
SRC_URI[bytemuck-1.16.3.sha256sum] = "102087e286b4677862ea56cf8fc58bb2cdfa8725c40ffb80fe3a008eb7f2fc83"
SRC_URI[byteorder-lite-0.1.0.sha256sum] = "8f1fe948ff07f4bd06c30984e69f5b4899c516a3ef74f34df92a2df2ab535495"
SRC_URI[cast-0.3.0.sha256sum] = "37b2a672a2cb129a2e41c10b1224bb368f9f37a2b16b612598138befd7b37eb5"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[ciborium-io-0.2.2.sha256sum] = "05afea1e0a06c9be33d539b876f1ce3692f4afea2cb41f740e7743225ed1c757"
SRC_URI[ciborium-ll-0.2.2.sha256sum] = "57663b653d948a338bfb3eeba9bb2fd5fcfaecb9e199e87e1eda4d9e8b240fd9"
SRC_URI[ciborium-0.2.2.sha256sum] = "42e69ffd6f0917f5c029256a24d0161db17cea3997d185db0d35926308770f0e"
SRC_URI[clap-4.5.14.sha256sum] = "c937d4061031a6d0c8da4b9a4f98a172fc2976dfb1c19213a9cf7d0d3c837e36"
SRC_URI[clap_builder-4.5.14.sha256sum] = "85379ba512b21a328adf887e85f7742d12e96eb31f3ef077df4ffc26b506ffed"
SRC_URI[clap_complete-4.5.13.sha256sum] = "aa3c596da3cf0983427b0df0dba359df9182c13bd5b519b585a482b0c351f4e8"
SRC_URI[clap_derive-4.5.13.sha256sum] = "501d359d5f3dcaf6ecdeee48833ae73ec6e42723a1e52419c79abf9507eec0a0"
SRC_URI[clap_lex-0.7.2.sha256sum] = "1462739cb27611015575c0c11df5df7601141071f07518d56fcc1be504cbec97"
SRC_URI[color_quant-1.1.0.sha256sum] = "3d7b894f5411737b7867f4827955924d7c254fc9f4d91a6aad6b097804b1018b"
SRC_URI[colorchoice-1.0.2.sha256sum] = "d3fd119d74b830634cea2a0f58bbd0d54540518a14397557951e79340abc28c0"
SRC_URI[common-0.1.0.sha256sum] = "e05200b5c7c59f4e849858a0df46f55a1851f82b881407cf4d6ddddeba11e180"
SRC_URI[crc32fast-1.4.2.sha256sum] = "a97769d94ddab943e4510d138150169a2758b5ef3eb191a9ee688de3e23ef7b3"
SRC_URI[criterion-plot-0.5.0.sha256sum] = "6b50826342786a51a89e2da3a28f1c32b06e387201bc2d19791f622c673706b1"
SRC_URI[criterion-0.5.1.sha256sum] = "f2b12d017a929603d80db1831cd3a24082f8137ce19c69e6447f54f5fc8d692f"
SRC_URI[crossbeam-deque-0.8.5.sha256sum] = "613f8cc01fe9cf1a3eb3d7f488fd2fa8388403e97039e2f73692932e291a770d"
SRC_URI[crossbeam-epoch-0.9.18.sha256sum] = "5b82ac4a3c2ca9c3460964f020e1402edd5753411d7737aa39c3714ad1b5420e"
SRC_URI[crossbeam-utils-0.8.20.sha256sum] = "22ec99545bb0ed0ea7bb9b8e1e9122ea386ff8a48c0922e43f36d45ab09e0e80"
SRC_URI[crunchy-0.2.2.sha256sum] = "7a81dae078cea95a014a339291cec439d2f232ebe854a9d672b796c6afafa9b7"
SRC_URI[document-features-0.2.10.sha256sum] = "cb6969eaabd2421f8a2775cfd2471a2b634372b4a25d41e3bd647b79912850a0"
SRC_URI[either-1.13.0.sha256sum] = "60b1af1c220855b6ceac025d3f6ecdd2b7c4894bfe9cd9bda4fbb4bc7c0d4cf0"
SRC_URI[errno-0.3.9.sha256sum] = "534c5cf6194dfab3db3242765c03bbe257cf92f22b38f6bc0c58d59108a820ba"
SRC_URI[exr-1.72.0.sha256sum] = "887d93f60543e9a9362ef8a21beedd0a833c5d9610e18c67abe15a5963dcb1a4"
SRC_URI[fast_image_resize-4.2.1.sha256sum] = "2ca4b58827213977eabab8ee8d8258db8441338f3a1832a1c0f2de3372175531"
SRC_URI[fastrand-2.1.0.sha256sum] = "9fc0510504f03c51ada170672ac806f1f105a88aa97a5281117e1ddc3368e51a"
SRC_URI[fdeflate-0.3.4.sha256sum] = "4f9bfee30e4dedf0ab8b422f03af778d9612b63f502710fc500a334ebe2de645"
SRC_URI[flate2-1.0.31.sha256sum] = "7f211bbe8e69bbd0cfdea405084f128ae8b4aaa6b0b522fc8f2b009084797920"
SRC_URI[flume-0.11.0.sha256sum] = "55ac459de2512911e4b674ce33cf20befaba382d05b62b008afc1c8b57cbf181"
SRC_URI[generic-array-0.12.4.sha256sum] = "ffdf9f34f1447443d37393cc6c2b8313aebddcd96906caf34e54c68d8e57d7bd"
SRC_URI[gif-0.13.1.sha256sum] = "3fb2d69b19215e18bb912fa30f7ce15846e301408695e44e0ef719f1da9e19f2"
SRC_URI[half-2.4.1.sha256sum] = "6dd08c532ae367adf81c312a4580bc67f1d0fe8bc9c460520283f4c0ff277888"
SRC_URI[heck-0.5.0.sha256sum] = "2304e00983f87ffb38b55b444b5e3b60a884b5d30c0fca7d82fe33449bbe55ea"
SRC_URI[hermit-abi-0.3.9.sha256sum] = "d231dfb89cfffdbc30e7fc41579ed6066ad03abda9e567ccafae602b97ec5024"
SRC_URI[image-webp-0.1.3.sha256sum] = "f79afb8cbee2ef20f59ccd477a218c12a93943d075b492015ecb1bb81f8ee904"
SRC_URI[image-0.25.2.sha256sum] = "99314c8a2152b8ddb211f924cdae532d8c5e4c8bb54728e12fff1b0cd5963a10"
SRC_URI[is-terminal-0.4.12.sha256sum] = "f23ff5ef2b80d608d61efee834934d862cd92461afc0560dedf493e4c033738b"
SRC_URI[is_terminal_polyfill-1.70.1.sha256sum] = "7943c866cc5cd64cbc25b2e01621d07fa8eb2a1a23160ee81ce38704e97b8ecf"
SRC_URI[itertools-0.10.5.sha256sum] = "b0fd2260e829bddf4cb6ea802289de2f86d6a7a690192fbe91b3f46e0f2c8473"
SRC_URI[itoa-1.0.11.sha256sum] = "49f1f14873335454500d59611f1cf4a4b0f786f9ac11f4312a78e4cf2566695b"
SRC_URI[jpeg-decoder-0.3.1.sha256sum] = "f5d4a7da358eff58addd2877a45865158f0d78c911d43a5784ceb7bbf52833b0"
SRC_URI[keyframe-1.1.1.sha256sum] = "60708bf7981518d09095d6f5673ce5cf6a64f1e0d9708b554f670e6d9d2bd9a9"
SRC_URI[lebe-0.5.2.sha256sum] = "03087c2bad5e1034e8cace5926dec053fb3790248370865f5117a7d0213354c8"
SRC_URI[libc-0.2.155.sha256sum] = "97b3888a4aecf77e811145cadf6eef5901f4782c53886191b2f693f24761847c"
SRC_URI[libm-0.2.8.sha256sum] = "4ec2a862134d2a7d32d7983ddcdd1c4923530833c9f2ea1a44fc5fa473989058"
SRC_URI[linux-raw-sys-0.4.14.sha256sum] = "78b3ae25bc7c8c38cec158d1f2757ee79e9b3740fbc7ccf0e59e4b08d793fa89"
SRC_URI[litrs-0.4.1.sha256sum] = "b4ce301924b7887e9d637144fdade93f9dfff9b60981d4ac161db09720d39aa5"
SRC_URI[lock_api-0.4.12.sha256sum] = "07af8b9cdd281b7915f413fa73f29ebd5d55d0d3f0155584dade1ff18cea1b17"
SRC_URI[log-0.4.22.sha256sum] = "a7a70ba024b9dc04c27ea2f0c0548feb474ec5c54bba33a7f72f873a39d07b24"
SRC_URI[memchr-2.7.4.sha256sum] = "78ca9ab1a0babb1e7d5695e3530886289c18cf2f87ec19a575a0abdce112e3a3"
SRC_URI[miniz_oxide-0.7.4.sha256sum] = "b8a240ddb74feaf34a79a7add65a741f3167852fba007066dcac1ca548d89c08"
SRC_URI[mint-0.5.9.sha256sum] = "e53debba6bda7a793e5f99b8dacf19e626084f525f7829104ba9898f367d85ff"
SRC_URI[num-traits-0.2.19.sha256sum] = "071dfc062690e90b734c0b2273ce72ad0ffa95f0c74596bc250dcfd960262841"
SRC_URI[once_cell-1.19.0.sha256sum] = "3fdb12b2476b595f9358c5161aa467c2438859caa136dec86c26fdd2efe17b92"
SRC_URI[oorandom-11.1.4.sha256sum] = "b410bbe7e14ab526a0e86877eb47c6996a2bd7746f027ba551028c925390e4e9"
SRC_URI[pkg-config-0.3.30.sha256sum] = "d231b230927b5e4ad203db57bbcbee2802f6bce620b1e4a9024a07d94e2907ec"
SRC_URI[png-0.17.13.sha256sum] = "06e4b0d3d1312775e782c86c91a111aa1f910cbb65e1337f9975b5f9a554b5e1"
SRC_URI[proc-macro2-1.0.86.sha256sum] = "5e719e8df665df0d1c8fbfd238015744736151d4445ec0836b8e628aae103b77"
SRC_URI[qoi-0.4.1.sha256sum] = "7f6d64c71eb498fe9eae14ce4ec935c555749aef511cca85b5568910d6e48001"
SRC_URI[quick-error-2.0.1.sha256sum] = "a993555f31e5a609f617c12db6250dedcac1b0a85076912c436e6fc9b2c8e6a3"
SRC_URI[quote-1.0.36.sha256sum] = "0fa76aaf39101c457836aec0ce2316dbdc3ab723cdda1c6bd4e6ad4208acaca7"
SRC_URI[rayon-core-1.12.1.sha256sum] = "1465873a3dfdaa8ae7cb14b4383657caab0b3e8a0aa9ae8e04b044854c8dfce2"
SRC_URI[regex-automata-0.4.7.sha256sum] = "38caf58cc5ef2fed281f89292ef23f6365465ed9a41b7a7754eb4e26496c92df"
SRC_URI[regex-syntax-0.8.4.sha256sum] = "7a66a03ae7c801facd77a29370b4faec201768915ac14a721ba36f20bc9c209b"
SRC_URI[regex-1.10.6.sha256sum] = "4219d74c6b67a3654a9fbebc4b419e22126d13d2f3c4a07ee0cb61ff79a79619"
SRC_URI[rustix-0.38.34.sha256sum] = "70dc5ec042f7a43c4a73241207cecc9873a06d45debb38b329f8541d85c2730f"
SRC_URI[ryu-1.0.18.sha256sum] = "f3cb5ba0dc43242ce17de99c180e96db90b235b8a9fdc9543c96d2209116bd9f"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[scopeguard-1.2.0.sha256sum] = "94143f37725109f92c262ed2cf5e59bce7498c01bcc1502d7b9afe439a4e9f49"
SRC_URI[sd-notify-0.4.2.sha256sum] = "4646d6f919800cd25c50edb49438a1381e2cd4833c027e75e8897981c50b8b5e"
SRC_URI[serde-1.0.205.sha256sum] = "e33aedb1a7135da52b7c21791455563facbbcc43d0f0f66165b42c21b3dfb150"
SRC_URI[serde_derive-1.0.205.sha256sum] = "692d6f5ac90220161d6774db30c662202721e64aed9058d2c394f451261420c1"
SRC_URI[serde_json-1.0.122.sha256sum] = "784b6203951c57ff748476b126ccb5e8e2959a5c19e5c617ab1956be3dbc68da"
SRC_URI[simd-adler32-0.3.7.sha256sum] = "d66dc143e6b11c1eddc06d5c423cfc97062865baf299914ab64caa38182078fe"
SRC_URI[smallvec-1.13.2.sha256sum] = "3c5e1a9a646d36c3599cd173a41282daf47c44583ad367b8e6837255952e5c67"
SRC_URI[spin-0.9.8.sha256sum] = "6980e8d7511241f8acf4aebddbb1ff938df5eebe98691418c4468d0b72a96a67"
SRC_URI[strsim-0.11.1.sha256sum] = "7da8b5736845d9f2fcb837ea5d9e2628564b3b043a70948a3f0b778838c5fb4f"
SRC_URI[syn-2.0.72.sha256sum] = "dc4b9b9bf2add8093d3f2c0204471e951b2285580335de42f9d2534f3ae7a8af"
SRC_URI[terminal_size-0.3.0.sha256sum] = "21bebf2b7c9e0a515f6e0f8c51dc0f8e4696391e6f1ff30379559f8365fb0df7"
SRC_URI[thiserror-impl-1.0.63.sha256sum] = "a4558b58466b9ad7ca0f102865eccc95938dca1a74a856f2b57b6629050da261"
SRC_URI[thiserror-1.0.63.sha256sum] = "c0342370b38b6a11b6cc11d6a805569958d54cfa061a29969c3b5ce2ea405724"
SRC_URI[tiff-0.9.1.sha256sum] = "ba1310fcea54c6a9a4fd1aad794ecc02c31682f6bfbecdf460bf19533eed1e3e"
SRC_URI[tinytemplate-1.2.1.sha256sum] = "be4d6b5f19ff7664e8c98d03e2139cb510db9b0a60b55f8e8709b689d939b6bc"
SRC_URI[typenum-1.17.0.sha256sum] = "42ff0bf0c66b8238c6f3b578df37d0b7848e55df8577b3f74f92a69acceeb825"
SRC_URI[unicode-ident-1.0.12.sha256sum] = "3354b9ac3fae1ff6755cb6db53683adb661634f67557942dea4facebec0fee4b"
SRC_URI[utf8parse-0.2.2.sha256sum] = "06abde3611657adf66d383f00b093d7faecc7fa57071cce2578660c9f1010821"
SRC_URI[walkdir-2.5.0.sha256sum] = "29790946404f91d9c5d06f9874efddea1dc06c5efe94541a7d6863108e3a5e4b"
SRC_URI[weezl-0.1.8.sha256sum] = "53a85b86a771b1c87058196170769dd264f66c0782acf1ae6cc51bfd64b39082"
SRC_URI[winapi-util-0.1.9.sha256sum] = "cf221c93e13a30d793f7645a0e7762c55d169dbb0a49671918a2319d289b10bb"
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
SRC_URI[zune-core-0.4.12.sha256sum] = "3f423a2c17029964870cfaabb1f13dfab7d092a62a29a89264f4d36990ca414a"
SRC_URI[zune-inflate-0.2.54.sha256sum] = "73ab332fe2f6680068f3582b16a24f90ad7096d5d39b974d1c0aff0125116f02"
SRC_URI[zune-jpeg-0.4.13.sha256sum] = "16099418600b4d8f028622f73ff6e3deaabdff330fb9a2a131dea781ee8b0768"
