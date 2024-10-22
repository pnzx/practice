package practice.p_4;

public class p_4_1 {
    int radius;
    String name;

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        p_4_1 pizza;
        pizza = new p_4_1();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.printf("%s의 면적은 %f \n", pizza.name, area);

        p_4_1 donut = new p_4_1();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.printf("%s의 면적은 %f \n", donut.name, area);
    }

}
