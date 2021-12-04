// Contoh format()

public class FormatString {
    public static void main (String[] args) {
        System.out.println("Metode format()");
        System.out.println("---------------");

        String teks = "Tes..tes.123!";
        String hasil = teks.format("%s = %d", 
                                   "Harga", 50000);
        System.out.println(hasil);
        System.out.println(teks);
    }
}    
        