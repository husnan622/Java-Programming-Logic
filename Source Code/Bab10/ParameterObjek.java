// Contoh objek sebagai parameter metode

public class ParameterObjek {
    public static void main(String[] args) {
        // Pembuatan objek
        Mobil mobilA = new Mobil("B3LIA", 
                                 "Avanza Veloz", 2011);
        Mobil mobilB = new Mobil("AB461L", 
                                 "Terra", 2018);

        // Tampilkan objek()
        tampilkan(mobilA);
        tampilkan(mobilB);
    }

    // Metode dengan parameter berupa objek
    public static void tampilkan(Mobil m) {
        m.perolehInfo();
    }
}
