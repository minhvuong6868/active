package baitap2;

public class Equation {
    // thuộc tính
    private double a;
    private double b;
    private double c;

    // hàm tạo không tham số
    public Equation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    // Hàm tạo có 3 tham số

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter và setter
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB() {
        // this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // phương thức tính delta
    public double delta() {
        return b * b - 4 * a * c;
    }

    // phương thức tính nghiệm phương trình
    public String Roots() {
        double delta = delta();

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Phương trình có hai nghiệm phân biệt: x1 = " + root1 + ", x2 = " + root2;
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return "Phương trình có một nghiệm kép: x = " + root;
        } else {
            return "Phương trình không có nghiệm thực.";
        }
    }

    public static void main(String[] args) {
        Equation equation1 = new Equation(1, -3, 2);
        System.out.println("Delta: " + equation1.delta());
        System.out.println(equation1.Roots());

        Equation equation2 = new Equation(1, 2, 1);
        System.out.println("Delta: " + equation2.delta());
        System.out.println(equation2.Roots());
    }
}
