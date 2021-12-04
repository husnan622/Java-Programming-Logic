// Contoh penghapusan spasi-putih

public class PenghapusanSpasiPutih {
    public static void main (String[] args) {
        System.out.println("Metode trim()");
        System.out.println("-------------");

        String teks = "\n ABC 123   ";
        System.out.println("Jumlah karakter semula  : " +
                           teks.length());

        teks = teks.trim();
        System.out.println("Jumlah karakter sekarang: " +
                           teks.length());
    }
}    
        