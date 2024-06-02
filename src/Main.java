import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // коллекции
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 45);

        // System.out.println(numbers.size());
       // System.out.println(numbers.get(1));
        numbers.remove(1);
        numbers.clear();


        for(Integer el : numbers) {
            System.out.println(el);
        }











    }



}
