// Contoh penukaran posisi pada larik
//     pada saat menampilkan isi larik

public class PenukaranPosisi {
    public static void main (String[] args) {
        int[] data = {
            7, 8, 9, 1, 4, 0, 3, 5, 2, 6
        };

        for (int indeks = 0; indeks < data.length / 2;
             indeks++) {
            System.out.print(data[indeks * 2 + 1] + " ");
            System.out.print(data[indeks * 2] + " ");
        }

        System.out.println();
    }
}    
        