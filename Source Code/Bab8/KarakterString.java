// Pengaksesan karakter dalam string

public class KarakterString {
    public static void main (String[] args) {
        String kata = "Bravo";

        // Konversi string ke larik karakter
        char[] larikKar = kata.toCharArray();

        // Pengaksesan karakter
        for (int indeks = 0; 
             indeks < kata.length(); indeks++)
           System.out.println(larikKar[indeks]);
    }
}    
        