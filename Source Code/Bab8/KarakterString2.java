// Pengaksesan karakter dalam string
//     Versi 2

public class KarakterString2 {
    public static void main (String[] args) {
        String kata = "Bravo";

        // Pengaksesan karakter
        for (int indeks = 0; 
             indeks < kata.length(); indeks++)
           System.out.println(kata.charAt(indeks));
    }
}    
        