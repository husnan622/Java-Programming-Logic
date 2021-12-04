// Penentuan nama hari

import java.util.Scanner;

public class Hari {
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

        if (kodeHari == 0)
            info = "Minggu";
        else
            if (kodeHari == 1)
                info = "Senin";
            else
                if (kodeHari == 2)
                    info = "Selasa";
                else
                    if (kodeHari == 3)
                        info = "Rabu";
                    else
                        if (kodeHari == 4)
                            info = "Kamis";
                        else
                            if (kodeHari == 5)
                                info = "Jumat";
                            else
                                if (kodeHari == 6)
                                    info = "Sabtu";
                                else
                                    info = "Kode salah";

        System.out.println(info); 
    }
}    
        