package bimbingan_kakmudi;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah bilangan: ");
        int a = input.nextInt();
        boolean prima = true;
        
        if (a <= 1) {
            prima = false;
        }else{
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    prima = false;
                    break;
                }
            }
            }
        if (prima) {
            System.out.println(a + " adalah bilangan prima.");
        }else{
         System.out.println(a + " bukan bilangan prima.");   
            
        }
    }
                    
                
        
            
    
}
