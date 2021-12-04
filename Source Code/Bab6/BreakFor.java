// Contoh untuk menunjukkan efek break
//     pada for

public class BreakFor {
    public static void main (String[] args) {
        for (int bilangan = 1; bilangan <= 8; bilangan++) {
            if (bilangan == 5)
                break;

            System.out.println(bilangan);
        }
    }
}    
        