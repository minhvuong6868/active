package baitap6;

import java.util.Scanner;

public class LaiXuat {
    public static void main(String[] args) {
        float p, r, t, interest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số tiền muốn gửi: ");
        p = sc.nextFloat();
        System.out.println("Vui lòng nhập thời gian muốn gửi: ");
        t = sc.nextFloat();
        System.out.println("Vui lòng nhập số lãi suất: ");
        r = sc.nextFloat();

        interest = (p * t * r) / 100;
        System.out.println("Số tiền lãi gửi kỳ hạn " + t + " và lãi suất " + r + " là : " + interest);
        sc.close();
    }
}
