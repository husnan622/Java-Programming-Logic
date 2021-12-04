// Perhitungan nilai pi

import java.util.Scanner;
import java.lang.Math;

public class PerhitunganPi {
    public static void main (String[] args) {
        int n;

        System.out.println("Perhitungan nilai pi");
        System.out.println("--------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        double jumlah = 1;

        for (int suku = 2; suku <= n; suku++) {
            jumlah = jumlah + 1.0 / (suku * suku);
        }

        double pi = Math.sqrt(6 * jumlah);

        System.out.println("pi = " + pi);
    }
}    
        