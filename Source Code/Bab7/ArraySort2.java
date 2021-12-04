// Contoh pengurutan data bilangan
//     menggunakan Arrays.sort()
//     Pengurutan secara urut turun

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort2 {
    public static void main (String[] args) {
        System.out.println("Pengurutan data bilangan");
        System.out.println("------------------------");

        final int JUM_BILANGAN = 10;
        Integer[] daftarBil = new Integer[JUM_BILANGAN];

        // Pemasukan data
        Scanner kbd = new Scanner(System.in);
        System.out.println("Masukkan " + JUM_BILANGAN +
                           " bilangan bulat:");
        for (int i = 0; i < JUM_BILANGAN; i++)
            daftarBil[i] = kbd.nextInt();

        // Pengurutan data
        Arrays.sort(daftarBil, Collections.reverseOrder());

        // Penampilan hasil pengurutan
        for (int i = 0; i < JUM_BILANGAN; i++)
            System.out.print(daftarBil[i] + " ");

        System.out.println();
    }
}    
        