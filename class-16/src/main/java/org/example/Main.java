package org.example;

public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();


        tree.root = tree.new TreeNode(50);
        tree.root.left = tree.new TreeNode(30);
        tree.root.right = tree.new TreeNode(70);
        tree.root.left.left = tree.new TreeNode(20);
        tree.root.left.right = tree.new TreeNode(40);
        tree.root.right.left = tree.new TreeNode(60);
        tree.root.right.right = tree.new TreeNode(80);


        int maxValue = tree.findMaxValue();


        System.out.println("Maximum value in the binary tree: " + maxValue);
    }
}
