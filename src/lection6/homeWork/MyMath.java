package lection6.homeWork;


public class MyMath {

    // Створюємо статичні методи

    public static String first() {
        return "Hi, friend";
    }

    public static int second(int a, int b) {
        int i = a * b;
        return i;
    }

    public static int third() {
        return 4 + 6;
    }

    // Створюємо константи

    final static String TEXT = "Name";
    final static int AGE = 20;
    final static double WEIGHT = 67.6;

    public static void main(String[] args) {

        // Виводимо статичні методи

        System.out.println("Статичні методи");
        System.out.println();
        System.out.println(second(5, 6));
        System.out.println(first());
        System.out.println(third());

        // Виводимо константи

        System.out.println();
        System.out.println("Константи");
        System.out.println();
        System.out.println(TEXT);
        System.out.println(AGE);
        System.out.println(WEIGHT);

    }

}
