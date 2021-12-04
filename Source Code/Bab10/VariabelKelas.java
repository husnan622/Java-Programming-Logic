// Contoh variabel statis pada kelas

public class VariabelKelas {
    public static void main(String[] args) {
        Robot botA = new Robot("Robot Alpha");
        botA.perolehInfo();
        
        Robot botB = new Robot("Robot Beta");
        botB.perolehInfo();

        // Penghapusan objek
        System.out.println("Robot Alpha dimusnahkan");
        botB = null;
        Robot.kurangiRobot();

        // Pembuatan objek kembali
        botB = new Robot("Robot Sigma");
        botB.perolehInfo();
    }
}

class Robot {
    private static int jumlah = 0;  // Variabel statis
    private String nama;            // Variabel instan
    
    public Robot(String nama) {
        this.nama = nama;
        jumlah++;

        System.out.println("Jumlah robot = " + jumlah);
    }
     
    public void perolehInfo() {
        System.out.println("Nama: " + nama);
        System.out.println();
    }

    static public void kurangiRobot()  {
        jumlah--;
        System.out.println("Jumlah robot = " + jumlah);
        System.out.println();
    }
}


