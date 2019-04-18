package lection4;

public class Shapes {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(11, 22);
      rectangle.square = 10;
        System.out.println((rectangle.height + rectangle.width) * 2);
        Rectangle box = rectangle;
      //  box.height = 7;
        System.out.println((rectangle.height + rectangle.width) * 2);
        box = null;

    }
}
