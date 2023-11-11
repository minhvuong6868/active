package baitap7;

import java.util.Scanner;

public class TínhNguyenDu {
    public static void main(String[] args) {
        int phannguyen, phandu;

        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số thứ nhất: ");
        int s1 = sc.nextInt();
        System.out.println("Vui lòng nhập số thứ 2: ");
        int s2 = sc.nextInt();
        phannguyen = s1 / s2;
        phandu = s1 % s2;
        sc.close();
        System.out.println("Phần nguyên: " + phannguyen);
        System.out.println("Phần dư: " + phandu);

    }
}
