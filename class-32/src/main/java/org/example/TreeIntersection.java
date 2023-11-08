package org.example;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}


public class TreeIntersection {
    // Testing
    public static void main(String[] args) {
        TreeIntersection treeIntersection = new TreeIntersection();

        // Test Case 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(1);

        Set<Integer> result1 = treeIntersection.tree_intersection(root1, root2);
        System.out.println("Test Case 1: " + result1); // Output: [1, 2]

        // Test Case 2
        TreeNode root3 = new TreeNode(5);
        root3.left = new TreeNode(6);
        root3.right = new TreeNode(7);

        TreeNode root4 = new TreeNode(8);
        root4.left = new TreeNode(9);
        root4.right = new TreeNode(5);

        Set<Integer> result2 = treeIntersection.tree_intersection(root3, root4);
        System.out.println("Test Case 2: " + result2); // Output: [5]

        // Test Case 3
        TreeNode root5 = new TreeNode(10);
        root5.left = new TreeNode(11);
        root5.right = new TreeNode(12);

        TreeNode root6 = new TreeNode(13);
        root6.left = new TreeNode(14);
        root6.right = new TreeNode(15);

        Set<Integer> result3 = treeIntersection.tree_intersection(root5, root6);
        System.out.println("Test Case 3: " + result3); // Output: []
    }

    public Set<Integer> tree_intersection(TreeNode root1, TreeNode root2) {
        Set<Integer> result = new HashSet<>();
        Map<Integer, Boolean> valueMap = new HashMap<>();
        populateValueMap(root1, valueMap);
        findCommonValues(root2, valueMap, result);
        return result;
    }

    private void populateValueMap(TreeNode node, Map<Integer, Boolean> valueMap) {
        if (node == null) {
            return;
        }
        valueMap.put(node.val, true);
        populateValueMap(node.left, valueMap);
        populateValueMap(node.right, valueMap);
    }

    private void findCommonValues(TreeNode node, Map<Integer, Boolean> valueMap, Set<Integer> result) {
        if (node == null) {
            return;
        }
        if (valueMap.containsKey(node.val)) {
            result.add(node.val);
        }
        findCommonValues(node.left, valueMap, result);
        findCommonValues(node.right, valueMap, result);
    }
}
