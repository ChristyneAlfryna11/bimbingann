
package bimbingan_kakmudi;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah kata: ");
        String kata = input.nextLine();
        String balik = "";
        for (int i = kata.length() -1; i >= 0; i--) {
            balik += kata.charAt(i);
        }
        System.out.println("Hasil terbalik: " + balik);
    }
    
}
