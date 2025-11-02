package bimbingan_kakmudi;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char b = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        int c = input.nextInt();

        int hasil;

        if (b == '+') {
            hasil = a + c;
            System.out.println("Hasil: " + hasil);
        } else if (b == '-') {
            hasil = a - c;
            System.out.println("Hasil: " + hasil);
        } else if (b == '*') {
            hasil = a * c;
            System.out.println("Hasil: " + hasil);
        } else if (b == '/') {
            hasil = a / c;
            System.out.println("Hasil: " + hasil);
        } else {
            System.out.println("Operator tidak dikenal.");
        }

    }

}
