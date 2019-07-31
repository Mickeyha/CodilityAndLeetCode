package com.nuwarobotics.app.codility.leetCode.practice2019;

import android.util.Log;

import java.util.HashMap;
import java.util.HashSet;

public class LengthOfLongestSubstring3 {
    public static final String TAG = LengthOfLongestSubstring3.class.getName();

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0, j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            map.put(s.charAt(j), j + 1);    // we can restart the search from j+1
            max = Math.max(max, j - i + 1);

        }

        return max;
    }


    public static int lengthOfLongestSubstring2N(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;

        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int start = 0;
        int end = 0;

        while (start < s.length() && end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                max = Math.max(max, end - start);   // end - start -1 +1 -> end - start, -1 cuz haven't checked end++
            } else {
                set.remove(s.charAt(start++));
            }
        }

        return max;
    }

    @Deprecated
    public static int old(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;

        String[] sArray = s.split("");  // { "","a","b","c",....}

        int max = 0;
        int start = 1;
        int end = 1;
        HashSet<String> set = new HashSet<>();

        while(end < sArray.length ) {
            Log.d(TAG, "start = " + start + "\t end = " + end);
            Log.d(TAG, "start = " + sArray[start] + "\t end = " + sArray[end]);
            if (set.contains(sArray[end])) {
                if (sArray[start].equals(sArray[end])) {
                    start++;
                    end++;
                } else {
                    set.remove(sArray[start]);
                    start++;
                    end++;
                }
                continue;
            } else {
                set.add(sArray[end]);
                end ++;
            }
//            Log.d(TAG, "start = " + start + "\t end = " + end);
//            Log.d(TAG, "start = " + sArray[start] + "\t end = " + sArray[end]);
            if (max < (end-start) && end < sArray.length && !set.contains(sArray[end])) {
                max = end-start;
            }
        }


        return (max+1);
    }
}
