// Contoh penanganan eksepsi

import java.util.Scanner;

public class Eksepsi2 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int[] data = {2, 4, 1, 5, 6};
        int indeks = 0;

        while (true) {
            try {
                System.out.print(
                    "Masukkan satu indeks larik: ");
                indeks = kbd.nextInt();

                System.out.println("Data pada indeks " + 
                                    indeks +
                                    " = " + data[indeks]);
                break;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indeks " + indeks +
                                       " tidak valid");
                System.out.println();
            }
        }
    }
}

