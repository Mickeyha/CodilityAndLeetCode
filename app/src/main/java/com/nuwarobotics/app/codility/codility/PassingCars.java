package com.nuwarobotics.app.codility.codility;

public class PassingCars {
    public static final String TAG = PassingCars.class.getName();

    public static int solution(int[] A) {
        int zeroCounter = 0;
        int ans = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] == 0) {
                zeroCounter++;
            } else {
                ans += zeroCounter;
                if(ans > 1000000000) {
                    return -1;
                }
            }
        }

        return ans;
    }
}
