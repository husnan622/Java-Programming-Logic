// Contoh larik berdimensi satu

public class Larik1Dim {
    public static void main (String[] args) {
        System.out.println("Contoh larik berdimensi satu");
        System.out.println("----------------------------");

        // Deklarasi larik
        int[] data;

        // Instansiasi larik
        data = new int[5];

        // Pengisian data
        data[0] = 50;
        data[1] = 77;
        data[2] = 30;
        data[3] = 1;
        data[4] = 22;

        // Penyajian data
        System.out.println();
        System.out.println("Data pada larik:");

        for (int indeks = 0; indeks < 5; indeks++)
            System.out.println(data[indeks]);
    }
}    
        