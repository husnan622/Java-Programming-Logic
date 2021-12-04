// Penentuan huruf atau bukan

import java.util.Scanner;

public class IdentifikasiHuruf {
    public static void main (String[] args) {
        char kar;
        Scanner kbd = new Scanner(System.in);

        System.out.println(
            "Penentuan sebagai huruf atau bukan");
        System.out.print("Karakter = ");
        kar = kbd.findInLine(".").charAt(0);

        boolean huruf = ((kar >= 'A' && kar <= 'A') ||
                         (kar >= 'a' && kar <= 'z'));
        String keterangan =  huruf ? "huruf": "bukan huruf";
        System.out.println(kar + " adalah " +
                           keterangan );
    }
}    
        