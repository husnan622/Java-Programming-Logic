// Contoh inisialisasi larik berdimensi dua

public class Init3Dim {
    public static void main (String[] args) {
        System.out.println(
            "Inisialisasi larik berdimensi tiga");
        System.out.println(
            "----------------------------------");

        int[][][] sel = {
            {{ 1, 71}, {2, 72}, {3, 73}, {4, 74}},
            {{ 5, 75}, {6, 76}, {7, 77}, {8, 78}},
            {{ 9, 79}, {10, 80}, {11, 81}, {12, 82}}
        };

        // Penyajian data
        System.out.println();
        System.out.println("Data pada larik sel:");

        for (int lapis = 0; lapis < 2; lapis++) {
            System.out.println("Lapis ke-" + (lapis + 1) +
                               ":");
            for (int baris = 0; baris < 3; baris++) {
                for (int kolom = 0; kolom < 4; kolom++)
                    System.out.printf("%4d",
                                      sel[baris][kolom][lapis]);

                System.out.println(); // Pindah baris
            }

            System.out.println(); // Pindah baris
        }
    }
}    
        