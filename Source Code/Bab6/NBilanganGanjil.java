// Penyajian deret n bilangan ganjil
//    menggunakan do..while

import java.util.Scanner;

public class NBilanganGanjil {
    public static void main (String[] args) {
        int hitungan;
        int n;

        System.out.println("Deret N bilangan ganjil");
        System.out.println("=======================");

        Scanner kbd = new Scanner(System.in); 
        System.out.print("N = ");
        n = kbd.nextInt();

        hitungan = 1;
        do {
            System.out.print((2 * hitungan - 1) + " ");

            hitungan = hitungan + 1;
        } while (hitungan <= n);

        System.out.println(); // Pindah baris
    }
}    
        