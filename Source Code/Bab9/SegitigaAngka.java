// Metode untuk membentuk segitiga angka

import java.util.Scanner;

public class SegitigaAngka {
    public static void main(String[] args) {
        int n;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Masukkan angka antara 2 dan 9: ");
        n = kbd.nextInt();

        segitiga(n);
    }

    public static void segitiga(int n) {
        if (n < 2 || n > 9) {
            System.out.println("Angka harus antara 2 dan 9");
            return;
        }

        for (int baris = 1; baris < 2 * n; baris++) {
            int jumAngka;
            if (baris <= n)
                jumAngka = baris;
            else
                jumAngka = 2 * n - baris;

            for (int j = 0; j < jumAngka; j++)
                System.out.print(n);

            System.out.println();
        }
    }
}
