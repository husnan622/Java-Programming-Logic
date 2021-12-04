// Penggeseran nilai dalam larik

import java.util.Scanner;

public class Penggeseran {
    public static void main (String[] args) {
        final int JUM_DATA = 10;
        int[] data = new int[JUM_DATA];

        // Baca sepuluh data integer
        System.out.println("Masukkan 10 data bilangan bulat:");

        Scanner kbd = new Scanner(System.in);
        for (int indeks = 0; indeks < JUM_DATA;
             indeks++)
            data[indeks] = kbd.nextInt();

        // Proses untuk menggeser data
        int sementara = data[JUM_DATA - 1];
        for (int indeks = JUM_DATA - 2; indeks >= 0;
             indeks--)
            data[indeks + 1] = data[indeks];

        data[0] = sementara;

        // Tampilkan isi larik
        for (int indeks = 0; indeks < JUM_DATA;
             indeks++)
            System.out.print(data[indeks] + " ");

        System.out.println();
    }
}    
        