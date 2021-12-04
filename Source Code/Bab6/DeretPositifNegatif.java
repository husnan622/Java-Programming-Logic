// Deret bilangan positif dan negatif bergantian

import java.util.Scanner;

public class DeretPositifNegatif {
    public static void main (String[] args) {
        int n;

        System.out.println("Deret 1 -3 5 -7 9 -11 ...");
        System.out.println("-------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        int pengali = -1;
        int bilangan;

        for (int suku = 1; suku <= n; suku++) {
            pengali = -1 * pengali;
            bilangan = (2 * suku -1) * pengali;
            System.out.println(bilangan);
        }
    }
}    
        