package com.nuwarobotics.app.codility.leetCode.practice2019.tree;

import android.util.Log;

import com.nuwarobotics.app.codility.leetCode.practice2019.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal94 {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.empty()) {

            // find leftest node
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // --- curr is NULL now ---
            // pop a tree node which is the parent node
            curr = stack.pop();
            result.add(curr.val);
            Log.d(BinaryTreeInorderTraversal94.class.getName(), String.valueOf(curr.val));
            curr = curr.right;
        }
        return result;
    }
}
