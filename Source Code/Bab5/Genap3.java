// Penentuan bilangan genap atau ganjil
//    menggunakan operator ?:

import java.util.Scanner;

public class Genap3 {
    public static void main (String[] args) {
        System.out.println(
            "Penentuan bilangan genap/ganjil");
        System.out.println(
            "-------------------------------");

        String kategori;
        int bilangan;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Bilangan = ");
        bilangan = kbd.nextInt();

        // Penentuan bilangan genap atau ganjil
        kategori = bilangan % 2 == 0 ? "bilangan genap" : 
                                       "bilangan ganjil";

        System.out.println("Bilangan " + bilangan +
                           " merupakan bilangan " +
                           kategori);
    }
}    
        