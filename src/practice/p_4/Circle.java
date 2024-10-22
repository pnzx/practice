package practice.p_4;

public class Circle {
    int radius;
    String name;

    public Circle() {
        radius = 1;
        name = "";
    }

    public Circle(int r, String n) {
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");
        double area = pizza.getArea();
        System.out.printf("%s의 면적은 %f\n", pizza.name, area);

        Circle dount = new Circle();
        dount.name = "도넛피자";
        area = dount.getArea();
        System.out.printf("%s의 면적은 %f", dount.name, area);
    }
}
