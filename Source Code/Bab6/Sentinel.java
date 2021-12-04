// Penggunaan sentinel untuk
//    mengakhiri pemasukan data

import java.util.Scanner;

public class Sentinel {
    public static void main (String[] args) {
        int cacah;
        float total, data;

        cacah = 0;
        total = 0;

        Scanner kbd = new Scanner(System.in);
        System.out.print(
            "Masukkan data. (-1 = selesai): ");
        data = kbd.nextFloat();

        while (data != -1) {
            cacah++;       // Naikkan sebesar 1
            total += data; // Tambahkan data ke total

            System.out.print(
                "Masukkan data. (-1 = selesai): ");
            data = kbd.nextFloat();
        }

        // Hitung rata-rata
        float rerata = total / cacah;

        System.out.println("Rata-rata = " + rerata);
    }
}    
        