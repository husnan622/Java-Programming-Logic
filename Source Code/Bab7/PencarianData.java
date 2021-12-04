// Perhitungan cacah bilangan ganjil dari
//    10 bilangan bulat yang dihasilkan
//    secara acak

import java.util.Scanner;

public class PencarianData {
    public static void main (String[] args) {
        int[] data = {
            77, 48, 2, 23, 33, 45, 56, 0, 86, 71
        };

        int dicari;
        System.out.println("Pencarian data");
        System.out.println("==============");
        System.out.print("Data yang dicari: ");
        Scanner kbd = new Scanner(System.in);
        dicari = kbd.nextInt();

        // Pencarian data
        int posisi = -1;
        for (int indeks = 0; indeks < data.length; 
             indeks++) {
            if (data[indeks] == dicari) {
                posisi = indeks;
                break;
            }
        }

        // Penyajian informasi
        if (posisi == -1)
            System.out.println("Data tidak ditemukan");
        else
            System.out.println(
                "Data ditemukan. Posisi pada indeks " +
                posisi);
    }
}    
        