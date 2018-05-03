package com.nuwarobotics.app.codility.codility;

/**
 * Created by nuwa on 2018/5/3.
 */

public class OddOccurrencesInArray {
    public static final String TAG = OddOccurrencesInArray.class.getName();

    public static int solution(int[] A) {
        int result = A[0];
        for (int i = 1; i < A.length; i++) {
            result ^= A[i];
        }

        return result;
    }
}
