// Penentuan bilangan negatif, nol, dan positif

import java.util.Scanner;

public class PositifNolNegatif {
    public static void main (String[] args) {
        System.out.println(
           "Bilangan negatif, nol, dan positif");
        System.out.println(
           "----------------------------------");

        double bilangan;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Bilangan = ");
        bilangan = kbd.nextDouble();

        // Penentuan bilangan negatif, nol, dan positif
        if (bilangan < 0)
            System.out.println("Bilangan negatif");
        else
            if (bilangan == 0)
                System.out.println("Bilangan nol");
            else
                System.out.println("Bilangan positif");
    }
}    
        