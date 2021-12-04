// Contoh metode dengan parameter bersifat variabel
//     Digunakan untuk menghitung nilai rerata

public class Rerata {
    public static void main(String[] args) {
        System.out.println("Rata-rata pertama = " + 
                           rerata(10, 20, 30));

        System.out.println("Rata-rata kedua= " +
                           rerata(10, 20, 30, 40, 50));
    }

    public static double rerata(int ... args) {
        int total = 0;
        int jumParam = args.length;
        for (int j = 0; j < jumParam; j++)
           total = total + args[j];

        return total / (double) jumParam;
    }
}
