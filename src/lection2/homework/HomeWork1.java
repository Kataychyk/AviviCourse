package lection2.homework;

public class HomeWork1 {
    public static void main(String[] args) {

        // Вираховуємо розмір масиву в який будемо записувати непарні числа
        int a = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) a++; // рахуємо кількість непарних чисел
        }
        System.out.println();
        // Записуємо числа в масив
        int[] array = new int[a];
        for (int i = 1, z = 0; i <= 99; i++) {
            if (i % 2 != 0) {  // якщо число не парне воно записується в масив
                array[z] = i;
                z++;
            }
        }
        System.out.println();
        for (int  x = array.length - 1; x >=0;   x--) {
            System.out.print(array[x] + " ");
        }
    }
}

