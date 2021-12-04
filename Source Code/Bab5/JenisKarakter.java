// Penentuan jenis karakter

import java.util.Scanner;

public class JenisKarakter {
    public static void main (String[] args) {
        System.out.println("Penentuan jenis karakter");
        System.out.println("------------------------");

        char karakter;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Karakter = ");
        karakter = kbd.findInLine(".").charAt(0);

        // Tentukan jenis karakter
        if (Character.isUpperCase(karakter))
            System.out.println(karakter + 
                               " adalah huruf kapital");
        else
            if (Character.isLowerCase(karakter))
                System.out.println(karakter + 
                                   " adalah huruf kecil");
            else
                if (Character.isDigit(karakter))
                    System.out.println(karakter +
                                       " adalah angka");
                else
                    System.out.println(karakter
                        + " adalah bukan huruf "
                        + "maupun angka");
    }
}    
        