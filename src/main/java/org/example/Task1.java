package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 10, 15, 18, 20};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int enteredNumber = scanner.nextInt();

        int count = 0;

        for (int i : arr) {
            if (i == enteredNumber) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Number " + enteredNumber + " not found in array");
        } else {
            int[] newArr = new int[arr.length - count];
            int index = 0;

            for (int i : arr) {
                if (i != enteredNumber) {
                    newArr[index++] = i;
                }
            }
            System.out.println("New array: " + Arrays.toString(newArr));
        }

    }
}

