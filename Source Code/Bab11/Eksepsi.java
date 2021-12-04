// Contoh yang dapat menimbulkan eksepsi

import java.util.Scanner;

public class Eksepsi {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int[] data = {2, 4, 1, 5, 6};

        System.out.print("Masukkan satu indeks larik: ");
        int indeks = kbd.nextInt();

        System.out.println("Data pada indeks " + indeks +
                           " = " + data[indeks]);
    }
}

