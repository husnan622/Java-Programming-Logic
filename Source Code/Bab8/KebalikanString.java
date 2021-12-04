// Pembalikan string

public class KebalikanString {
    public static void main (String[] args) {
        String kata = "Bravo";

        // Pembalikan string
        String hasil = "";
        for (int indeks = kata.length() - 1; 
             indeks >= 0; indeks--)
            hasil = hasil + kata.charAt(indeks);     

        System.out.println(hasil);
    }
}    
        