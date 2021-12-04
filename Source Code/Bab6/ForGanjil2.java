// Penyajian deret n bilangan ganjil
//    menggunakan for
//    Versi 2

import java.util.Scanner;

public class ForGanjil2 {
    public static void main (String[] args) {
        int n;

        System.out.println("Deret N bilangan ganjil");
        System.out.println("=======================");

        Scanner kbd = new Scanner(System.in);
        System.out.print("N = ");
        n = kbd.nextInt();

        for (int bilangan = 1; bilangan <= 2 * n - 1; 
             bilangan += 2)
            System.out.print(bilangan + " ");

        System.out.println(); // Pindah baris
    }
}    
        