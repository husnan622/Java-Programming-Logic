// Contoh pembuatan kelas dan objek

public class ContohKelas {
    public static void main(String[] args) {
        // Pembuatan objek
        Mobil mobilA = new Mobil();
        Mobil mobilB = new Mobil();

        // Pengisian data untuk mobilA
        mobilA.aturNoPolisi("B3LIA");
        mobilA.aturModel("Avanza Veloz");
        mobilA.aturTahunProduksi(2011);

        // Pengisian data untuk mobilB
        mobilB.aturNoPolisi("AB461L");
        mobilB.aturModel("Terra");
        mobilB.aturTahunProduksi(2018);

        // Ambil data dari kedua objek
        System.out.println("Model mobilA: " +
            mobilA.perolehModel());

        System.out.println("Tahun mobilB: " +
            mobilB.perolehTahunProduksi());

        // Peroleh informasi via info()
        mobilA.perolehInfo();
        mobilB.perolehInfo();
    }
}

class Mobil {
    private String noPolisi;
    private String model;
    private int tahunProduksi;

    // Untuk mengubah nomor polisi
    public void aturNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    // Untuk mendapatkan nomor polisi
    public String perolehNoPolisi() {
        return noPolisi;
    }

    // Untuk mengubah model
    public void aturModel(String model) {
        this.model = model;
    }

    // Untuk mendapatkan model
    public String perolehModel() {
        return model;
    }

    // Untuk mengubah tahun produksi
    public void aturTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    // Untuk mendapatkan tahun produksi
    public int perolehTahunProduksi() {
        return tahunProduksi;
    }

    // Untuk menampilkan informasi mobil
    public void perolehInfo() {
        System.out.println();
        System.out.println("Nomor Polisi  : " +
                           noPolisi);
        System.out.println("Model mobil   : " +
                           model);
        System.out.println("Tahun produksi: " +
                           tahunProduksi);
        System.out.println(
            "=================================");
    }
}


