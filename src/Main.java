import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // методы
        byte[] nums1 = new byte[] {5, 6, 8};
        byte[] nums2 = new byte[] {15, 16, 18};

        int summ1 = summsArray(nums1);
        System.out.println(summ1);


        int summ2 = summsArray(nums2);
        System.out.println(summ2);


        }

        public static int summsArray(byte[] arr) {
            int summa = 0;
            for (byte i = 0; i < arr.length ; i++) {
                summa += arr[i];
            }
            return summa;
        }

}

