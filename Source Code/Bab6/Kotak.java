// Contoh pembuatan kotak

import java.util.Scanner;

public class Kotak {
    public static void main (String[] args) {
        int n;

        System.out.println("Pembuatan kotak");
        System.out.println("---------------");

        Scanner kbd = new Scanner(System.in);

        System.out.print("n (lebih besar daripada 2) = ");
        n = kbd.nextInt();

        // Tampilkan 2 n simbol *
        for (int kolom = 1; kolom <= 2 * n; kolom++)
            System.out.print("*");

        System.out.println(); // Pindah baris

        // Tampilkan satu simbol *
        //    diikuti dengan sejumlah spasi
        //    dan satu simbol *
        for (int indeks = 1; indeks <= n - 2; indeks++) {
            System.out.print("*");

            for (int kolom = 1; kolom < 2 * n - 1; kolom++)
                System.out.print(" "); // Karakter spasi

            System.out.println("*");
        }

        // Tampilkan 2 n simbol *
        for (int kolom = 1; kolom <= 2 * n; kolom++)
            System.out.print("*");

        System.out.println(); // Pindah baris
    }
}    
        