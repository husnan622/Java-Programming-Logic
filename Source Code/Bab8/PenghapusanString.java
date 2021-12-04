// Penghapusan substring dalam string

public class PenghapusanString {
    public static void main (String[] args) {
        System.out.println("-----------------------------");

        String teks = "Tika tidak pergi";

        System.out.println("Isi semula  : " + teks);

        teks = teks.replace("tidak ", "");
        System.out.println("Isi sekarang: " + teks);
    }
}    
        