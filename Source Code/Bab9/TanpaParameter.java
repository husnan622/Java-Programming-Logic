// Contoh metode tanpa parameter dan
//     tanpa nilai balik

public class TanpaParameter {
    public static void main (String[] args) {
        tampilkanPemisah();

        System.out.println("Ayam\nItik\nKambing");

        tampilkanPemisah();

        System.out.println("Televisi\nRadio\nKulkas");

        tampilkanPemisah();
    }

    public static void tampilkanPemisah() {
        for (int j = 0; j < 20; j++)
            System.out.print("=");

        System.out.println(); // Pindah baris
    }
}    
        