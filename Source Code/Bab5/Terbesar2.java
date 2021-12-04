// Penentuan bilangan terbesar
//    di antara dua bilangan
//    menggunakan if..else

import java.util.Scanner;

public class Terbesar2 {
    public static void main (String[] args) {
        System.out.println("bilangan terbesar");
        System.out.println("antara dua bilangan bulat");
        System.out.println("-------------------------");

        int bilanganX, bilanganY, terbesar;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Bilangan pertama = ");
        bilanganX = kbd.nextInt();

        System.out.print("Bilangan kedua   = ");
        bilanganY = kbd.nextInt();

        // Penentuan bilangan terbesar
        
        if (bilanganX > bilanganY)
            terbesar = bilanganX;
        else
            terbesar = bilanganY;

        // Tampilkan hasilnya
        System.out.println("Bilangan terbesar = " + 
                           terbesar);
    }
}    
        