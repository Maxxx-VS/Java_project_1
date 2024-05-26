import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // условные консрукции
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите роль: ");
//        String role = scanner.nextLine();
//        System.out.println("Введите пароль: ");
//        String pass = scanner.nextLine();
//        if (role.equals("Admin") && pass.equals("123")) {
//            System.out.println("Полные права");
//        } else {
//            System.out.println("Как тебя зовут?");
//            System.out.println("Введите свое имя: ");
//            String name = scanner.nextLine();
//        }
        System.out.print("Число: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("num = 1");
                break;
            case 2:
                System.out.println("num = 2");
                break;
            default:
                System.out.println("Нет совпадений");

        }










    }



}
