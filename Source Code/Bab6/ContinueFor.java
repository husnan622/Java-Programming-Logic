// Contoh untuk menunjukkan efek break
//     pada for

public class ContinueFor {
    public static void main (String[] args) {
        for (int bilangan = 1; bilangan <= 8; bilangan++) {
            if (bilangan == 5) {
                System.out.println("continue");
                continue;
            }

            System.out.println(bilangan);
        }
    }
}    
        