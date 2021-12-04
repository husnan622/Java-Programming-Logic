// Penentuan palindrom

import java.util.Scanner;

public class StringPalindrom {
    public static void main (String[] args) {
        System.out.println("Penentuan string palindrom");
        System.out.println("--------------------------");

        String teks = "";
        String hasil = "";

        Scanner kbd = new Scanner(System.in);
        System.out.print("Masukkan string: ");
        teks = kbd.nextLine();

        // Proses pembalikan string
        for (int j = teks.length() - 1; j >= 0; j--) {
            hasil = hasil + teks.charAt(j);
        }

        // Penentuan palindrom
        if (teks.compareTo(hasil) == 0)
            System.out.println(teks + " adalah string palindrom");
        else
            System.out.println(teks + " bukan string palindrom");
    }
}    
        