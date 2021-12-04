// Contoh untuk memperlihatkan efek hubung singkat

public class HubungSingkat {
    public static void main (String[] args) {
        System.out.println("Efek hubung singkat");
        System.out.println("-------------------");

        int x = 5, y = 0;
        boolean logika;

        logika = (x == 4) && (++y == 1);
        System.out.println("logika = " + logika);
        System.out.println("y      = " + y);

        System.out.println();

        logika = (x == 5) && (++y == 1);
        System.out.println("logika = " + logika);
        System.out.println("y      = " + y);
    }
}    
        