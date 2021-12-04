// Deret kuadrat

import java.util.Scanner;

public class DeretKuadrat {
    public static void main (String[] args) {
        int n;

        System.out.println("Deret kuadrat");
        System.out.println("-------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        for (int suku = 1; suku <= n; suku++) {
            System.out.println(suku * suku);
        }
    }
}    
        