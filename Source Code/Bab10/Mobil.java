class Mobil {
    private String noPolisi;
    private String model;
    private int tahunProduksi;

    // Konstruktor
    public Mobil(String noPolisi, String model,
                 int tahunProduksi) {
        this.noPolisi = noPolisi;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

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