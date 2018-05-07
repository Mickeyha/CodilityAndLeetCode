package com.nuwarobotics.app.codility.codility;

import java.util.Arrays;

/**
 * Created by Mikihaha on 2018/5/4.
 */

public class PermCheck {
    public static final String TAG = PermCheck.class.getName();

    public static int solution(int[] A) {

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if(A[i] != i+1) return 0;
        }
        return 1;
    }
}
