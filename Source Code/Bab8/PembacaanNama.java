// Pemasukan data string dari papan-ketik
//     dan diberikan ke objek berkelas String

import java.util.Scanner;

public class PembacaanNama {
    public static void main (String[] args) {
        System.out.println(
            "Pemasukan string dari papan-ketik");
        System.out.println(
            "---------------------------------");

        String nama;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Nama Anda: ");
        nama = kbd.nextLine();

        System.out.println("Hai, " + nama +
                           ". Trims, ya!");
    }
}    
        