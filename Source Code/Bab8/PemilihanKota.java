// Penyajian nama-nama kota di suatu negara

import java.util.Scanner;

public class PemilihanKota {
    public static void main (String[] args) {
        String tabel[][] = {
            {"Baden",     "Austria"},
            {"Bandung",   "Indonesia"},
            {"Bogor",	  "Indonesia"},
            {"Graz",      "Austria"},
            {"Innsbruck", "Austria"},
            {"Kariya",	  "Jepang"},
            {"Kudus",	  "Indonesia"},
            {"Kyoto",	  "Jepang"},
            {"Linz",	  "Austria"},
            {"Nagoya",	  "Jepang"},
            {"Samarinda", "Indonesia"},
            {"Tokyo",	  "Jepang"},
            {"Toyokawa",  "Jepang"},
            {"Wina",	  "Austria"}
        };

        String namaNegara;
        String negara;

        System.out.println("Daftar kota di suatu negara");
        System.out.println("---------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("nama negara: ");
        namaNegara = kbd.nextLine();

        int jumKota = 0;
        for (int indeks = 0; indeks < tabel.length; 
             indeks++) {
            if (namaNegara.toLowerCase().compareTo(
                tabel[indeks][1].toLowerCase()) == 0) {
                jumKota++;

                System.out.println(tabel[indeks][0]);
            }
        }

        if (jumKota == 0)
            System.out.println("Data tidak ditemukan");
        else
            System.out.println("Jumlah kota: " + jumKota);
    }
}    
        