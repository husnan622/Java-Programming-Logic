// Penentuan nama hari
//    menggunakan switch

import java.util.Scanner;

public class Hari2 {
    public static void main (String[] args) {
        System.out.println("Penentuan nama hari");
        System.out.println(" 0 = Minggu    1 = Senin");
        System.out.println(" 2 = Selasa    3 = Rabu");
        System.out.println(" 4 = Kamis     5 = Jumat");
        System.out.println(" 6 = Sabtu");

        System.out.println("------------------------");

        int kodeHari;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Kode hari = ");
        kodeHari = kbd.nextInt();

        // Penentuan nama hari
        String info;

        switch (kodeHari) {
            case 0:
                info = "Minggu";
                break;
            case 1:
                info = "Senin";
                break;  
            case 2:
                info = "Selasa";
                break;
            case 3:
                info = "Rabu";
                break;
            case 4:
                info = "Kamis";
                break;
             case 5:
                info = "Jumat";
                break;
            case 6:
                info = "Sabtu";
                break;
            default:
                info = "Kode salah";
        }

        System.out.println(info); 
    }
}    
        