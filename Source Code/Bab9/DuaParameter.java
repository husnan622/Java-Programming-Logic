// Contoh metode dengan dua parameter dan
//     tanpa nilai balik

public class DuaParameter {
    public static void main (String[] args) {
        pemisahBaris("*-", 4);

        System.out.println("Ayam\nItik\nKambing");

        pemisahBaris("-", 15);

        System.out.println("Televisi\nRadio\nKulkas");

        pemisahBaris("*----", 3);
    }

    // ---------------------------------------
    // String pemisah ditampilkan n kali
    //    dalam satu baris
    // ---------------------------------------

    public static void pemisahBaris(String pemisah, 
                                    int n) {
        for (int j = 0; j < n; j++)
            System.out.print(pemisah);

        System.out.println(); // Pindah baris
    }
}    
        