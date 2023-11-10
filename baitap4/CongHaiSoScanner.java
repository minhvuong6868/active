package baitap4;

import java.util.Scanner;

public class CongHaiSoScanner {
    public static void main(String[] args) {
        long num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        num1 = sc.nextLong();
        System.out.println("Nhập vào số thứ hai: ");
        num2 = sc.nextLong();

        sc.close();
        sum = num1 + num2;

        System.out.println("Tổng bằng: " + sum);
    }

}
