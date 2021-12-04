// Contoh Larik string

import java.util.Scanner;

public class LarikString {
    public static void main (String[] args) {
        System.out.println("Larik string");
        System.out.println("------------");

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

        // Penampilan isi larik
        for (int i = 0; i < namaHewan.length; i++)
            System.out.println(namaHewan[i]);
    }
}    
        