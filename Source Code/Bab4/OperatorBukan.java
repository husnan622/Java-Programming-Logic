// Penggunaan operator !

public class OperatorBukan {
    public static void main (String[] args) {
        System.out.println("Operator !");
        System.out.println("----------");

        boolean keadaan = false;

        System.out.println("Nilai keadaan pada awal = " +
                           keadaan);

        keadaan = !keadaan;
        System.out.println("Nilai keadaan melalui " +
                           "!keadaan = " +
                           keadaan);

        keadaan = !keadaan;
        System.out.println("Nilai keadaan melalui " +
                           "!keadaan = " +
                           keadaan);
    }
}    
        