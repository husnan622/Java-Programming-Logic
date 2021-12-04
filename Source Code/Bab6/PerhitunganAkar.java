// Perhitungan akar menggunakan metode biseksi

import java.util.Scanner;

public class PerhitunganAkar {
    public static void main (String[] args) {
        double bilangan;

        System.out.println("Penentuan akar bilangan");
       
        Scanner kbd = new Scanner(System.in);
        System.out.print("Bilangan = ");
        bilangan = kbd.nextInt();

        double a = 1;
        double b = bilangan;
        final double EPSILON = 1e-10;
        while (b - a > EPSILON) {
            double x = (a + b) / 2;
            if (x * x > bilangan)
                b = x;
            else
                a = x;
        }

        double akar = a;
        System.out.println("Akar " + bilangan +
                           " = " + akar);
    }
}    
        