// Penyisipan string

import java.util.Scanner;

public class PenyisipanString {
    public static void main (String[] args) {
        System.out.println("Penyisipan string");
        System.out.println("-----------------");

        String st = "";
        String stSisip = "";
        int n;

        Scanner kbd = new Scanner(System.in);

        System.out.print("String asal: ");
        st = kbd.nextLine();

        System.out.print("String yang disisipkan: ");
        stSisip = kbd.nextLine();

        System.out.print("Indeks penyisipan: ");
        n = kbd.nextInt();

        if (n >= 0 && n <= st.length()) {
            // Bentuk string yang disisipi dengan strSisip
            st = st.substring(0, n) + stSisip +  
                 st.substring(n);
            System.out.println(
                "String asal berubah menjadi: " + st);

        }
        else
            System.out.println("Indeks tidak valid");
    }
}    
        