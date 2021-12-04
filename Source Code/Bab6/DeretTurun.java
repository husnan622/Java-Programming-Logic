// Penyajian angka 5 hingga 1
//    menggunakan do..while

public class DeretTurun {
    public static void main (String[] args) {
        int bilangan;

        bilangan = 5;
        do {
            System.out.println(bilangan);

            bilangan = bilangan - 1;
        } while (bilangan >= 1);
    }
}    
        