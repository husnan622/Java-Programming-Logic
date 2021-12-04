// Contoh pengurutan data bilangan
//     menggunakan Arrays.sort()

import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {
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
        Arrays.sort(daftarBil);

        // Penampilan hasil pengurutan
        for (int i = 0; i < JUM_BILANGAN; i++)
            System.out.print(daftarBil[i] + " ");

        System.out.println();
    }
}    
        