package com.practice;
import java.util.Arrays;

public class ReverseObjectArray1 {
    public static void main(String[] args) {

        Object[] arr = {
            70,
            new Object[]{30, 40, 60},
            50,
            new Object[]{20, 40, 50},
            60
        };

        // Reverse nested arrays
        for (Object obj : arr) {
            if (obj instanceof Object[]) {
                Object[] inner = (Object[]) obj;

                for (int i = 0; i < inner.length / 2; i++) {
                    Object temp = inner[i];
                    inner[i] = inner[inner.length - 1 - i];
                    inner[inner.length - 1 - i] = temp;
                }
            }
        }

        // Reverse main array
        for (int i = 0; i < arr.length / 2; i++) {
            Object temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.deepToString(arr));
    }
}