// Metode untuk menentukan bilangan
//     termasuk bilangan prima atau tidak

public class MetodeBilPrima {
    public static void main(String[] args) {
        ujiBilanganPrima(3);
        ujiBilanganPrima(7);
        ujiBilanganPrima(9);
        ujiBilanganPrima(11);
    }

    public static boolean prima(int bilX) {
        boolean prima = true;
        for (int bil = 2; bil <= bilX / 2; bil++)
            if (bilX % bil == 0) {
                prima = false;
                break;
            }

        return prima;
    }

    public static void ujiBilanganPrima(int bilX) {
        if (prima(bilX))
            System.out.println(bilX + 
                               " adalah bilangan prima");
        else
            System.out.println(bilX + 
                               " bukan bilangan prima");
    }
}
