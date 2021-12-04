// Contoh inisialisasi larik berdimensi dua

public class Init2Dim {
    public static void main (String[] args) {
        System.out.println(
            "Inisialisasi larik berdimensi dua");
        System.out.println(
            "---------------------------------");

        int[][] matriks = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };

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
        