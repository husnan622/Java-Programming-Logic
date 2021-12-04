// Penyajian deret n bilangan ganjil
//    menggunakan for

import java.util.Scanner;

public class ForGanjil {
    public static void main (String[] args) {
        int n;

        System.out.println("Deret N bilangan ganjil");
        System.out.println("=======================");

        Scanner kbd = new Scanner(System.in);
        System.out.print("N = ");
        n = kbd.nextInt();

        for (int hitungan = 1; hitungan <= n; hitungan++)
            System.out.print((2 * hitungan - 1) + " ");

        System.out.println(); // Pindah baris
    }
}    
        