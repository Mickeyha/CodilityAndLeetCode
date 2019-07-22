package com.nuwarobotics.app.codility;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.nuwarobotics.app.codility.leetCode.practice2019.AddTwoNumbers2;
import com.nuwarobotics.app.codility.leetCode.practice2019.util.ListNode;
import com.nuwarobotics.app.codility.leetCode.practice2019.TwoSum1;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getName();
    private TextView answerText;
    private int mBiggest = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        answerText = findViewById(R.id.answer);
//        answerText.setText("Answer = " + solution(51712));
//        solution(new int[]{1,2,3,4},9);
//        Log.e(TAG, "rob: " + HouseRobber198.rob(new int[]{1,2,3,1}));
//        Log.e(TAG, "countBits: " + CountingBits338.countBits(5));
//        Log.e(TAG, "OddOccurrencesInArray: " + OddOccurrencesInArray.solution(new int[]{9,3,9,3,9,7,9}));
//        Log.e(TAG, "PermMissingElem: " + PermMissingElem.solution(new int[]{2,3,1,5}));
//        Log.e(TAG, "FrogJmp: " + FrogJmp.solution(10,85,30));
//        Log.e(TAG, "TapeEquilibrium: " + TapeEquilibrium.solution(new int[]{3,1,2,4,3}));
//        Log.e(TAG, "PermCheck: " + PermCheck.solution(new int[]{3,1,2,4}));
//        Log.e(TAG, "PermCheck: " + PermCheck.solution(new int[]{3,1,4}));
//        Log.e(TAG, "FrogRiverOne: " + FrogRiverOne.solution(5, new int[]{1,3,1,4,2,3,5,4}));
//        Log.e(TAG, "FrogRiverOne: " + FrogRiverOne.solution(1, new int[]{0}));
//        Log.e(TAG, "MissingInteger: " + MissingInteger.solution(new int[]{1,3,6,4,1,2}));
//        Log.e(TAG, "MissingInteger: " + MissingInteger.solution(new int[]{1,2,3}));
//        Log.e(TAG, "MaxCounters: " + MaxCounters.solution(5, new int[]{3,4,4,6,1,4,4}));
//        Log.e(TAG, "PassingCars: " + PassingCars.solution(new int[]{0,1,0,1,1}));
//        Log.e(TAG, "Exam2P3Q: " + Exam2P3Q.solution(10));
//        Log.e(TAG, "TwoSun1: " + TwoSum1.twoSum(new int[]{2, 7, 11, 15}, 9));


        // +++ AddTwoNumber
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode ans = AddTwoNumbers2.addTwoNumbers(l1, l2);
        while (ans != null) {
            Log.d(TAG, "ans = " + ans.val);
            ans = ans.next;
        }
        // --- AddTwoNumber

        TwoSum1.twoSum(new int[]{2, 7, 11, 15}, 9);
    }

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] answer = new int[A.length];
        int length = A.length;
        for (int i = 0; i < length; i++) {
            int position = i+K;
            if(position > length-1) {
                position = position % length;
            }
            answer[position] = A[i];
            Log.d(TAG, "solution: " + position + ", " + A[i]);
        }
        for (int i = 0; i < answer.length; i++) {
            Log.e(TAG, "" + answer[i] + ", ");
        }
        return answer;
    }

    public int solution(int N) {
        // write your code in Java SE 8
        if(N == 0) return 0;
        int lastPivot = -1;
        int currentDis = -1;
        String binary = Integer.toBinaryString(N);
        Log.e(TAG, "solution: " + binary );
        if(!binary.contains("0")) return 0;
        mBiggest = 0;
//        String[] binary = new String[]{Integer.toBinaryString(N)};
        for (int i = -1; (i = binary.indexOf("1", i + 1)) != -1;) {
            if(lastPivot == -1) {
                lastPivot = i;
            }
            currentDis = i-lastPivot-1;

            if(currentDis > mBiggest) {
                mBiggest = currentDis;
            }
            lastPivot = i;

            Log.e(TAG, "solution: "+i);
        }

        return mBiggest;
    }
}
