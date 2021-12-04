// Contoh larik berdimensi dua

public class Larik2Dim {
    public static void main (String[] args) {
        System.out.println(
            "Contoh larik berdimensi dua");
        System.out.println(
            "---------------------------");

        int[][] matriks = new int[3][4];

        // Pengisian data baris pertama
        matriks[0][0] = 1;
        matriks[0][1] = 2;
        matriks[0][2] = 3;
        matriks[0][3] = 4;

        // Pengisian data baris kedua
        matriks[1][0] = 5;
        matriks[1][1] = 6;
        matriks[1][2] = 7;
        matriks[1][3] = 8;

        // Pengisian data baris ketiga
        matriks[2][0] = 9;
        matriks[2][1] = 10;
        matriks[2][2] = 11;
        matriks[2][3] = 12;

        // Penyajian data
        System.out.println();
        System.out.println("Data pada matriks:");

        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 4; kolom++)
                System.out.printf("%4d",  
                                  matriks[baris][kolom]);

            System.out.println(); // Pindah baris  
        }
    }
}    
        