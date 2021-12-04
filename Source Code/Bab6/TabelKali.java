// Faktor persekutuan terbesar

import java.util.Scanner;

public class TabelKali {
    public static void main (String[] args) {
        int n;

        System.out.println("Tabel perkalian");
        System.out.println("---------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        System.out.print("    ");
        for (int kolom = 1; kolom <= n; kolom++)
            System.out.printf("%3d ", kolom);

        System.out.println();

        for (int baris = 1; baris <= n; baris++) {
            System.out.printf("%3d ", baris);

            for (int kolom = 1; kolom < baris; kolom++)
                System.out.print("    ");

            for (int kolom = baris; kolom <= n; kolom++)
                System.out.printf("%3d ", baris * kolom);

            System.out.println();
        }
    }
}    
        