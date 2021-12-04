// Contoh pembuatan piramida terbalik

import java.util.Scanner;

public class Piramida {
    public static void main (String[] args) {
        int n;

        System.out.println("Pembuatan piramida terbalik");
        System.out.println("---------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        for (int baris = 1; baris <= n; baris++) {
            // Tampilkan karakter spasi
            for (int kolom = 1; kolom <= baris - 1; 
                 kolom++)
                System.out.print(" "); // Karakter spasi

            // Tampilkan *
            for (int indeks = 1; 
                 indeks <= 2 * (n - baris) + 1; indeks++)
                System.out.print("*"); // Simbol *

            System.out.println();
        }
    }
}    
        