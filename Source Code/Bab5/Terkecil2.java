// Validasi pemasukan data

import java.util.Scanner;

public class Validasi {
    public static void main (String[] args) {
        cout << "Validasi pemasukan data" << endl;
        cout << "-----------------------" << endl;

        int bilangan;

        cout << "Bilangan bulat = ";
        cin >> bilangan;

    if (!cin)
        cout << "Anda tidak memasukkan bilangan bulat"
             << endl;
    else
        cout << "Trims. Anda telah memasukkan bilangan bulat"
             << endl;

    }
}    
        