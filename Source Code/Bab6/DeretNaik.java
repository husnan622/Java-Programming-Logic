// Deret 1 3 6 10 15 21 28 36 45 55  …

import java.util.Scanner;

public class DeretNaik {
    public static void main (String[] args) {
        int n;

        System.out.println(
            "Deret 1 3 6 10 15 21 28 36 45 55 66 78 ...");
        System.out.println(
            "------------------------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        int bilangan = 0;
        for (int suku = 1; suku <= n; suku++) {
            bilangan = bilangan + suku;
            System.out.print(bilangan + " ");
        }

        System.out.println();
    }
}    
        