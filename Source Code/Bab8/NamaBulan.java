// Penyajian nama bulan

import java.util.Scanner;

public class NamaBulan {
    public static void main (String[] args) {
        String namaBulan[] = {
            "Januari", "Februari", "Maret", "April",
            "Mei", "Juni", "Juli", "Agustus",
            "September", "Oktober", "November",
            "Desember"
        };

        int kodeBulan;

        System.out.println("Penentuan nama bulan");
        System.out.println("--------------------");

        Scanner kbd = new Scanner(System.in);

        System.out.print("Kode bulan (1..12): ");
        kodeBulan = kbd.nextInt();

        if (kodeBulan < 1 || kodeBulan > 12)
            System.out.println(
                "Kode bulan harus antara 1 dan 12");
        else
            System.out.println("Bulan " + 
                               namaBulan[kodeBulan - 1]);
    }
}    
        