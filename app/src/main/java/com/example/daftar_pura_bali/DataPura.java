package com.example.daftar_pura_bali;

import java.util.ArrayList;

public class DataPura {
    private static final String[] nama_Pura = {
            "Pura Besakih",
            "Pura Goa Lawah",
            "Pura Gunung Kawi",
            "Pura Gunung Lebah",
            "Pura Taman Ayun",
            "Pura Tanah Saraswati",
            "Pura Tanah Lot",
            "Pura Tirta Empul",
            "Pura Ulun Danau Batur",
            "Pura Uluwatu"
    };

    private static final String[] lokasi_Pura = {
            "Kabupaten Karangasem",
            "desa Pesinggahan, Kecamatan Dawan, Kabupaten Klungkung",
            "Banjar Penaka, Tampak Siring, Kabupaten Gianyar",
            "Sungai Campuhan Ubud",
            "Seminyak, Bali",
            "Area pusat Ubud",
            "desa Beraban, Kecamatan Kediri, Kabuaten Tabanan",
            "Tampaksiring, Kabupaten Gianyar",
            "kawasan Tempat Wisata Bedugul, Kabupaten Tabanan",
            "Pantai Jimbaran, Bali"
    };

    private static final String[] deskripsi_Pura = {
            "Pura Besakih merupakan pura terbesar dan dianggap paling suci oleh umat hindu dengan lokasi berada 1000 meter dari lereng gunung Agung. kompleks Pura ini jumlahnya sangat banyak sehingga butuh waktu beberapa hari untuk menjelajahi semua area pura",
            "Goa Lawah adalah salah satu pura penting bagi umat hindu di bali dengan memiliki keunikan yaitu lokasi pura dibangun di depan goa besar yang dihuni oleh ribuan kelelawar",
            "Pura Gunung Kawi adalah sebuah kompleks candi kuno dan merupakan situs arkeologi paling unik di bali. Keunikannya terdapat pada relief candi yang diukir pada permukaan tebing batu",
            "Pura Gunung Lebah terletak di kawasan sungai campuhan yang berada di kawasan wisata ubud. pura ini termasuk ke dalam pura khayangan jagat",
            "Pura Taman Ayun salah satu contoh dari keunikan serta keindahan arsitektur tradisional Bali dengan kombinasi pengaruh arsitektur Tiongkok. Jika anda tertarik untuk melihat arsitektur Bali kuno, pura Taman Ayun Mengwi wajib anda masukan ke dalam itinerary liburan di Bali yang anda punya.",
            "Salah satu objek wisata pura yang ada di Ubud Bali favorit wisatawan adalah Pura Taman Saraswati. Lokasi pura Taman Saraswati berada di area pusat Ubud dengan daya tarik utama terdapat pada keindahan arsitektur dan kolam bunga teratai.",
            "Pura Tanah Lot di bangun di atas batung karang besar yang berada pada area lepas pantai. Untuk memasuki area pura, hanya dapat di lewati pada saat air laut surut. Sedangkan pada saat air laut pasang, pura Tanah Lot akan terlihat berada di tengah laut. Jam buka Tanah Lot temple untuk wisatawan dari pukul 06:00 – 19:00. Andai tujuan anda bersembahyang, maka Tanah Lot temple buka 24 jam.",
            "sumber mata air alami dan pemandian di area pura, menjadi daya tarik pura Tirta Empul sebagai tempat liburan di Bali. Berdekatan dengan lokasi pura Tirta Empul, tepatnya berada di atas bukit terdapat istana kepresidenan Tampak Siring.",
            "Daya tarik utama dari pura Ulun Danu Beratan sebagai objek wisata karena lokasi pura yang berada di tengah danau dan terlihat mengambang.Pada saat anda tiba di lokasi pura Ulun Danu Beratan, anda akan melihat air danau Beratan Bedugul yang jernih mengelilingi area pura Ulun Danu. Kemudian, terlihat seakan pura Ulun Danu mengambang di permukaan air danau Beratan.",
            "Pura Uluwatu, atau juga sering di sebut dengan nama Pura Luhur Uluwatu, salah satu enam pura Hindu utama di Bali. Selain keunikan arsitektur pura Luhur Uluwatu, daya tarik juga terdapat pada lokasi pura, yang berada di ujung tebing karang yang sangat curam. Tebing karang memiliki tinggi kurang lebih sekitar 70 meter di atas permukaan laut."
    };

    private static final int[] gambar_Pura = {
            R.drawable.pura_besakih,
            R.drawable.pura_goa_lawah,
            R.drawable.pura_gunung_kawi,
            R.drawable.pura_gunung_lebah,
            R.drawable.pura_taman_ayun,
            R.drawable.pura_taman_saraswati,
            R.drawable.pura_tanah_lot,
            R.drawable.pura_tirta_empul,
            R.drawable.pura_ulun_danu,
            R.drawable.pura_uluwatu
    };

    static ArrayList<DaftarPura> getListData() {
        ArrayList<DaftarPura> list = new ArrayList<>();
        for (int i = 0; i < nama_Pura.length; i++) {
            DaftarPura temple = new DaftarPura();
            temple.setNamaPura(nama_Pura[i]);
            temple.setLokasiPura(lokasi_Pura[i]);
            temple.setDeskripsi(deskripsi_Pura[i]);
            temple.setFoto(gambar_Pura[i]);
            list.add(temple);
        }
        return list;
    }
}
