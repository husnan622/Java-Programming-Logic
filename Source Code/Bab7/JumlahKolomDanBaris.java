// Penerapan length pada larik berdimensi dua

public class JumlahKolomDanBaris {
    public static void main (String[] args) {
        System.out.println(
            "length pada larik berdimensi dua");
        System.out.println(
            "--------------------------------");

        int[][] matriks = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };

        // Penyajian data
        System.out.println();
        System.out.println("Jumlah baris = " +
                           matriks.length);
        System.out.println("Jumlah kolom = " +
                           matriks[0].length);
    }
}    
        