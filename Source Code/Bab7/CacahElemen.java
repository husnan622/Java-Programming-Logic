// Contoh penggunaan length

public class CacahElemen {
    public static void main (String[] args) {
        System.out.println("Contoh length()");
        System.out.println("---------------");

        int[] bilangan = {1, 2, 5, 3};
        int[] data = {50, 77, 30, 1, 22};

        // Cacah elemen pada larik bilangan dan data
        System.out.println("cacah larik bilangan = " +
                           bilangan.length);
        System.out.println("cacah larik data = " +
                           data.length);

        // Penyajian data melalui length
        System.out.println();

        System.out.println("Data pada larik data:" );
        for (int indeks = 0; indeks < data.length; 
             indeks++)
            System.out.println(data[indeks]);
    }
}    
        