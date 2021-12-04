// Pembuatan grafik

import java.util.Scanner;

public class Grafik {
    public static void main (String[] args) {
        int data[] = {
            27, 30, 5, 15, 18, 33, 40, 8, 20, 25
        };

        for (int indeks = 0; indeks < data.length; 
             indeks++) {
            System.out.printf("%4d: ", data[indeks]);
            for (int j = 0; j < data[indeks]; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}    
        