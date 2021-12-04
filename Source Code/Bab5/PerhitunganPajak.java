// Perhitungan pajak

import java.util.Scanner;

public class PerhitunganPajak {
    public static void main (String[] args) {
        System.out.println("Perhitungan pajak");
        System.out.println("-----------------");

        long penghasilan, pajak;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Penghasilan kena pajak = ");
        penghasilan = kbd.nextLong();

        // Tentukan pajak
        if (penghasilan > 500000000)
            pajak = 2500000 + 15000000 + 87500000 +
                    (penghasilan - 500000000) * 30 / 100;
        else
            if (penghasilan > 150000000)
                pajak = 2500000 + 15000000 +
                       (penghasilan - 150000000) * 
                       25 / 100;
            else
                if (penghasilan > 50000000)
                    pajak = 2500000 +
                           (penghasilan - 50000000) * 
                           15 / 100;
                else
                    pajak = penghasilan * 5 / 100;

        // Tampilkan hasilnya
        System.out.println("Pajak = " + pajak);
    }
}    
        