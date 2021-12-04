// Metode untuk menentukan jumlah hari
//    dalam suatu bulan

public class JumlahHari {
    public static void main(String[] args) {
        System.out.println(
            "Jumlah hari bulan Februari 2020 = " +
            jumlahHari(2, 2020));

        System.out.println(
            "Jumlah hari bulan Februari 2021 = " +
            jumlahHari(2, 2021));

        System.out.println(
            "Jumlah hari bulan Maret 2021 = " +
            jumlahHari(3, 2021));
    }

    public static boolean tahunKabisat(int tahun) {
        if (tahun % 4 != 0)
            return false;
        else
            if ((tahun % 100 == 0) && (tahun % 400 != 0))
                return false;
            else
                return true;
    }

    public static int jumlahHari(int bulan, int tahun) {
        int jumHariDalamBulan[] = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int jum = jumHariDalamBulan[bulan];
        if (bulan == 2)
            if (tahunKabisat(tahun))
                jum = 29;

        return jum;
    }
}
