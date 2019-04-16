package Lection_2.HomeWork;
import java.util.Scanner; // Підключаємо бібліотеку вводу з клавіатури
public class HomeWork_3 {
    public static void main(String[] args) {

      // Вводимо з клавіатури номер дня тижня
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int day = in.nextInt();

        // Вираховуємо відповідний день тижня введеному номеру

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a week day");
        }
    }
}
