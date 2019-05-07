package lection2.homework;

public class HomeWork2 {
    public static void main(String[] args) {

        // Вираховуємо розмір масиву
        int a = 0;

        for (int i = 1; i <= 10; i++) {
            a++; // рахуємо кількість  чисел
        }
        // формуємо масив випадкових чисел
        int[] randomArr = new int[a];
        System.out.println("Розмір масиву 'randomArr' = " + a);
        for (int i = 0; i <= randomArr.length-1; i++) {

            randomArr[i] = (int) Math.ceil(Math.random() * 100); // записуємо в комірку випадкове число від 1 до 100
            System.out.print(randomArr[i] + " ");

        }
        System.out.println();
        // присвоюємо числу з непарним індексом 0
        for (int i = 0;  i <= randomArr.length-1; i++) {
            if (i % 2 == 0) {
                randomArr[i] = 0;
            }
            System.out.print(randomArr[i] + " ");

        }
    }
}
