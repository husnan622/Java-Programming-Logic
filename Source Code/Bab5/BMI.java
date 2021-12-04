// Penentuan tahun kabisat

import java.util.Scanner;

public class BMI {
    public static void main (String[] args) {
        System.out.println("Body Mass Index");
        System.out.println("---------------");

        double berat, tinggi;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Berat (kg) = ");
        berat = kbd.nextDouble();

        System.out.print("Tinggi (m) = ");
        tinggi = kbd.nextDouble();

        // Hitung BMI
        double bmi = berat / (tinggi * tinggi);

        // Tampilkan hasilnya
        System.out.printf("BMI : %.2f\n", bmi);

        if (bmi < 18.5)
            System.out.println("Kategori: kurus");
        else
            if (bmi < 25)
                System.out.println("Kategori: normal");
            else
                if (bmi < 30)
                    System.out.println(
                        "Kategori: kelebihan berat");
                else
                    System.out.println("Kategori: kegemukan");
    }
}    
        