package baitap4;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class CongHaiSo {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        int num1 = 2, num2 = 5, num3 = 2;
        int num = num1 - num2 + num3 * (num2 + num3);
        System.err.println("Tổng bằng: " + num);
    }
}
