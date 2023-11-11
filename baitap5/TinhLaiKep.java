package baitap5;

public class TinhLaiKep {

    public void interest(long p, double r, int t, int n) {
        double totalInRest = p * Math.pow(1 + r / n, n * t);
        double rest = totalInRest - p;
        System.out.println("Số tiền lãi gửi kỳ hạn " + t + " là : " + rest);
        System.out.println("Tổng số tiền nhận được sau kỳ hạn " + t + " là : " + totalInRest);

    }

    public static void main(String[] args) {
        TinhLaiKep obj = new TinhLaiKep();
        obj.interest(2000, 0.08, 5, 12);
    }
}
