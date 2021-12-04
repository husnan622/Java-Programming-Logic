// Penghitungan huruf

import java.util.Scanner;

public class PenghitunganHuruf {
    public static void main (String[] args) {
        System.out.println("Penghitungan huruf");
        System.out.println("------------------");

        String teks;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        teks = kbd.nextLine();

        int jumHurufKapital = 0;
        int jumHurufKecil = 0;

        // Proses penghitungan huruf kecil dan kapital
        for (int j = 0; j < teks.length(); j++) {
            char kar = teks.charAt(j);
            if (Character.isUpperCase(kar))
                jumHurufKapital++;
            else
                if (Character.isLowerCase(kar))
                    jumHurufKecil++;
        }

        System.out.println("Jumlah huruf kapital = " +
                           jumHurufKapital);

        System.out.println("Jumlah huruf kecil = " +
                           jumHurufKecil);
    }
}    
        