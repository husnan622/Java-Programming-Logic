// Perhitungan cacah bilangan ganjil dari
//    10 bilangan bulat yang dihasilkan
//    secara acak

import java.util.Random;

public class CacahGanjil {
    public static void main (String[] args) {
        final int JUM_DATA = 10;
        int[] data = new int[JUM_DATA];

        // Buat 10 bilangan acak antara 0 dan 100
        Random acak = new Random();
        for (int indeks = 0; indeks < JUM_DATA;
             indeks++)
            data[indeks] = acak.nextInt(100 + 1);

        // Hitung cacah bilangan ganjil pada larik
        int cacah = 0;
        for (int indeks = 0; indeks < JUM_DATA;
             indeks++)
            if (data[indeks] % 2 == 1)
                cacah++;

        // Tampilkan larik dan cacah bilangan ganjil
        System.out.println("Daftar nilai acak: ");

        for (int indeks = 0; indeks < JUM_DATA;
             indeks++)
            System.out.print(data[indeks] + " ");

        System.out.println();
        System.out.println("Cacah bilangan ganjil = " +
                           cacah);
    }
}    
        