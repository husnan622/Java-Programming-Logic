// Penyajian deret n bilangan ganjil
//    menggunakan do..while
//    Versi 2

import java.util.Scanner;

public class NBilanganGanjil2 {
    public static void main (String[] args) {
        int bilangan;
        int n;

        System.out.println("Deret N bilangan ganjil");
        System.out.println("=======================");

        Scanner kbd = new Scanner(System.in); 
        System.out.print("N = ");
        n = kbd.nextInt();

        bilangan = 1;
        do {
            System.out.print(bilangan + " ");

            bilangan = bilangan + 2;
        } while (bilangan <= 2 * n - 1);

        System.out.println(); // Pindah baris
    }
}    
        