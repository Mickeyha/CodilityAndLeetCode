package com.nuwarobotics.app.codility.codility;

import android.util.Log;

import java.util.Arrays;

/**
 * Created by nuwa on 2018/5/4.
 */

public class FrogRiverOne {
    public static final String TAG = FrogRiverOne.class.getName();

    public static int solution(int X, int[] A) {
        if(A.length < X) return -1;

        int numNeeded = X;

        int[] B = new int[X+1];
        Arrays.fill(B,0);

        for (int i = 0; i < A.length; i++) {
            if(B[A[i]] == 0) {
               Log.d(TAG, "solution: A[" + i + "]\t" + A[i] );
               B[A[i]] = 1;
               numNeeded -= 1;
            }
            if(numNeeded == 0) return i;
        }
        return -1;
    }
}
