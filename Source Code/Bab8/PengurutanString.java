// Contoh pengurutan data berkelas String

import java.util.Scanner;

public class PengurutanString {
    public static void main (String[] args) {
        System.out.println("Pengurutan data nama hewan");
        System.out.println("--------------------------");

        String[] namaHewan = {
            "Garuda",
            "Kuda",
            "Kanguru",
            "Barakuda",
            "Burung dara",
            "Unta",
            "Kedasih",
            "Badak",
            "Harimau",
            "Panda"
        };

        // Pengurutan data
        int jumHewan = namaHewan.length;
        String sementara;
        for (int i = 0; i < jumHewan - 1; i++)
            for (int j = i + 1; j < jumHewan; j++)
                if (namaHewan[i].compareTo(namaHewan[j]) 
                    > 0) {
                    // Penukaran dua data
                    sementara = namaHewan[i];
                    namaHewan[i] = namaHewan[j];
                    namaHewan[j] = sementara;
                }

        // Penampilan hasil pengurutan
        for (int i = 0; i < jumHewan; i++)
            System.out.println(namaHewan[i]);
    }
}    
        