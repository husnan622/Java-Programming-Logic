// Pembuatan metode untuk mewujudkan nilai bawaan

public class BawaanSpasi {
    public static void main(String[] args) {
        String str = "Fusion";
        
        tampilDenganSpasi(str);
        tampilDenganSpasi(str, false);
        tampilDenganSpasi(str, true);
    }

    // Metode dengan satu argumen
    public static void tampilDenganSpasi(String teks) {
        String pemisah = " ";
        
        for (int j = 0; j < teks.length() - 1; j++)
            System.out.print(teks.charAt(j) + pemisah);

        System.out.println(
            teks.charAt(teks.length() - 1));
    }

    // Metode dengan dua argumen
    public static void tampilDenganSpasi(String teks,
                                         boolean spasi) {
        String pemisah = " ";
        if (!spasi)
            pemisah = "-";

        for (int j = 0; j < teks.length() - 1; j++)
            System.out.print(teks.charAt(j) + pemisah);

        System.out.println(teks.charAt(teks.length() - 1));
    }
}
