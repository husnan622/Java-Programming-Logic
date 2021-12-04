// Tiga metode dengan nama sama

public class Overloading {
    public static void main(String[] args) {
        System.out.println(terkecil(45, 2));
        System.out.println(terkecil(2, 45));

        System.out.println(terkecil(55, 33, 66));

        System.out.println(terkecil("Dua", "Tiga"));
    }

    // Mendapatkan nilai terkecil
    //     di antara dua nilai bulat
    public static int terkecil(int nilaiA, int nilaiB) {
        if (nilaiA < nilaiB)
            return nilaiA;
        else
            return nilaiB;
    }

    // Mendapatkan nilai terkecil
    //     di antara tiga nilai bulat
    public static int terkecil(int nilaiA, int nilaiB, 
                               int nilaiC) {
        int nilaiTerkecil = nilaiA;
        if (nilaiB < nilaiTerkecil)
            nilaiTerkecil = nilaiB;
        if (nilaiC < nilaiTerkecil)
            nilaiTerkecil = nilaiC;

        return nilaiTerkecil;
    }

    // Mendapatkan nilai terkecil
    //     di antara dua string
    public static String terkecil(String strA, 
                                  String strB) {
        if (strA.compareTo(strB) < -1)
            return strA;
        else
            return strB;
    }
}
