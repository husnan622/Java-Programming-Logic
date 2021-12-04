// Contoh untuk menangani keabsahan argumen
//     argumen baris perintah

public class ArgValid {
    public static void main(String[] args) {
        int jumArgumen = args.length;
        if (jumArgumen != 2) {
            System.out.println(
                "Setelah nama ArgValid.java " +
                "harus ada dua argumen");
            return; // Akhiri eksekusi
        }

        // Proses argumen pertama
        float arg1 = 0;

        try {
            arg1 = Float.parseFloat(args[0]);
        }
        catch (NumberFormatException e) {    
            System.out.println(
                "Argumen pertama harus " + 
                "berupa bilangan real");
            return;
        }

        // Proses argumen kedua
        int arg2 = 0;

        try {
            arg2 = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e) {    
            System.out.println(
                "Argumen kedua harus berupa " + 
                "bilangan bulat");
            return;
        }

        // Tampilkan hasilnya
        for (int j = 0; j < arg2; j++)
            System.out.println(arg1);
    }
}

