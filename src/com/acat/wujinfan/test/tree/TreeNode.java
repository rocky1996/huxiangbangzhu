package com.acat.wujinfan.test.tree;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-03-25
 */
public class TreeNode {

    private String data;

    private TreeNode leftNode;

    private TreeNode rightNode;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

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

    public TreeNode(String data, TreeNode leftNode, TreeNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public TreeNode() {
    }
}
