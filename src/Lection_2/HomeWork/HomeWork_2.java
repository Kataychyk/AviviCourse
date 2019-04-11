package Lection_2.HomeWork;

public class HomeWork_2 {
    public static void main(String[] args) {

        // Вираховуємо розмір масиву
        int a = 0;

        for (int i = 1; i < 10; i++) {
            a++; // рахуємо кількість  чисел
        }
        // формуємо масив випадкових чисел
        int[] randomArr = new int[a];
        System.out.println("Розмір масиву 'randomArr' = " + a);
        for (int i = 1, z = 0; i <= randomArr.length; i++) {

            randomArr[z] = (int) Math.ceil(Math.random() * 100); // записуємо в комірку випадкове число від 1 до 100
            System.out.print(randomArr[z] + " ");
            z++;
        }
        System.out.println();
        // присвоюємо числу з непарним індексом 0
        for (int i = 1, z = 0; i <= randomArr.length; i++) {
            if (i % 2 != 0) {
                randomArr[z] = 0;
            }
            System.out.print(randomArr[z] + " ");
            z++;
        }
    }
}
