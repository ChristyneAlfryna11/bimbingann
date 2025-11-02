
package bimbingan_kakmudi;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah kalimat: ");
        String a = input.nextLine();
        
        int jumlah = 0;
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (b == 'a' || b == 'i' || b == 'u' || b == 'e' || b == 'o') {
                jumlah++;    
        }
            }
        System.out.println("Jumlah huruf vokal adalah: " + jumlah);
            
    }
    
}
