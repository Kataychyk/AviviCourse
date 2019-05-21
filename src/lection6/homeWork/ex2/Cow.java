package lection6.homeWork.ex2;

public class Cow extends Pet {
    @Override
    public void voice(){ // перевизначаємо метод
        System.out.println("Mooo");
    }

    public static void main(String[] args) {
        Cow cow = new Cow(); // корова каже
        cow.voice();
    }
}