
package bimbingan_kakmudi;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tinggi pola: ");
        int a = input.nextInt();
        
        for (int i = a; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);   
            }
            System.out.println();
        }
    }
    
}
