// Perhitungan angsuran

import java.util.Scanner;
import java.lang.Math;

public class Angsuran {
    public static void main (String[] args) {
        double pokok, bungaPerTahun;
        int tempoDalamBulan;
        
        Scanner kbd = new Scanner(System.in); 

        System.out.println("Angsuran model flat");
        System.out.println("-------------------");

        System.out.print("Pokok pinjaman      = ");
        pokok = kbd.nextDouble();

        System.out.print("bunga per tahun (%) = ");
        bungaPerTahun = kbd.nextDouble();

        System.out.print("Tempo bulan         = ");
        tempoDalamBulan = kbd.nextInt();

        // Perhitungan angsuran
        long angsuran = Math.round(
            pokok * (1.0 / tempoDalamBulan +
                     bungaPerTahun / 1200));

        // Tampilkan hasilnya
        System.out.println("Angsuran per bulan  = " + 
                           angsuran);
    }
}    
        