// Metode untuk memperoleh nama bulan

public class MetodeBulan {
    public static void main(String[] args) {
        System.out.println(namaBulan(1));
        System.out.println(namaBulan(2));
        System.out.println(namaBulan(12));
        System.out.println(namaBulan(13));
    }

    public static String namaBulan(int kodeBulan) { 
        String daftarBulan[] = {
           "Kode bulan tidak valid",
           "Januari",
           "Februari",
           "Maret",
           "April",
           "Mei",
           "Juni",
           "Juli",
           "Agustus",
           "September",
           "Oktober",
           "November",
           "Desember"
        };

        if (kodeBulan >= 1 && kodeBulan <= 12)
            return daftarBulan[kodeBulan];
        else
            return daftarBulan[0];
    }
}
