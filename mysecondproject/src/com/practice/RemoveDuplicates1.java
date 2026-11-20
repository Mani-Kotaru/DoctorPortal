package com.practice;

import java.util.Arrays;

public class RemoveDuplicates1 {

    public static void main(String[] args) {

        int arr[] = {10, 10, 10, 30, 40, 50};

        System.out.println("Original array: " + Arrays.toString(arr));

        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < k; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                arr[k++] = arr[i];
               
            }
        }

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}