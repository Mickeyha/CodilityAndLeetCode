package com.nuwarobotics.app.codility.codility;

import android.util.Log;

import java.util.Arrays;

/**
 * Created by nuwa on 2018/5/4.
 */

public class MaxCounters {
    public static final String TAG = MaxCounters.class.getName();

    public static int[] solution(int N, int[] A) {

        int counter[] = new int[N];   //counter0 ~ counterN-1
        Arrays.fill(counter,0);
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] != N+1) {
                counter[A[i]-1]++;
                max = Math.max(max, counter[A[i]-1]);
            } else {
                Arrays.fill(counter, max);
            }
        }

        for (int i = 0; i < counter.length ; i++) {
            Log.d(TAG, "solution: counter[" + i + "]\t" + counter[i]);
        }
        return counter;
    }
}
