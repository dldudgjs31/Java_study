package com.example.Arrays;

public class Array_1 {
    public static void main(String[] args) {
        
    
        //int[] score;        // 1. 배열 score를 선언(참조변수)
        //score = new int[5]; // 2. 배열의 생성(int 저장공간 x 5)


        int[] score = new int[5]; // 배열 선언과 생성 동시에 실행
        score[3]=100; // 저장공간(요소)에 값 입력

        System.out.println("score[0] = "+ score[0]);
        System.out.println("score[1] = "+ score[1]);
        System.out.println("score[2] = "+ score[2]);
        System.out.println("score[3] = "+ score[3]);
        System.out.println("score[4] = "+ score[4]);
        /*
            score[0] = 0
            score[1] = 0
            score[2] = 0
            score[3] = 100
            score[4] = 0
         */
        int value = score[3];
        System.out.println(value); //100
        }
}
