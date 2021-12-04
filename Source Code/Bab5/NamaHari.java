// Cara memeroleh nama hari
//    menggunakan algoritma Zeller

import java.util.Scanner;

public class NamaHari {
    public static void main (String[] args) {
        int tanggal, bulan, tahun;

        System.out.println("Penentuan nama hari");
        System.out.println("-------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("Tanggal (1..31): ");
        tanggal = kbd.nextInt();

        System.out.print("Bulan (1..12): ");
        bulan = kbd.nextInt();

        System.out.print("Tahun: ");
        tahun = kbd.nextInt();

        // Konversi bulan dan tahun untuk bulan 1 atau 2
        if (bulan == 1) {
            bulan = 13;
            tahun = tahun - 1;
        }
        else 
            if (bulan ==  2) {
                bulan = 14;
                tahun = tahun - 1;
            }

        // Peroleh kode hari
        int tahunDalamAbad = tahun % 100;
        int abad = tahun / 100;

        int kodeHari = (tanggal + (26 * (bulan + 1) / 10) +
                       tahunDalamAbad +
                       tahunDalamAbad / 4 +
                       abad / 4 + 5 * abad) % 7;

        System.out.println("kode hari = " + kodeHari);

        switch (kodeHari) {
            case 0:
                System.out.println("Sabtu");
                break;
            case 1:
                System.out.println("Minggu");
                break;
            case 2:
                System.out.println("Senin");
                break;
            case 3:
                System.out.println("Selasa");
                break;
            case 4:
                System.out.println("Rabu");
                break;
            case 5:
                System.out.println("Kamis");
                break;
            case 6:
                System.out.println("Jumat");
                break;
        }
    }
}    
        