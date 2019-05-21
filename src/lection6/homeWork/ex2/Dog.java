package lection6.homeWork.ex2;

public class Dog extends Pet {
    @Override
    public void voice(){  // перевизначаємо метод
        System.out.println("Bark Bark Bark");
    }

    public static void main(String[] args) {
        Dog dog = new Dog(); // Пес каже
        dog.voice();
    }
}