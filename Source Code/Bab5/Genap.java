// Penentuan bilangan genap atau ganjil
//     menggunakan if..else

import java.util.Scanner;

public class Genap {
    public static void main (String[] args) {
        System.out.println(
            "Penentuan bilangan genap/ganjil");
        System.out.println(
            "-------------------------------");

        int bilangan;
        String kategori;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Bilangan = ");
        bilangan = kbd.nextInt();

        // Penentuan bilangan genap atau ganjil
        kategori = "bilangan ganjil";
        if (bilangan % 2 == 0)
            System.out.pritln("Bilangan " + bilangan +
                              " merupakan bilangan genap");
        else
            System.out.pritln("Bilangan " + bilangan +
                              " merupakan bilangan ganjil");
    }
}    
        