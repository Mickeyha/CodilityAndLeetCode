package com.nuwarobotics.app.codility.leetCode;


import android.util.Log;

/**
 * Created by Mikihaha on 2018/5/2.
 */

public class CountingBits338 {
    public static final String TAG = CountingBits338.class.getName();

    public static int[] countBits(int num) {
        int bits[] = new int[num+1];
        bits[0] = 0;
        if(num == 0) return bits;
        bits[1] = 1;
        if(num == 1) return bits;

        int len = Integer.toBinaryString(num).length();
        Log.d(TAG, "countBits: " + len);
        Log.d(TAG, "countBits: " + Math.pow(2, len-1));

        for (int i = 2; i <= len; i++) {

        }

        return bits;
    }
}
