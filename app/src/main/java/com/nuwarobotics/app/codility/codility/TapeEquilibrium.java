package com.nuwarobotics.app.codility.codility;

/**
 * Created by Mikihaha on 2018/5/3.
 */

public class TapeEquilibrium {

    public static int solution(int[] A) {
        long sum = 0;
        long front = 0;
        long tail = 0;

        if(A.length == 2) return Math.abs(A[0] - A[1]);

        long result = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        tail = sum;

        for (int i = 0; i < A.length-1; i++) {
            front += A[i];
            tail =  sum - front;
            result = Math.min(result, Math.abs(front-tail));
        }
        return (int)result;
    }
}
