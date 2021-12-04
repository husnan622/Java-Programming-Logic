// Fungsi untuk membuat enkripsi teks

import java.util.Scanner;

public class Enkripsi {
    public static void main(String[] args) {
        String str;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Masukkan suatu string: ");
        str = kbd.nextLine();

        System.out.println("Hasil enkripsi:");
        System.out.println(enkripsi(str));
    }

    public static String enkripsi(String teks) {
        String hasil = "";
        for (int j = 0; j < teks.length(); j++) {
            char karakter = teks.charAt(j);

            if (Character.isUpperCase(karakter)) {
                if (karakter == 'Y')
                    karakter = 'A';
                else if (karakter == 'Z')
                    karakter = 'B';
                else
                    karakter = (char) ((int) karakter + 2);
            }
            else 
                if (Character.isLowerCase(karakter)) {
                    if (karakter == 'a')
                        karakter = 'z';
                    else
                        karakter = (char) ((int) karakter - 1);
                }
                else 
                    if (Character.isDigit(karakter)) {
                       karakter = (char)((int) '0' + 
                           ((int) '9' - (int) karakter));
                    }

            // Simpan di hasil
            hasil = hasil + karakter;
        }

        return hasil;
    }
}
