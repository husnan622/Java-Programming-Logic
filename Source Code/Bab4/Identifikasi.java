// Pengujian jenis karakter

import java.util.Scanner;

public class Identifikasi {
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        System.out.println("Pengujian jenis karakter");
        System.out.println("------------------------");

        boolean hurufKapital, hurufKecil, angka;
        char karakter;

        System.out.print("Karakter = ");
        karakter = kbd.findInLine(".").charAt(0);

        hurufKapital = karakter >= 'A' && karakter <= 'Z';
        hurufKecil = karakter >= 'a' && karakter <= 'z';
        angka = karakter >= '0' && karakter <= '9';

        System.out.println("Huruf kapital? " + 
                           hurufKapital);
        System.out.println("Huruf kecil?   " + 
                           hurufKecil);
        System.out.println("Angka?         " + 
                           angka);
    }
}    
        