// Perhitungan jumlah digit

import java.util.Scanner;

public class JumDigit {
    public static void main (String[] args) {
        int bilangan;

        System.out.println("Perhitungan jumlah digit");
        System.out.println("------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("Bilangan = ");
        bilangan = kbd.nextInt();

        int jumDigit = 0;

        do {
            jumDigit++;

            bilangan = bilangan / 10;
        } while (bilangan != 0);

        System.out.println("Jumlah digit = " + jumDigit);
    }
}    
        