// Penentuan bilangan terkecil
//    di antara tiga bilangan
//    Versi 1

import java.util.Scanner;

public class Terkecil {
    public static void main (String[] args) {
        System.out.println("Penentuan bilangan terkecil");
        System.out.println("di antara tiga bilangan bulat");
        System.out.println("-----------------------------" );

        int bilX, bilY, bilZ, terkecil;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Bilangan pertama = ");
        bilX = kbd.nextInt();

        System.out.println("Bilangan kedua   = ");
        bilY = kbd.nextInt();

        System.out.println("Bilangan ketiga  = ");
        bilZ = kbd.nextInt();

        // Penentuan bilangan terkecil
        terkecil = bilX;
        if (bilY < terkecil)
            terkecil = bilY;

        if (bilZ < terkecil)
            terkecil = bilZ;

        // Tampilkan hasilnya
        System.out.println("Bilangan terkecil = " + 
                           terkecil );
    }
}    
        