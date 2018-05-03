package com.nuwarobotics.app.codility.leetCode;

import android.util.Log;

/**
 * Created by nuwa on 2018/5/2.
 */

public class HouseRobber198 {
    public static final String TAG = HouseRobber198.class.getName();

    public static int rob(int[] nums) {
        int maxS[] = new int[nums.length];
        if(nums.length == 0) return 0;
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        maxS[0] = nums[0];
        maxS[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i< nums.length; i++) {
            maxS[i] = Math.max(nums[i]+maxS[i-2], maxS[i-1]);
            Log.d(TAG, "rob: maxS" + i + " = " + maxS[i]);
        }

        return maxS[nums.length-1];
    }
}
