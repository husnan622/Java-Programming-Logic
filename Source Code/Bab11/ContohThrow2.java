// Contoh throw versi 2

public class ContohThrow2 {
    public static void main(String[] args) {
        try {
            int n = -6;
            int hasil = faktorial(n);
            System.out.println(n + "! = " + hasil);
        }
        catch (Exception e) {
            System.out.println("Terjadi eksepsi di main()");
            System.out.println("Pesan: " +
                               e.getMessage());
        }
    }

    public static int faktorial(int n) throws Exception {
        int hasil = 0;

        try {
            if (n < 0)
                throw new Exception(
                    "Argumen faktorial() " +
                    "harus berupa bilangan positif");
                        
            // Hitung faktorial
            hasil = 1;
            for (int bil = 1; bil <= n; bil++)
               hasil = hasil * bil;
        }
        catch (Exception e) {
            System.out.println(
                "Terjadi eksepsi di faktorial()");
            System.out.println("Pesan: " +
                               e.getMessage());
            
            throw e; // Pelontaran eksepsi kembali
        }   

        return hasil;
    }
}

