import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // циклы for, while, do-while
//        for (float i = 100; i > 10; i-=12) {
//            System.out.println("Цикл: " + i);
//        }
//
//        int i = 0;
//        while (i <= 100) {
//            System.out.println("Цикл: " + i);
//            i++;
//        }
//
//        int i = 1;
//        do {
//            System.out.println("Цикл: " + i);
//            i ++;
//        } while (i < 10);

        for (int i = 5; i < 25; i+=2) {
            if (i % 2 == 0){
                continue;
            }
            System.out.println("Элемент: " + i);
        }









    }



}
