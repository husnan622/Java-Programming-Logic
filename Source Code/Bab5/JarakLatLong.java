// Jarak dua posisi di bumi

import java.util.Scanner;
import java.lang.Math;

public class JarakLatLong {
    public static void main (String[] args) {
        final double RADIAN = 0.017453277; // pi / 180
        final double RBUMI  = 6371.0;      // KM

        double lintang1, bujur1, lintang2, bujur2;
        
        Scanner kbd = new Scanner(System.in); 

        System.out.println("Perhitungan jarak di bumi");
        System.out.println("-------------------------");

        System.out.print("Lintang 1 = ");
        lintang1 = kbd.nextDouble();

        System.out.print("Bujur 1   = ");
        bujur1 = kbd.nextDouble();

        System.out.print("Lintang 2 = ");
        lintang2 = kbd.nextDouble();

        System.out.print("Bujur 2   = ");
        bujur2 = kbd.nextDouble();

        // Ubah ke radian
        lintang1 *= RADIAN;
        lintang2 *= RADIAN;

        bujur1 *= RADIAN;
        bujur2 *= RADIAN;

        // Hitung jarak dua posisi
        double jarak = RBUMI *
                       Math.acos((Math.sin(lintang1) * 
                                  Math.sin(lintang2)) +
                                 (Math.cos(lintang1) * 
                                  Math.cos(lintang2) *
                                  Math.cos(bujur1 - bujur2)));

        // Tampilkan hasilnya
        System.out.println("Jarak dalam KM = " + jarak);
    }
}    
        