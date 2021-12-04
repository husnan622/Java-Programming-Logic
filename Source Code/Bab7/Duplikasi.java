// Penghilangan duplikasi data

import java.util.Scanner;

public class Duplikasi {
    public static void main (String[] args) {
        System.out.println("Penghilangan duplikasi data");
        System.out.println("---------------------------");

        final int JUM_BILANGAN = 10;
        int[] daftarBil = new int[JUM_BILANGAN];
        int[] daftarUnik = new int[JUM_BILANGAN];

        // Pemasukan data
        Scanner kbd = new Scanner(System.in);
        System.out.println("Masukkan " + JUM_BILANGAN +
                           " bilangan bulat:");
        for (int i = 0; i < JUM_BILANGAN; i++)
            daftarBil[i] = kbd.nextInt();

        // Penghilangan data yang kembar
        int jumTidakKembar = 0;
        for (int i = 0; i < JUM_BILANGAN; i++) {
            int posisi = -1;
            for (int j = 0; j < jumTidakKembar; j++) {
                if (daftarBil[i] == daftarUnik[j]) {
                    posisi = j;
                    break;
                }
            }
        
            if (posisi == -1) {
                daftarUnik[jumTidakKembar] = daftarBil[i];
                jumTidakKembar++;
            }
        }

        // Penampilan hasil tanpa duplikasi
        System.out.println("Hasil: ");
        for (int i = 0; i < jumTidakKembar; i++)
            System.out.print(daftarUnik[i] + " ");

        System.out.println();
    }
}    
        