// Contoh penggunaan kelas Mobil2
//     melalui import

import com.proyek.mob.Mobil2;

public class PengujianMobil2 {
    public static void main(String[] args) {
        // Pembuatan objek
        Mobil2 mobilA = new Mobil2("B3LIA", 
                                 "Avanza Veloz", 2011);
        Mobil2 mobilB = new Mobil2("AB461L", 
                                 "Terra", 2018);

        // Peroleh informasi via info()
        mobilA.perolehInfo();
        mobilB.perolehInfo();
    }
}

