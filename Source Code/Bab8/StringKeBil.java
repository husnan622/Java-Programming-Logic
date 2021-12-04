// Konversi string ke bilangan

import java.util.Scanner;

public class Tes {
    public static void main(String[] args) {
        
        String st;
        int bilBulat;

        // Tes pertama
        st = "123";
        bilBulat = Integer.valueOf(st);
        System.out.print(bilBulat);

        // Tes pertama
        st = "123";
        bilBulat = Integer.parseInt(st);
        System.out.print(bilBulat);

        // Tes ketiga
        st = "123A";
        bilBulat = Integer.valueOf(st);
        System.out.print(bilBulat);        
    }
}

