// Penyajian bilangan ganjil terlebih dahulu
//    dan kemudian diikuti dengan bilangan genap

import java.util.Scanner;

public class GanjilGenap {
    public static void main (String[] args) {
        final int JUM_DATA = 10;
        int[] data = new int[JUM_DATA];

        // Baca sepuluh data integer
        System.out.println("Masukkan " + JUM_DATA + 
                           " data bilangan bulat:");

        Scanner kbd = new Scanner(System.in);
        for (int indeks = 0; indeks < JUM_DATA;
             indeks++)
            data[indeks] = kbd.nextInt();

        // Tampilkan khusus untuk bilangan ganjil
        for (int indeks = 0; indeks < JUM_DATA;
             indeks++)
            if (data[indeks] % 2 != 0)
                System.out.println(data[indeks] + " ");

        // Tampilkan khusus untuk bilangan genap
        for (int indeks = 0; indeks < JUM_DATA;
             indeks++)
            if (data[indeks] % 2 == 0)
                System.out.print(data[indeks] + " ");

        System.out.println();
    }
}    
        