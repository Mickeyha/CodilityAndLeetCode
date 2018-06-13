package com.nuwarobotics.app.codility.codility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**

 Write a program to check whether a given number is an ugly number.

 Ugly numbers are positive numbers whose prime factors only include 2, 3.

 */
public class Exam2P3Q {
    public static int solution(int N) {
        int x, y = 0;
        List<Integer> uglyArray = new ArrayList<>();
        int currentNum = 1;

        while(uglyArray.size() <= 201) {
            if(isUglyNumber(currentNum)){
                uglyArray.add(currentNum);
            }
            currentNum++;
        }
        return uglyArray.get(N);
    }

    private static boolean isUglyNumber(int num) {
        int[] factors = new int[]{2,3};
        for (int i = 0; i < factors.length; i++) {
            while(num % factors[i] == 0) {
                num = num/factors[i];
            }
        }
        return num == 1;
    }
}
