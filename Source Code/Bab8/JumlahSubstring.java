// Perhitungan jumlah substring ra

import java.util.Scanner;

public class JumlahSubstring {
    public static void main (String[] args) {
        System.out.println(
            "Perhitungan jumlah substring 'ra'");
        System.out.println(
            "---------------------------------");

        String teks;
        int jum = 0;

        Scanner kbd = new Scanner(System.in);
        System.out.print(
            "Masukkan string dengan sejumlah 'ra': ");
        teks = kbd.nextLine();

        // Proses pencarian dan perhitungan ‘ra’
        int pos = 0;
        do {
            int nilaiBalik = teks.indexOf("ra", pos);
            if (nilaiBalik == -1)
                break;

            jum++;
            pos = nilaiBalik + 2;
        } while (pos <= teks.length() - 2);

        System.out.println("Jumlah substring 'ra' = " +
                           jum);
    }
}    
        