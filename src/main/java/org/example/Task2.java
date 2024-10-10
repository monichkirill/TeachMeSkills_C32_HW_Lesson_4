package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for(int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 100.0 + 1.0);
        }

        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            if (number > max)
                max = number;
            if (number < min)
                min = number;
            sum += number;
        }

        int average = sum / size;
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}

