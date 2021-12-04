// Penentuan lulus atau tidak

import java.util.Scanner;

public class Kelulusan {
    public static void main (String[] args) {
        int nilai;
        Scanner kbd = new Scanner(System.in);

        System.out.println("Penentuan lulus atau tidak");
        System.out.print("Nilai = ");
        nilai = kbd.nextInt();

        boolean lulus = nilai >= 60;
        String hasil =  lulus ? "Lulus": "Tidak lulus";
        System.out.println(hasil );
    }
}    
        