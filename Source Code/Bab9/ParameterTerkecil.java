// Contoh metode dengan parameter bersifat variabel
//     dan mengembalikan nilai terkecilnya

public class ParameterTerkecil {
    public static void main(String[] args) {
        System.out.println("Terkecil = " + 
                           terkecil(50, 30, 45, 8, 44));

        System.out.println("Terkecil = " + 
                           terkecil(50, 30, 45, 8, 44, 34, 1));
    }

    public static int terkecil(int ... args) {
        int jumParam = args.length;
        int hasil = args[0];
        for (int j = 0; j < jumParam; j++)
           if (hasil > args[j])
               hasil = args[j];        

        return hasil;
    }
}
