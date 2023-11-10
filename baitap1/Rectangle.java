package baitap1;

public class Rectangle {
    // thuộc tính
    private double length;
    private double width;

    // ham tạo không tham số
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Hàm tạo có 2 tham số
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // getter và setter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // phương thức tính diện tích hình chữ nhật
    public double area() {
        return length * width;
    }

    // phương thức tính chu vi
    public double peri() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Diện tích: " + rectangle1.area());
        System.out.println("Chu vi: " + rectangle1.peri());

        Rectangle rectangle2 = new Rectangle(5, 10);
        System.out.println("Diện tích: " + rectangle2.area());
        System.out.println("Chu vi: " + rectangle2.peri());
    }
}
