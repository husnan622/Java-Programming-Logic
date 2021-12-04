// Nilai rata-rata 10 data

import java.util.Scanner;

public class RataRata {
    public static void main (String[] args) {
        int[] data = new int[10];

        int jumData = data.length;
        System.out.println("Masukkan " + jumData + 
                           " data bilangan bulat");

        Scanner kbd = new Scanner(System.in);
        int total = 0;
        for (int indeks = 0; indeks < jumData;
             indeks++) {
            data[indeks] = kbd.nextInt();
            total += data[indeks];
        }

        float rerata = total / (float) jumData;
        System.out.println("Rata-rata = " + rerata);

        // Tampilkan semua nilai di atas rata-rata
        System.out.println();
        System.out.println("Daftar nilai di atas rata-rata");

        for (int indeks = 0; indeks < jumData;
             indeks++)
            if (data[indeks] > rerata)
                System.out.println(data[indeks]);
    }
}    
        