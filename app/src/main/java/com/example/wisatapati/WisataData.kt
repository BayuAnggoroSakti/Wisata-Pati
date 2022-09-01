package com.example.wisatapati

object WisataData {
    private val wisataNames = arrayOf("Agro Jolong",
        "Waduk Gunung Rowo",
        "Bukit View Ki Santamulya",
        "Goa Pancur",
        "Air Terjun Lorotan Semar",
        "Pantai Kertomulyo",
        "Pantai Idola Banyutowo",
        "Amazon Waterland and Theme Park",
        "Bendungan Kletek",
        "Goa Wareh",
        "Waduk Seloromo",
        "Bukit Naga Jolong"
        )

    private val wisataTema = arrayOf("Alam",
        "Waduk",
        "Alam",
        "Alam",
        "Alam",
        "Pantai",
        "Pantai",
        "Taman",
        "Waduk",
        "Alam",
        "Waduk",
        "Taman"
        )
    private val wisataLokasi = arrayOf("Desa Sitiluhur, Kecamatan Gembong, Kabupaten Pati",
        "Mbangan, RT.3/RW.2, Area Waduk Gunungrowo, Sitiluhur, Kec. Gembong, Kab. Pati",
        "Jrambah, Durensawit, Kec. Kayen, Kabupaten Pati",
        "Desa Jimbaran Kecamatan Kayen",
        "Desa Sumbersari, Kecamatan Kayen, Kabupaten Pati",
        "Desa Kertomulyo Kec. Trangkil",
        "Banyutowo, Kec. Dukuhseti, Kab. Pati",
        "jalan raya Juwana Rembang KM 7.",
        "Kecamatan Pucakwangi, Kabupaten Pati",
        "Kedumulyo, Kec. Sukolilo, Kab. Pati",
        "kaki Gunung Muria, Area Waduk Gembong, Kec. Gembong, Kab. Pati",
        "Sitiluhur, Kec. Gembong, Kab. Pati"
        )

