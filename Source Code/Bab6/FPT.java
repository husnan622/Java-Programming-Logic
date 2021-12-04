// Faktor persekutuan terbesar

import java.util.Scanner;

public class FPT {
    public static void main (String[] args) {
        int x, y, a, b, sisa;

        System.out.println("Faktor persekutuan terbesar");
        System.out.println("bilangan x dan y");
        System.out.println("---------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("x = ");
        x = kbd.nextInt();

        System.out.print("y = ");
        y = kbd.nextInt();

        // Peroleh bilangan terbesar dan terkecil
        if (x > y) {
            a = x;
            b = y;
        }
        else {
            a = y;
            b = x;
        }

        // Peroleh faktor persekutuan terbesar
        sisa = a % b;
        while (sisa != 0) {
            a = b;
            b = sisa;
            sisa = a % b;
        }

        System.out.println("FPT = " + b);
    }
}    
        