package com.nuwarobotics.app.codility.codility;

import android.util.Log;

import java.util.Arrays;

/**
 * Created by nuwa on 2018/5/4.
 */

public class MaxCounters {
    public static final String TAG = MaxCounters.class.getName();

    public static int[] solution(int N, int[] A) {

    /*
    *
    *
    * Time: O(M + N)
    * Space: O(N)
    * Grade: 77
    *
    *
    * */

        int answer[] = new int[N];
//        Arrays.fill(answer, 0);
        int currentMax = 0;
        int lastMax = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] != N+1) {
                answer[A[i]-1] = Math.max(answer[A[i]-1], lastMax); //相當於做了一次 "Arrays.fill"
                answer[A[i]-1] ++;
                currentMax =  Math.max(answer[A[i]-1], currentMax);
            } else {
                lastMax = currentMax;
            }
        }


        for (int i = 0; i < answer.length; i++) {
            answer[i] = Math.max(answer[i], lastMax);   //避免最後一個數是要做"Arrays.fill"
        }


    // print answer array
        for (int i = 0; i < answer.length ; i++) {
            Log.d(TAG, "solution: counter[" + i + "]\t" + answer[i]);
        }


    /*
    *
    *
    * Time: O(M * N)
    * Space: O(N)
    * Grade: 77
    *
    *
    * */

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

        // print answer array
        for (int i = 0; i < counter.length ; i++) {
            Log.d(TAG, "solution: counter[" + i + "]\t" + counter[i]);
        }


        return answer;

//        for (int i = 0; i < counter.length ; i++) {
//            Log.d(TAG, "solution: counter[" + i + "]\t" + counter[i]);
//        }
//        return counter;
    }
}
