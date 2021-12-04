// Contoh pembuatan kelas PersegiPanjang

public class PercobaanTumpukan {
    public static void main (String[] args) {
        Tumpukan tumpukan = new Tumpukan();

        tumpukan.tumpuk('A');
        tumpukan.tumpuk('B');
        tumpukan.tumpuk('C');
        tumpukan.tumpuk('D');

        // Ambil isi tumpukan
        System.out.println(
            "Isi tumpukan dari paling atas " +
            "hingga paling bawah:");

        char karakter;
        while (!tumpukan.kosong()) {
            karakter = tumpukan.ambil();
            System.out.println(karakter);
        }
    }
}

class SimpulTumpukan {
    public char data;
    public SimpulTumpukan berikut;

    // Konstruktor
    public SimpulTumpukan(char data) {
        this.data = data;
        this.berikut = null;
    }
}

class Tumpukan {
    private SimpulTumpukan puncak;

    public Tumpukan() {
        this.puncak = null;
    }

    // ----------------------------------------
    // tumpuk()
    //
    // Untuk memasukkan data ke Tumpukan
    // ----------------------------------------
    public void tumpuk(char data) {
        SimpulTumpukan ptrBaru;

        ptrBaru = new SimpulTumpukan(data);
        ptrBaru.berikut = puncak;
        puncak = ptrBaru;
    }

    // ----------------------------------------
    // kosong()
    //
    // Memberikan nilai balik true
    //     jika tumpukan kosong
    // ----------------------------------------
    public boolean kosong() {
        return puncak == null;
    }

    // ----------------------------------------
    // ambil()
    //
    // Menghilangkan simpul dan memberikan
    //     nilai balik berupa data yang pada
    //     simpul tersebut
    // ----------------------------------------
    public char ambil() {
        if (kosong()) {
            System.out.println("Tumpukan kosong.");

            return 0;   // Karakter NULL
                        // berarti tumpukan kosong
        }

        char data;

        data = puncak.data;
        puncak = puncak.berikut;

        return data;
    }
}