// Perhitungan luas segitiga

import java.util.Scanner;
import java.lang.Math;

public class Segitiga {
    public static void main (String[] args) {
        double a, b, c; // Sisi a, b, dan c
        
        Scanner kbd = new Scanner(System.in); 

        System.out.println("Perhitungan luas segitiga");
        System.out.println("-------------------------");

        System.out.print("Sisi pertama = ");
        a = kbd.nextDouble();

        System.out.print("Sisi kedua   = ");
        b = kbd.nextDouble();

        System.out.print("Sisi ketiga  = ");
        c = kbd.nextDouble();

        // Perhitungan luas segitiga
        double s = (a + b + c) / 2;
        double luas = Math.sqrt(s * (s - a) * (s - b) * 
                                    (s - c));

        // Tampilkan hasilnya
        System.out.println("Luas = " + luas);
    }
}    
        