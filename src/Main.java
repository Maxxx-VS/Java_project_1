import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // методы
//        for (int i = 0; i < 3; i++){
//            info("Hello");
//        }

        short num = 7;
        int result1 = summa((short)5, num);

        short num2 = 17;
        int result2 = summa((short)10, num2);

    }

    public static int summa(short a, short b) {
        int res = a + b;
        String result = "Результат: " + res;
        info(result);
        return res;
    }

    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");
    }


}
