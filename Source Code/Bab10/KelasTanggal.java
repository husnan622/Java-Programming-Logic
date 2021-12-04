// Contoh pembuatan kelas Tanggal

public class KelasTanggal {
    public static void main (String[] args) {
        Tanggal tglA = new Tanggal(3, 2, 2019);
        tglA.tampilkanTanggal();

        Tanggal tglB = new Tanggal(17, 8, 1945);
        tglB.tampilkanTanggal();
    }
}    

class Tanggal {
    private int tahun, bulan, tanggal;
    public Tanggal(int tanggal, int bulan, int tahun) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.tanggal = tanggal;
    }

    public int perolehKodeHari() {
        // Menggunakan algoritma Zeller
        int t_tahun = tahun;
        int t_bulan = bulan;
        int t_tanggal = tanggal;

        // Ubah bulan and tahun untuk bulan = 1 and 2
        if (t_bulan == 1) {
            t_bulan = 13;
            t_tahun = t_tahun - 1;
        }

        if (t_bulan ==  2) {
            t_bulan = 14;
            t_tahun = t_tahun - 1;
        }

        // Hitung kode hari dalam satu minggu
        int tahunAbad = t_tahun % 100;
        int abad = t_tahun / 100;

        int kodeHari = (t_tanggal + 
                        (26 * (t_bulan + 1) / 10) +
                        tahunAbad +
                        tahunAbad / 4 +
                        abad / 4 + 5 * abad) % 7;

        return kodeHari;
    }

    public void tampilkanTanggal() {
        String[] namaHari = {
            "Sabtu", "Minggu", "Senin",
            "Selasa", "Rabu", "Kamis", "Jumat"
        };

        String[] namaBulan = {
            "", "January", "Februari", "Maret", "April",
            "Mei", "Juni", "Juli", "Agustus",
            "September", "Oktober", "November", "Desember"
        };

        int kodeHari = perolehKodeHari();
        System.out.println(namaHari[kodeHari] +
                           ", " + tanggal + " " +
                           namaBulan[bulan] + " " +
                           tahun);
    }
}



