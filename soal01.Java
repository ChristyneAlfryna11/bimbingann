package bimbingan_kakmudi;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - Genap");
            }else{
            System.out.println(i + " - Ganjil");
                
            }
        }
      
    }
    
}
