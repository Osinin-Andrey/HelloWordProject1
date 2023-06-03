package by.osinin.homework.lesson5;

import java.util.Arrays;
import java.util.Random;

public class classwork5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[][] arr2 = new int[10][10];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = i * j;
            }
        }
        System.out.println(Arrays.deepToString(arr2));

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(" arr[i][j]= " + arr2[i][j]);
            }
            System.out.println();
        }
// лестница 2 фото
        int[][] arr3 = new int[4][];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i + 1];
            Arrays.fill(arr3[i], i + 1);
//            заполнение массива Arrays.fill(arr3[i], i + 1);

        }

        System.out.println(Arrays.deepToString(arr3));

        int[][] arr4 = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(arr4));
//        System.out.println(Arrays.deepToString(arr4)); - вывод двух массивов


        int[] arr5 = new int[10];
        int[] newArr = new int[10];
        arr5[9] = 1;
//        System.out.println(Arrays.equals(arr5, newArr));
        //Arrays.equals(arr5, newArr)); - сравнение двух массивов
        System.out.println(Arrays.compare(arr5, newArr));
        // System.out.println(Arrays.compare(arr5, newArr)); - для сортировки


        int[][][] superArr = new int[11][11][11];
        for (int i = 0; i < superArr.length; i++) {
            for (int j = 0; j < superArr[i].length; j++) {
                for (int k = 0; k < superArr[i][j].length; k++) {
                    System.out.println("arr[" + i + "][" + j + "][" + k + "]=" + superArr[i][j][k]);
                }
            }
        }
        System.out.println();

        int[][] arr6 = new int[3][3];
        int[][] arr7 = new int[3][3];
        int[][] result = new int[3][3];
        Random random2 = new Random();

        //result [0][0] = arr6[0][0]*arr7[0][0];
        //result [1][2] = arr6[1][2]*arr7[1][2];

        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < arr6[i].length; j++) {
                arr6[i][j] = random2.nextInt(5);
                arr7[i][j] = random2.nextInt(5);
                result[i][j] = arr6[i][j] * arr7[i][j];
            }

        }
        System.out.println(Arrays.deepToString(result));


    }


}




