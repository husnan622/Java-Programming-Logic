// Contoh penggunaan try..finally

import java.util.Scanner;

public class PenggunaanFinally {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int[] data = {2, 4, 1, 5, 6};
        int indeks = 0;

        try {
            System.out.print(
                "Masukkan satu indeks larik: ");
            indeks = kbd.nextInt();

            System.out.println("Data pada indeks " + 
                               indeks +
                               " = " + data[indeks]);
            System.out.println("Tidak terjadi eksepsi");
        }
        catch (Exception e) {
            System.out.println("Terjadi eksepsi");
        }
        finally {   
            System.out.println("Bagian finally dijalankan");
        }
    }
}

