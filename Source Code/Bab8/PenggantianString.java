// Contoh penggunaan replace()
//     untuk mengganti bagian string

public class PenggantianString {
    public static void main (String[] args) {
        System.out.println("Metode replace()");
        System.out.println("----------------");

        String teks = "ratatata taratara";  

        System.out.println("Isi teks semula: " + teks);

        // Penggantian "ra" dengan "di"
        teks = teks.replace("ra", "di");
        System.out.println("ra diganti di  : " + teks);
    }
}    
        