// Argumen berupa larik dua dimensi

import java.util.Scanner;

public class Arg2Dim {
    static int jumBaris, jumKolom;

    public static void main(String[] args) {
        final int MAKS_BARIS = 5;
        final int MAKS_KOLOM = 5;

        double matriks[][] = new double[MAKS_BARIS][MAKS_KOLOM];

        entriMatriks(matriks);

        // Tampilkan matriks
        System.out.println();
        System.out.println("Matriks:");
        for (int i = 0; i < jumBaris; i++) {
            for (int j = 0; j < jumKolom; j++)
                System.out.printf("%12.5f", matriks[i][j]);

            System.out.println();
        }
    }

    public static void entriMatriks(double mat[][]) {
        System.out.println(
            "Pastikan jumlah baris maupun kolom");
        System.out.println(
            "tidak lebih dari 5");
        System.out.println(
            "==================================");

        Scanner kbd = new Scanner(System.in);

        System.out.print("Jumlah baris: ");
        jumBaris = kbd.nextInt();

        System.out.print("Jumlah kolom: ");
        jumKolom = kbd.nextInt();

        for (int baris = 0; baris < jumBaris; baris++)
            for (int kolom = 0; kolom < jumKolom; kolom++) {
                System.out.print("Elemen [" + baris +
                                 ", " + kolom + "] = ");
                mat[baris][kolom] = kbd.nextDouble();
            }
    }
}
