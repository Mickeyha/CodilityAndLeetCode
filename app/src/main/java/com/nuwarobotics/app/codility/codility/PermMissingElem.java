package com.nuwarobotics.app.codility.codility;

/**
 * Created by Mikihaha on 2018/5/3.
 */

public class PermMissingElem {
    public static int solution(int[] A) {
        long len = A.length + 1;
        long total = (1+len) * len / 2;

        for (int i = 0; i < A.length; i++) {
            total -= A[i];
        }
        return (int)total;
    }
}
