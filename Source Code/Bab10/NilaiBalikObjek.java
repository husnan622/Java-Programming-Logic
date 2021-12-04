// Contoh objek sebagai nilai balik

public class NilaiBalikObjek {
    public static void main(String[] args) {
        Buah buah = new Buah("Jeruk");
        buah.perolehInfo();

        buah = buatObjekBuah("Pisang");
        buah.perolehInfo();
    }

    // Metode dengan nilai balik berupa objek
    public static Buah buatObjekBuah(String nama) {
        Buah x = new Buah(nama);
        return x;
    }
}

class Buah {
    private String nama;
    
    public Buah(String nama) {
        this.nama = nama;
    }
     
    public void perolehInfo() {
        System.out.println("Nama: " + nama);
    }
}


