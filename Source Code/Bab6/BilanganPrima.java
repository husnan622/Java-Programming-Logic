// Bilangan prima

import java.util.Scanner;

public class BilanganPrima {
    public static void main (String[] args) {
        int n;

        System.out.println("Penentuan bilangan prima");
        System.out.println("------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("bilangan = ");
        n = kbd.nextInt();

        boolean prima = true;
        for (int bil = 2; bil <= n / 2; bil++) {
            if (n % bil == 0) {
                prima = false;
                break;
            }
        }

        if (prima)
            System.out.println(n + " adalah bilangan prima");
        else
            System.out.println(n + " bukan bilangan prima");
    }
}    
        