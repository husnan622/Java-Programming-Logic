// Penjumlahan matriks

public class JumMatriks {
    public static void main (String[] args) {
        final int JUM_BARIS = 3;
        final int JUM_KOLOM = 3;

        int[][] matriksA = {
            {1, 3, 2},
            {4, 6, 5},
            {9, 7, 8}
        };

        int[][] matriksB = {
            {8, -1, 4},
            {-7, 3, -6},
            {9, -2, 5},
        };

        // Penyajian jumlah matriksA dan matriksB
        for (int baris = 0; baris < JUM_BARIS; baris++) {
            for (int kolom = 0; kolom < JUM_KOLOM; kolom++)
                System.out.printf("%4d",
                                  matriksA[baris][kolom] +
                                  matriksB[baris][kolom]);

            System.out.println();
        }
    }
}    
        