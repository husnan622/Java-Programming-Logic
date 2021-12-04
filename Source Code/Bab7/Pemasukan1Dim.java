// Pemasukan data ke larik melalui papan-ketik

import java.util.Scanner;

public class Pemasukan1Dim {
    public static void main (String[] args) {
        System.out.println("Contoh pemasukan data ke larik");
        System.out.println("------------------------------");

        int[] data = new int[5];

        // Pengisian data
        Scanner kbd = new Scanner(System.in);
        for (int indeks = 0; indeks < 5; indeks++) {
            System.out.print("Data ke-" + (indeks + 1) + 
                             " = ");
            data[indeks] = kbd.nextInt();
        }

        // Penyajian data
        System.out.println();

        System.out.println("Data pada larik:" );
        for (int indeks = 0; indeks < 5; indeks++)
            System.out.println(data[indeks]);
    }
}    
        