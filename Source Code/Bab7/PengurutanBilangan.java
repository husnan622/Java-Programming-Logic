// Contoh pengurutan data bilangan

import java.util.Scanner;

public class PengurutanBilangan {
    public static void main (String[] args) {
        System.out.println("Pengurutan data bilangan");
        System.out.println("------------------------");

        final int JUM_BILANGAN = 10;
        int[] daftarBil = new int[JUM_BILANGAN];

        // Pemasukan data
        Scanner kbd = new Scanner(System.in);
        System.out.println("Masukkan " + JUM_BILANGAN +
                           " bilangan bulat:");
        for (int i = 0; i < JUM_BILANGAN; i++)
            daftarBil[i] = kbd.nextInt();

        // Pengurutan data
        int sementara;
        for (int i = 0; i < JUM_BILANGAN - 1; i++)
            for (int j = i + 1; j < JUM_BILANGAN; j++)
                if (daftarBil[i] > daftarBil[j]) {
                    // Penukaran dua data
                    sementara = daftarBil[i];
                    daftarBil[i] = daftarBil[j];
                    daftarBil[j] = sementara;
                }

        // Penampilan hasil pengurutan
        for (int i = 0; i < JUM_BILANGAN; i++)
            System.out.print(daftarBil[i] + " ");

        System.out.println();
    }
}    
        