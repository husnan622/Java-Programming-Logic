// Contoh penyajian larik secara terbalik

public class Pembalikan {
    public static void main (String[] args) {
        int[] data = {
            7, 8, 9, 1, 4, 0, 3, 5, 2, 6
        };

        int jumData = data.length;
        for (int indeks = 0; indeks < jumData;
             indeks++)
            System.out.print(data[jumData - indeks - 1] + 
                             " ");

        System.out.println();
    }
}    
        