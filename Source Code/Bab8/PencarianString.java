// Contoh pencarian string
//     yang mengandung "da"
//     menggunakan indexOf()

public class PencarianString {
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
            if (namaHewan[i].indexOf("da") != -1)
                System.out.println(namaHewan[i]);
    }
}    
        