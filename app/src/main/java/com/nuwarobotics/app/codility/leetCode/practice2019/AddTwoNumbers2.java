package com.nuwarobotics.app.codility.leetCode.practice2019;

import com.nuwarobotics.app.codility.leetCode.practice2019.util.ListNode;

public class AddTwoNumbers2 {

    public static final String TAG = AddTwoNumbers2.class.getName();
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode ans = new ListNode(-1);
        ListNode l3 = ans;
        int carry = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }

            l3.next = new ListNode(carry % 10);
            carry /= 10;
            l3 = l3.next;
        }

        if (carry == 1) {
            l3.next = new ListNode(carry);
        }

        return ans.next;

    }
}
