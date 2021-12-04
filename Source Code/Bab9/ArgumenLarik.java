// Contoh argumen berupa larik

public class ArgumenLarik {
    public static void main(String[] args) {
        String daftarPeserta[] = {
            "Rika Devi", "Dandi Wardoyo", "Tara Ranata",
            "Fiska Amelia", "Fahmi Ariyanto"
        };

        tampilkan(daftarPeserta);
    }

    public static void tampilkan(String peserta[]) {
        for (int j = 0; j < peserta.length; j++)
            System.out.println((j + 1) + ". " + 
                               peserta[j]);
    }
}
