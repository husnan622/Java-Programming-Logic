// Pembalikan string
//     Versi 2

public class KebalikanString2 {
    public static void main (String[] args) {
        String kata = "Bravo";

        // Pembalikan string
        String hasil = "";
        for (int indeks = 0; 
             indeks < kata.length(); indeks++)
            hasil = kata.charAt(indeks) + hasil;     

        System.out.println(hasil);
    }
}    
        