package com.acat.wujinfan.test.tree;

import sun.reflect.generics.tree.Tree;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-12-16
 */
public class TreeNode {

    private TreeNode leftNode;

    private TreeNode rightNode;

    private String date;

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TreeNode() {

    }

    public TreeNode(TreeNode leftNode, TreeNode rightNode, String date) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.date = date;
    }
}
