// Contoh konversi string dari huruf kapital
//     ke huruf kecil dan sebaliknya

public class KonversiHuruf {
    public static void main (String[] args) {
        System.out.println("Konversi huruf dalam string");
        System.out.println("---------------------------");

        String teks = "Tes..tes 123. MUDAH ya?";

        System.out.println("Keadaan awal teks   : " + teks);

        // Konversi huruf kecil ke huruf kapital
        teks = teks.toUpperCase();

        System.out.println("Konversi huruf besar: " + teks);

        // Konversi huruf kapital ke huruf kecil
        teks = teks.toLowerCase();

        System.out.println("Konversi huruf kecil: " + teks);
    }
}    
        