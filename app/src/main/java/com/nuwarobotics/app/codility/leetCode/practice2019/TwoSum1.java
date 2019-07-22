package com.nuwarobotics.app.codility.leetCode.practice2019;

import android.util.Log;

import java.util.HashMap;

public class TwoSum1 {

    public static final String TAG = TwoSum1.class.getName();

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[]{0, 0};
        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ans[0] = map.get(nums[i]);
                ans[1] = i;
                Log.d(TAG, " " + ans[0] + "\t" + ans[1]);
                return ans;
            }
            map.put(target-nums[i], i);
        }
        Log.d(TAG, "no ans");
        return ans;
    }
}