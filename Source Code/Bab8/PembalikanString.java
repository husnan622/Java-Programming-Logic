// Pembalikan string

import java.util.Scanner;

public class PembalikanString {
    public static void main (String[] args) {
        System.out.println("Pembalikan string");
        System.out.println("-----------------");

        String teks = "";
        String hasil = "";

        Scanner kbd = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        teks = kbd.nextLine();

        // Proses pembalikan string
        for (int j = teks.length() - 1; j >= 0; j--) {
            hasil = hasil + teks.charAt(j);
        }

        System.out.println("hasil = " + hasil);
    }
}    
        