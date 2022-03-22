package lesson1_3;

import java.util.Arrays;
import java.util.Random;

public class lesson1_3 {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        Random random = new Random();
        int num = random.nextInt(50);
        int [] arr = new int[num];
        for (int i = 0; i < arr.length; i++) arr[i] = random.nextInt(2);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
               if (arr[i] == 0) arr[i] = 1;
               else arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));

        // Задание 2
        System.out.println();
        System.out.println("Задание 2");
        int [] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));

        //Задание 3
        System.out.println();
        System.out.println("Задание 3");
        int [] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {arr3[i] = arr3[i] * 2;}
        }
        System.out.println(Arrays.toString(arr3));

        //Задание 4
        System.out.println();
        System.out.println("Задание 4");
        int num2 = random.nextInt(10);
        int [][] arr4 = new int [10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                };
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

    }

}
