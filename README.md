# 💎 Gameloft Diamond Rush - Native Android Remaster

Porting Native Android mandiri untuk game klasik legendaris **Gameloft Diamond Rush** (J2ME QVGA 240x320) dengan runtime J2ME kustom berkinerja tinggi, kontrol sentuh Numpad petualang lengkap, bebas *flicker*, serta menu cheat bawaan.

[![Download APK](https://img.shields.io/badge/Download-DiamondRush.apk-brightgreen?style=for-the-badge&logo=android)](https://github.com/GUPRON98/DiamondRush-Android/raw/main/DiamondRush.apk)

---

## 📥 Unduh Game (Download APK)

Anda dapat langsung mengunduh file APK yang sudah jadi dan siap pasang:
- **Download Langsung**: [DiamondRush.apk](https://github.com/GUPRON98/DiamondRush-Android/raw/main/DiamondRush.apk)
- **Halaman Releases**: [GitHub Releases v1.0.0](https://github.com/GUPRON98/DiamondRush-Android/releases/tag/v1.0.0)

---

## ✨ Fitur Utama

- **🚀 100% Native Android Performance**: Berjalan langsung pada runtime ART/Dalvik Android native tanpa emulator pihak ketiga yang lambat.
- **🛡️ True Double-Buffering (Bebas Flicker)**: Rendering multi-threaded disinkronkan secara atomik (`GameCanvas.renderLock`), menghilangkan tearing dan flickering layar sepenuhnya.
- **🎮 Full Numpad HUD Bertema Kuno (Aztec Gold & Obsidian Transparan)**:
  - **`*` (Pickaxe / Beliung ⛏️)**: Mengganti peralatan (*tool swap*) & restart saat terjebak di antara batu/lava.
  - **`#` (Map / Peta Kuno 📜)**: Status checklist berlian dan rahasia peta kuil.
  - **`0` (Compass 🧭)**: Kompas petualang emas.
  - **`1` (Hammer 🔨)** & **`3` (Bomb 💣)**: Pintasan cepat palu godam pemecah batu & bom kuil.
  - **`5` (Cyan Diamond 💎)**: Tombol utama aksi, gali (*dig*), pukul, dan tombol OK.
  - **Tombol Arah `2, 4, 6, 8`** dan **Diagonal `7, 9`** (`▲, ▼, ◀, ▶, ↖, ↗`).
  - **`MENU` (SoftKey 1)** & **`PAUSE` (SoftKey 2)**: Tombol plakat relic di baris atas.
- **🔄 Mode Kontrol Fleksibel**: Toggle cepat antara **Mode 3x4 Full Numpad** klasik dan **Mode D-Pad Petualang**.
- **⚡ Panel Cheat Tersembunyi (Relic Cheat Modal)**:
  - 🛡️ **God Mode**: Kebal dari semua bahaya, monster, api, dan reruntuhan batu (darah selalu penuh 8 hati).
  - ❤️ **99 Lives & Max Potion**: 99 nyawa, 8 darah maksimal (hearts), Blue Potion x8, serta membuka seluruh peralatan.
  - 💎 **100% Diamonds**: Memenuhi target 100% berlian level secara instan.
  - ⏩ **Skip / Tamatkan Level**: Langsung menyelesaikan level saat itu juga dengan kemenangan.
  - 🗺️ **Unlock Semua Dunia**: Membuka seluruh stage di Angkor Wat, Bavaria, dan Siberia.
  - ⚙️ **Gameloft Dev Menu**: Membuka menu cheat developer asli bawaan game (`# 4 7 7 2`).

---

## 📁 Struktur Proyek

```
DiamondRush-Android/
├── app/
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── assets/            # Aset asli game (audio MIDI, level map, sprite font)
│       ├── java/
│       │   ├── com/gameloft/diamondrush/
│       │   │   ├── MainActivity.java  # SurfaceView, Full Numpad HUD, Cheat Modal
│       │   │   └── ...                # Engine game Diamond Rush
│       │   └── javax/microedition/    # J2ME MIDP 2.0 & RMS Compatibility Layer
│       └── res/               # Android icon dan resources
├── build_apk.sh               # Script kompilasi mandiri via javac, aapt, d8, apksigner
└── README.md
```

---

## 🔨 Cara Kompilasi (Build Mandiri di Termux / Linux)

Cukup jalankan script:
```bash
bash build_apk.sh
```

Hasil kompilasi APK yang siap dipasang akan tersimpan di:
- `/sdcard/ai/DiamondRush.apk`
- `/sdcard/DiamondRush.apk`
