// Contoh pemisahan string dengan split()
//     dengan melibatkan ekspresi regular

public class PemisahanString2 {
    public static void main (String[] args) {
        System.out.println("Pemisahan string");
        System.out.println("----------------");

        String teks = "1.Jakarta2.Bandung3.Denpasar4.Ambon";

        String hasil[] = teks.split("[0-9].");

        for (int j = 0; j < hasil.length; j++)
            System.out.println((j+1) + ". " + hasil[j]);
    }
}    
        