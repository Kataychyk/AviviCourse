package lection6.homeWork.ex2;

public class Cat extends Pet {
    @Override
    public void voice(){
        System.out.println("Мяу Мяу");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
    }
}
