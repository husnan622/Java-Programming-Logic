// Penampilan string secara berulang
//    dengan setiap iterasi berikutnya
//    berkurang satu karakter

import java.util.Scanner;

public class GemaString {
    public static void main (String[] args) {
        String teks;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        teks = kbd.nextLine();

        // Proses penghitungan huruf kecil dan kapital
        for (int indeks = 0; indeks < teks.length();
             indeks++) {
            System.out.println(teks.substring(indeks));
        }
    }
}    
        