public class RapatKiri {
    public static void main (String[] args) {
        String namaBarang = "Buku Tulis AAA 30lbr";
        int harga = 21750;

        System.out.println("| " + namaBarang + 
                           " | " + harga + " |");

        System.out.printf("| %30s | %10d |\n", 
                          namaBarang, harga);

        System.out.printf("| %-30s | %10d |\n", 
                          namaBarang, harga);
    }
}    
        