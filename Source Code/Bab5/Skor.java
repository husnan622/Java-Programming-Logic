// Penentuan skor A, B, C, D, dan E

import java.util.Scanner;

public class Skor {
    public static void main (String[] args) {
        System.out.println("Penentuan skor mata pelajaran");
        System.out.println("-----------------------------");

        double nilai;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Nilai (0 s/d 100) = ");
        nilai = kbd.nextDouble();

        // Penentuan skor
        if (nilai >= 90)
            System.out.println("Skor A");

        if (nilai >= 70 && nilai < 90)
            System.out.println("Skor B");

        if (nilai >= 60 && nilai < 70)
            System.out.println("Skor C");

        if (nilai >= 50 && nilai < 60)
            System.out.println("Skor D");

        if (nilai < 50)
            System.out.println("Skor E");
    }
}    
        