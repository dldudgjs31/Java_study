package com.example.Arrays;

import java.util.Arrays;

public class Array_String1 {
    public static void main(String[] args) {
        String[] strArr = {"가위","바위","보"};
        System.out.println(Arrays.toString(strArr));

        for(int i=0;i<10;i++){
            // random() => 0~0.9 까지의 난수 생성
            int tmp = (int)(Math.random()*3);
            System.out.println(strArr[tmp]);
        }
    }
}
