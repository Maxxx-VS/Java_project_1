import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // условные консрукции
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num_1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num_2 = scanner.nextInt();

        System.out.print("Введите опрератор: ");
        String oper = scanner.nextLine();
        oper = scanner.nextLine();

        int result;

        switch (oper) {
            case "+":
                result = num_1 + num_2;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = num_1 - num_2;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = num_1 * num_2;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if (num_2 == 0) {
                    System.out.println("Деление на 0!");
                } else {
                    result = num_1 / num_2;
                    System.out.println("Результат: " + result);
                }
                break;
            default:
                System.out.println("Проверь ввод");
        }









    }



}
