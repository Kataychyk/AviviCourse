package lection4.homework.triangle;

public class Triangle {

    int length;
    int width;


    Triangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    Triangle() {
        length = 10;
        width = 10;
    }

    int square() {
        return length * width;
    }

    public void setPerimeter() {
        System.out.println("Периметр прямокутника = " + (length + width) * 2);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(30, 10);
        Triangle triangle1 = new Triangle();
        triangle.setPerimeter();
        System.out.println("Площа прямокутника = " + triangle.square() + " \n");
        System.out.println("Другий конструктор \n");
        System.out.println("Площа прямокутника = " + triangle1.square());
        triangle1.setPerimeter();
    }
}
