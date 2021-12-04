// Penentuan tahun kabisat

import java.util.Scanner;

public class Kabisat {
    public static void main (String[] args) {
        System.out.println("Penentuan tahun kabisat");
        System.out.println("-----------------------");

        int tahun;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Tahun = ");
        tahun = kbd.nextInt();

        if (tahun % 4 == 0)
            if (tahun % 100 == 0 && tahun % 400 != 0)
                System.out.println("Bukan tahun kabisat" );
            else
                System.out.println("Tahun kabisat" );
        else
            System.out.println("Bukan tahun kabisat" );
    }
}    
        