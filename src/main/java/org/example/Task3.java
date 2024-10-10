package org.example;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 3, 15, 25, 3};
        int[] array2 = new int[]{4, 5, 16, 9, 11};

        System.out.println("First array: " + Arrays.toString(array1));
        System.out.println("Second array: " + Arrays.toString(array2));

        int sum1 = 0;
        int sum2 = 0;

        for (int i : array1)
            sum1 += i;

        for (int i : array2)
            sum2 += i;

        double average1 = (double)sum1 / (double)array1.length;
        double average2 = (double)sum2 / (double)array2.length;

        if (average1 > average2) {
            System.out.println("The average value of the first array is greater");
        } else if (average1 < average2) {
            System.out.println("The average value of the second array is greater");
        } else {
            System.out.println("The average value of two arrays is equal");
        }

    }
}

