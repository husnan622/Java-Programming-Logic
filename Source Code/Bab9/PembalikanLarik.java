// Metode untuk membalik urutan data pada larik

public class PembalikanLarik {
    public static void main(String[] args) {
        int daftarBil[] = {
            10, 20, 30, 40, 50, 60, 70, 80, 90
        };

        System.out.println("Sebelum dibalik: ");
        tampilkanLarik(daftarBil);

        balikLarik(daftarBil);

        System.out.println();
        System.out.println("Setelah dibalik: ");
        tampilkanLarik(daftarBil);
    }

    public static void tampilkanLarik(int data[]) {
        for (int j = 0; j < data.length; j++)
            System.out.print(data[j] + " ");

        System.out.println();
    }

    public static void balikLarik(int data[]) {
        int sementara;
        int jum = data.length;

        for (int j = 0; j <= (jum - 1) / 2; j++) {
            sementara = data[j];
            data[j] = data[jum - 1 - j];
            data[jum - 1 - j] = sementara;
        }
    }
}