    private val wisataDetails = arrayOf("Wisata Agro Jolong yang berlokasi di Desa Sitiluhur, Kecamatan Gembong, Kabupaten Pati, Jawa Tengah akan menyuguhkan hamparan kebun kopi yang luas dilengkapi dengan beberapa tempat menarik yang bisa kamu kunjungi, seperti taman bunga, rumah pohon, dan wisata air terjun Grenjengan.\n" +
            "\n" +
            "Selain itu, kamu juga bisa mencoba berbagai wahana yang ada di sini untuk menguji adrenalin dengan flying fox, bersantai di terapi ikan, rumah balon, hingga outbound.",
    "Rekomendasi selanjutnya adalah Waduk Gunung Rowo yang bisa menjadi pilihan wisata untuk bersantai bersama keluarga. Pengunjung akan disuguhkan pemandangan latar belakang gunung yang indah dilengkapi suasana yang sejuk nan menyegarkan mata.\n" +
            "\n" +
            "Waduk ini berlokasi di Mbangan, RT.3/RW.2, Area Waduk Gunungrowo, Sitiluhur, Kec. Gembong, Kab. Pati. Saat mengunjungi tempat ini, kamu juga bisa membeli makanan berat untuk mengisi perut, seperti ikan bakar.",
"Bukit View Ki Santamulya berada di atas tanjakan santa yang dalam bahasa jawa dibaca “sonto”. Bukit ini berada berlokasi di ketinggian batu kapur yang memiliki banyak spot selfie menarik untuk diunggah ke media sosial.\n" +
        "\n" +
        "Kamu bisa berfoto selfie di logo “i love you”, rumah pohon, lorong cinta. Batu gedek, wayang ucul, dan spot seperti sarang burung yang unik",
"Destinasi wisata Goa Pancur dapat kamu jelajahi dengan air yang ada di dalam goa tersebut. Tempat ini memiliki batuan kapur yang membentuk stalaktit dan stalagmit yang sangat indah.\n" +
        "\n" +
        "Dalam goa, ada stalagmit yang berbentuk petak sawah yang sangat unik dan juga stalaktit batu tirai dan batu sayap. \n" +
        "\n" +
        "Untuk kamu yang tertarik, destinasi wisata ini terletak di sebelah selatan Kota Pati, tepatnya di Desa Jimbaran Kecamatan Kayen",
"Air Terjun Lorotan Semar berlokasi di Desa Sumbersari, Kecamatan Kayen, Kabupaten Pati, Jawa Tengah. Air terjun ini tidak terlalu tinggi namun debit airnya cukup deras. Keindahan air terjun ini sangat indah karena diapit oleh bukit kapur di kanan kirinya.\n" +
        "\n" +
        "Suasana Air Terjun Lorotan Semar sangat asti sehingga cocok untuk kamu yang ingin menghabiskan akhir pekan untuk bermain air atau berfoto-foto di dekat area air terjun.",
        "Rekomendasi tempat wisata berikutnya yang bisa kamu kunjungi saat ke Kabupaten Pati adalah Pantai Kertomulyo. Pantai ini berlokasi di desa Kertomulyo Kec. Trangkil berjarak kurang lebih 17 kilometer dari pusat kota Pati.\n" +
                "\n" +
                "Saat memasuki kawasan pantai, kamu akan disambut dengan gapura dari bambu bertuliskan Kawasan Konservasi Mangrove. Selain itu, kamu juga bisa berfoto-foto di gazebo dan kursi-kursi kecil. \n" +
                "\n" +
                "Tempat wisata ini memiliki banyak tanaman mangrove yang melingkar sepanjang pantai. Ada 2 jenis tanaman mangrove di Pantai Kertomulyo, yakni Avicennia officinalis dan Rhizophora.",
        "Pantai Idola Banyutowo berlokasi di Banyutowo, Kec. Dukuhseti, Kab. Pati yang berbatasan langsung dengan laut jawa dna juga kabupaten Jepara.\n" +
                "\n" +
                "Lokasi ini memiliki pemandangan yang luas yang tentunya sangat mengasyikan saat berlibur dengan kerabat atau keluarga.\n" +
                "\n" +
                "Uniknya, pantai ini seringkali dipakai untuk melakukan ritual sedekah laut yang diselenggarakan pada waktu tertentu",
        "Untuk kamu yang mencari destinasi wisata air yang seru, Amazon Waterland and Themepark bisa menjadi pilihan untuk menghabiskan akhir pekan. Tempat ini berada di jalan raya Juwana Rembang KM 7.\n" +
                "\n" +
                "Dengan lahan seluas 5 hektar, Amazon Waterland & Themepark memiliki 37 wahana permainan air dan darat yang dapat dinikmati sebagai sarana rekreasi keluarga atau kerabat. Bahkan kamu juga bisa menikmati waterboom dengan foam party yang menarik dan menyenangkan.",
        "Objek Wisata Pati, Kecamatan Pucakwangi, Kabupaten Pati, Jawa Tengah yang sudah buka sejak 2018 dan hingga kini masih banyak dijadikan opsi wisata untuk mengisi akhir pekan.\n" +
                "\n" +
                "Bendungan ini memiliki banyak spot selfie yang keren dengan lingkungan sekitar yang begitu asri. Seperti jembatan merah atau lambang love yang unik.",
        "Goa Wareh terletak di Kedumulyo, Kec. Sukolilo, Kab. Pati yang masih jarang diketahui oleh banyak wisatawan luar Pati. Tempat wisata ini ternyata menyimpan keindahan alam yang wajib kamu kunjungi, Toppers.\n" +
                "\n" +
                "Kamu bisa berendam di goa ini dan melihat sumber mata air yang konon katanya dapat membuat awet muda dan mudah untuk mendapatkan jodoh. Apakah kamu ingin mencobanya",
        "Waduk Seloromo terletak di kaki Gunung Muria, Area Waduk Gembong, Kec. Gembong, Kab. Pati. Suasana waduk ini sangat sejuk dan menyegarkan mata sehingga kamu tidak akan bosan berlama-lama di tempat ini.\n" +
                "\n" +
                "Selain itu, Waduk Seloromo juga bisa digunakan untuk foto pre-wedding karena keindahannya, aktivitas fotografi, dan juga bermain air.",
        "Saat di atas Bukit Naga Jolong, kamu akan menikmati keindahan Waduk Seloromo dan Waduk Gunung Rowo yang sangat indah.\n" +
                "\n" +
                "Kawasan ini merupakan perkebunan buah naga yang diubah menjadi tempat rekreasi masyarakat dengan lahan yang sangat luas. \n" +
                "\n" +
                "Jika kamu beruntung, kamu bisa datang saat panen dan bisa membeli buah naga sebagai buah tangan di rumah"
        )
    private val wisataImages = intArrayOf(R.drawable.agro_jolong,
        R.drawable.gunung_rowo,
        R.drawable.santamulya,
        R.drawable.goa_pancur,
        R.drawable.semar,
        R.drawable.pantai_kertomulyo,
        R.drawable.banyutowo,
        R.drawable.waterland,
        R.drawable.kletek,
        R.drawable.goa_wareh,
        R.drawable.seloromo,
        R.drawable.bukit_naga_jolong)

    val listData: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in wisataNames.indices) {
                val wisata = Wisata()
                wisata.name = wisataNames[position]
                wisata.detail = wisataDetails[position]
                wisata.photo = wisataImages[position]
                wisata.tema = wisataTema[position]
                wisata.lokasi = wisataLokasi[position]
                list.add(wisata)
            }
            return list
        }
}