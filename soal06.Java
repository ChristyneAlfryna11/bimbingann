
package bimbingan_kakmudi;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("memasukkan sebuah angka antara 1 dan 100: ");
        int a = input.nextInt();
        
        if (a >= 1 && a <= 100) {
            System.out.println("Terima kasih! Angka yang Anda masukkan adalah " + a + ".");
        }else{
            System.out.println("Input tidak valid. Coba lagi.");
        }
    }
    
}
