// Contoh larik objek

public class LarikObjek {
    public static void main(String[] args) {
        // Pembuatan larik lima objek
        Hewan daftarHewan[] = new Hewan[5];
    
        // Pembuatan objek untuk setiap elemen
        for (int j = 0; j < daftarHewan.length; j++)
            daftarHewan[j] = new Hewan();

        // Tampilkan isi larik
        System.out.println("=================");
        for (int j = 0; j < daftarHewan.length; j++)
            daftarHewan[j].perolehInfo();

        // Penugasan nama hewan
        daftarHewan[0].aturNama("Kelinci");   
        daftarHewan[1].aturNama("Kucing");
        daftarHewan[2].aturNama("Kuda");
        daftarHewan[3].aturNama("Kijang");
        daftarHewan[4].aturNama("Kalkun");

        // Tampilkan isi larik
        System.out.println("=================");
        for (int j = 0; j < daftarHewan.length; j++)
            daftarHewan[j].perolehInfo();
    }
}

class Hewan {
    private String nama;
    
    public Hewan() {
        this.nama = "<Belum diberi nama>";
    }

    public void aturNama(String nama) {
        this.nama = nama;
    }
     
    public void perolehInfo() {
        System.out.println("Nama: " + nama);
    }
}


