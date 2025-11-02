
package bimbingan_kakmudi;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Buat tabel perkalian sampai: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + "x" + j + " = " + (i*j) + " \t" );
            }
            System.out.println();
                
            
        }
    }
    
}
