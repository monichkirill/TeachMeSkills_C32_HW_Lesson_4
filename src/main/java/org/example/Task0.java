package org.example;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 9, 14, 241, 15, 17, 22, 30};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int enteredNumber = scanner.nextInt();

        boolean flag = false;

        for (int i : arr) {
            if (i == enteredNumber) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Number " + enteredNumber + " is contained in array");
        } else {
            System.out.println("Number " + enteredNumber + " is not contained in array");
        }

    }
}
