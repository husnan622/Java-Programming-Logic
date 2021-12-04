// Penentuan skor A, B, C, D, dan E
//    menggunakan switch

import java.util.Scanner;

public class Skor3 {
    public static void main (String[] args) {
        System.out.println("Penentuan skor mata pelajaran");
        System.out.println("-----------------------------");

        double nilai;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Nilai (0 s/d 100) = ");
        nilai = kbd.nextDouble();

        // Pembagian dengan 10
        int bilangan = (int) (nilai / 10);

        // Penentuan skor
        if (nilai <= 0 || nilai > 100)
            System.out.println("Nilai tidak valid");
        else
            switch (bilangan) {
                case 10:
                case 9:
                    System.out.println("Skor A");
                    break;
                case 8:
                case 7:
                    System.out.println("Skor B");
                    break;
                case 6:
                    System.out.println("Skor C");
                    break;
                case 5:
                    System.out.println("Skor D");
                    break;
                default:
                    System.out.println("Skor E");
        }
    }
}    
        