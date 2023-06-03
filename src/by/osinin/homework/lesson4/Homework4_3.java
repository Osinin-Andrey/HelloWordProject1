package by.osinin.homework.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        Random random = new Random();
        for (int i=0; i<arr.length;i++){
            arr[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int min = arr[0];
        float avg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];

            int sum = 0;
            for (float val : arr) {
                sum += val;
            }
                avg = (float)sum / size;

        }
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        System.out.println("avg:" + avg);





    }

}
