// Daftar stok yang kosong

public class StokNol {
    public static void main (String[] args) {
        String kodeBarang[] = {
            "TV-001", "TV-002", "TV-003",
            "RD-001", "RD-002",
            "CD-001", "CD-002", "CD-003", "CD-004"
        };

        int jumStok[] = {
            0, 5, 12, 3, 0, 8, 0, 5, 7
        };

        System.out.println("Daftar stok kosong:");

        for (int indeks = 0; indeks < jumStok.length; 
             indeks++) 
            if (jumStok[indeks] == 0) 
                System.out.println(kodeBarang[indeks]);
    }
}    
        