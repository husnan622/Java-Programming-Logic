// Contoh pemisahan string dengan split()

public class PemisahanString {
    public static void main (String[] args) {
        System.out.println("Pemisahan string");
        System.out.println("----------------");

        String teks = "Jakarta Bandung Denpasar Ambon";

        String hasil[] = teks.split(" ");

        for (int j = 0; j < hasil.length; j++)
            System.out.println(hasil[j]);
    }
}    
        