package by.osinin.homework.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Classwork {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        int[] arr2 = new int[10];
        System.out.println("Third element:" + arr[2]);
        System.out.println("Third element:" + arr2[2]);
        //arr2[2] = 10;
        System.out.println("Third element:" + arr2[2]);
        System.out.println("Arr lenght:" + arr.length);
        Random random = new Random();

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(10);
            System.out.println("arr2[" + i + "]=" + arr2[i]);

        }
        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;
            //System.out.println("arr3[" + i + "]=" + arr3[i]);
        }
        //System.out.println(Arrays.toString(arr3));
        //выведен массив
        //System.out.println(arr3);
        //не правильно выведен массив

        int sum = 0;
        for (int val : arr3) {
            sum += val;
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println(sum);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        int result = -1;
        //допустим arr2[0] = 3;
        //result <arr2[0] - значит result = arr2[0]
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(10);
            if (result < arr2[i]) {
                result = arr2[i];
                System.out.println("Итог:" + result);
            }
        }

        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(3);
            if (arr2[i] == 2) {
                count = count + 1;
                System.out.println("Число:" + count);
            }
        }
        System.out.println(Arrays.toString(arr2));
    }


}

