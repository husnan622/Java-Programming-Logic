// Contoh penggunaan kelas Mobil
//     yang tersimpan pada berkas tersendiri

public class PengujianMobil {
    public static void main(String[] args) {
        // Pembuatan objek
        Mobil mobilA = new Mobil("B3LIA", 
                                 "Avanza Veloz", 2011);
        Mobil mobilB = new Mobil("AB461L", 
                                 "Terra", 2018);

        // Peroleh informasi via info()
        mobilA.perolehInfo();
        mobilB.perolehInfo();
    }
}

