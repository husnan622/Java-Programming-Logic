// Contoh pencarian string
//     yang mengandung "da"
//     menggunakan contains()

public class PencarianString2 {
    public static void main (String[] args) {
        System.out.println(
            "Nama-nama hewan yang mengandung 'da'");
        System.out.println(
            "------------------------------------");
         
        String namaHewan[] = {
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

        // Seleksi yang mengandung 'da'
        for (int i = 0; i < namaHewan.length; i++)
            if (namaHewan[i].contains("da"))
                System.out.println(namaHewan[i]);
    }
}    
        