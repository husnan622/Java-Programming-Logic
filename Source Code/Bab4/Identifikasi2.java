// Pengujian jenis karakter
//     Versi 2

import java.util.Scanner;

public class Identifikasi2 {
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        System.out.println("Pengujian jenis karakter");
        System.out.println("------------------------");

        boolean hurufKapital, hurufKecil, angka;
        char karakter;

        System.out.print("Karakter = ");
        karakter = kbd.findInLine(".").charAt(0);

        hurufKapital = Character.isUpperCase(karakter);
        hurufKecil = Character.isLowerCase(karakter);
        angka = Character.isDigit(karakter);

        System.out.println("Huruf kapital? " + 
                           hurufKapital);
        System.out.println("Huruf kecil?   " + 
                           hurufKecil);
        System.out.println("Angka?         " + 
                           angka);
    }
}    
        