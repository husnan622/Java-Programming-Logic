// Contoh metode dengan parameter bersifat variabel
//     dan menetap

public class LebihDariAmbang {
    public static void main(String[] args) {
        lebihDariAmbang(50, 1, 67, 3, 55, 66);
        lebihDariAmbang(50, 1, 67, 3, 55, 66, 52);
        lebihDariAmbang(50, 1, 47, 3);
        lebihDariAmbang(50);
    }

    public static void lebihDariAmbang(int ambang, 
                                       int ... args) {
        int jumParam = args.length;
        int hasil[] = new int[jumParam];
        int jumHasil = 0;

        for (int j = 0; j < jumParam; j++) 
            if (args[j] > ambang) {
                hasil[jumHasil] = args[j];
                jumHasil++;        
            }

        if (jumHasil == 0)
            System.out.println("Tidak ada");
        else {
            for (int j = 0; j < jumHasil; j++)
                System.out.print(hasil[j] + " ");
            
            System.out.println(); // Pindah baris    
        }
    }
}
