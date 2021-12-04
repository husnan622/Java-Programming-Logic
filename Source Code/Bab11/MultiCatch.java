// Penanganan dua eksepsi

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
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
            catch (InputMismatchException e) {
                System.out.println(
                    "Indeks harus berupa bilangan");
                System.out.println();

                // Kosongkan penyangga papan-ketik
                kbd.nextLine();
            }
        }
    }
}

