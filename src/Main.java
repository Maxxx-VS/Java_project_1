import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // массивы данных
//        int [] nums = new int[5];
//        nums[0] = 45;
//        nums[1] = 46;
//        nums[2] = 47;
//        nums[3] = 48;
//        nums[4] = 49;
//
//        System.out.println(nums[0] + nums[0]);
//
//
//        float [] nums2 = new float[] {5.0f, 6.45f, 89.95f};
//        System.out.println(nums2[2]);
//
//        for (int i = 0; i < nums2.length; i++) {
//            System.out.println(nums2[i]);
//        }
        int [] arr = new int[4];
        Scanner scaner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите число: ");
            int value = scaner.nextInt();
            arr[i] = value;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);









    }



}
