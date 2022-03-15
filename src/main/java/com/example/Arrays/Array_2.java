package com.example.Arrays;
/**
 * 배열의 길이
 */
public class Array_2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("arr.length = " + arr.length); // 5

        for(int i=0;i<arr.length;i++){
            System.out.println("arr[" + i+ "] = "+ arr[i]);
            /**
            arr[0] = 0
            arr[1] = 0
            arr[2] = 0
            arr[3] = 0
            arr[4] = 0
             */
        }

    }
}
