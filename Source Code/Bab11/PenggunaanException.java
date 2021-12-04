// Contoh penggunaan Exception

import java.util.Scanner;

public class PenggunaanException {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int[] data = {2, 4, 1, 5, 6};
        int indeks = 0;

        while (true) {
            try {
                System.out.print(
                    "Masukkan satu indeks larik: ");
                indeks = kbd.nextInt();

                System.out.println("Data pada indeks " + 
                                    indeks +
                                    " = " + data[indeks]);
                break;
            }
            catch (Exception e) {
                String namaKelas = e.getClass().getSimpleName();

                System.out.println();
                System.out.println(
                    "Nama kelas eksepsi: " + namaKelas);
                System.out.println(
                    "Pesan: " + e.getMessage());
                System.out.println();

                // Penanganan untuk InputMismatchException
                if (namaKelas.equals("InputMismatchException"))
                    kbd.nextLine(); // Kosongkan penyngga
            }
           
            
        }
    }
}

