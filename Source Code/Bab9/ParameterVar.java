// Contoh metode dengan argumen bersifat variabel

public class ParameterVar {
    public static void main(String[] args) {
        System.out.println("*** Tes pertama:");
        perolehArgumen(1, 3, 5, 7, 9);

        System.out.println();
        System.out.println("*** Tes kedua:");
        perolehArgumen(2, 4, 6);
    }

    public static void perolehArgumen(int ... args) {
        int jumParam = args.length;
        for (int j = 0; j < jumParam; j++)
           System.out.println("Argumen " + (j + 1) +
                              ": " + args[j]);
    }
}
