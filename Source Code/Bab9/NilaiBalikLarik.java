// Contoh nilai balik berupa larik

public class NilaiBalikLarik {
    public static void main(String[] args) {
        String daftarHari[];

        daftarHari = perolehNamaNamaHari();  

        // Tampilkan nama-nama hari
        for (int j = 0; j < daftarHari.length; j++)
            System.out.println(daftarHari[j]);
    }

    public static String[] perolehNamaNamaHari() {
        String hari[] = {
            "Minggu", "Senin", "Selasa",
            "Rabu", "Kamis", "Jumat", "Sabtu"
        };

        return hari;
    }
}
