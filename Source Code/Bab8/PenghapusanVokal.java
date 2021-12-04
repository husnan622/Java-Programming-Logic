// Penghapusan huruf vokal

import java.util.Scanner;

public class PenghapusanVokal {
    public static void main (String[] args) {
        System.out.println("Penghapusan huruf vokal");
        System.out.println("-----------------------");

        String teks = "";
        String hasil = "";
        String strKarakter = "X";
        String strVokal = "aeiouAEIOU";

        Scanner kbd = new Scanner(System.in);
        System.out.print("Masukkan string: ");
        teks = kbd.nextLine();

        // Proses penghapusan huruf vokal
        for (int j = 0; j < teks.length(); j++) {
            char kar = teks.charAt(j);
            if (strVokal.indexOf(kar) == -1) {
                hasil = hasil + kar;
            }
        }

        System.out.println("hasil = " + hasil);
    }
}    
        