package com.nuwarobotics.app.codility.codility;

import android.util.Log;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by nuwa on 2018/5/4.
 */

public class MissingInteger {
    public static final String TAG = MissingInteger.class.getName();

    public static int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        int min = 1;

        for (int i = 0; i < A.length; i++) {
            if(A[i] > 0) set.add(A[i]);
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if(!set.contains(i)) return  i;
        }

        return min;
    }

    public static int oldSolution(int[] A) {
        int answer = 1;
        int last = Integer.MAX_VALUE;
        boolean goAll = false;
        Arrays.sort(A);

        for(int i=0; i<A.length; i++) {
            if(A[i] < 0) continue;
            if(last == Integer.MAX_VALUE) {
                last = A[i];
                if(i == A.length-1) {
                    goAll = true;
                }
                continue;
            }
            if(A[i] - last <= 1) {
                Log.d(TAG, "solution: A[" + i + "]\t" + A[i] );
                last = A[i];
                if(i == A.length-1) {
                    goAll = true;
                }
                continue;
            } else {
                Log.d(TAG, "solution: A[" + i + "]\t" + A[i] );
                return (A[i] - 1);
            }
        }

        if(goAll) return A[A.length-1]+1;
        return answer;
    }

}
