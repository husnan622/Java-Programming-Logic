// Pemasukan data ke matriks melalui papan-ketik

import java.util.Scanner;

public class Pemasukan2Dim {
    public static void main (String[] args) {
        System.out.println(
            "Contoh pemasukan data ke matriks");
        System.out.println(
            "--------------------------------");

        int[][] matriks = new int[3][4];

        // Pengisian data
        Scanner kbd = new Scanner(System.in);
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 4; kolom++) {
                System.out.println("Data baris ke-" + 
                                   (baris + 1) +
                                   ", kolom ke-" + 
                                   (kolom + 1) +
                                   " = ");
                matriks[baris][kolom] = kbd.nextInt();
            }
        }

        // Penyajian data
        System.out.println();
        System.out.println("Data pada matriks:");

        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 4; kolom++)
               System.out.format("%4d", 
                                 matriks[baris][kolom]);

            System.out.println(); // Pindah baris
        }
    }
}    
        