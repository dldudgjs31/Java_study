package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "배열 Arrays 클래스" );
        
        int[] arr = {0,1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        //[0, 1, 2, 3, 4, 5]

        int[][] arr2D = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(arr2D));
        //[[1, 2], [3, 4]]

        String[][] arrString1= new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] arrString2= new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        //1차원 배열비교
        System.out.println(Arrays.equals(arrString1, arrString2)); // false
        //다차원 배열비교
        System.out.println(Arrays.deepEquals(arrString1, arrString2)); // true
        //=> 등가비교 == 연산자로는 비교 불가능!


        //배열 복사 copyOf copyOfRange
        //copyOf(복사할배열,복사할 배열의 요소수)
        int[] copyArr = {0,1,2,3,4,5};
        int[] copy1 = Arrays.copyOf(copyArr,copyArr.length); //[0, 1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(copy1));
        int[] copy2 = Arrays.copyOf(copyArr, 3); //  [0, 1, 2]
        System.out.println(Arrays.toString(copy2));
        int[] copy3 = Arrays.copyOf(copyArr, 7); //  [0, 1, 2, 3, 4, 5, 0] // 값이 없는 인덱스는 0으로 초기화
        System.out.println(Arrays.toString(copy3));
        int[] copy4 = Arrays.copyOfRange(copyArr, 2,5); // [2,3,4]
        System.out.println(Arrays.toString(copy4));        

        //배열 정렬 sort()
        int[] sortarr = {1,3,0,2,4,5}; 
        Arrays.sort(sortarr); 
        System.out.println(Arrays.toString(sortarr));
             
    }
}
