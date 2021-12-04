// Metode untuk menghitung rata-rata
//    nilai di larik

public class MetodeRerata {
    public static void main(String[] args) {
        int[] daftarBil = {
            1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 2
        };

        System.out.println("Rata-rata = " +
                           ratarata(daftarBil));
    }

    public static float ratarata(int[] larik) {
        int total = 0;
        int jum = larik.length;
        for (int j = 0; j < jum; j++) {
            total = total + larik[j];
        }

        return total / (float) jum;
    }
}
