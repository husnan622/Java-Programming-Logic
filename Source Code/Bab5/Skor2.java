// Penentuan skor A, B, C, D, dan E
//    menggunakan if bertingkat

import java.util.Scanner;

public class Skor2 {
    public static void main (String[] args) {
        System.out.println("Penentuan skor mata pelajaran");
        System.out.println("-----------------------------");

        double nilai;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Nilai (0 s/d 100) = ");
        nilai = kbd.nextDouble();

        // Penentuan skor
        if (nilai <= 0 || nilai > 100)
            System.out.println("Nilai tidak valid");
        else
            if (nilai >= 90)
                System.out.println("Skor A");
            else
                if (nilai >= 70)
                    System.out.println("Skor B");
                else
                    if (nilai >= 60)
                        System.out.println("Skor C");
                    else
                        if (nilai >= 50)
                            System.out.println("Skor D");
                        else
                            System.out.println("Skor E");
    }
}    
        