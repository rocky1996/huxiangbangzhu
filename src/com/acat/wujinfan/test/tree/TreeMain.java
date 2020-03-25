package com.acat.wujinfan.test.tree;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-03-25
 */
public class TreeMain {
    public static void main(String[] args) {
        TreeNode G = new TreeNode("G",null, null);
        TreeNode F = new TreeNode("F",null, null);
        TreeNode E = new TreeNode("E",null, null);
        TreeNode D = new TreeNode("D",null, null);
        TreeNode C = new TreeNode("C",F, G);
        TreeNode B = new TreeNode("B",D, E);
        TreeNode A = new TreeNode("A",B, C);

        System.out.println("先序遍历");
        TreeMain.FirstTraversal(A);

        System.out.println("中序遍历");
        TreeMain.InOrderTraversal(A);

        System.out.println("后序遍历");
        TreeMain.PostOrderTraversal(A);
    }

    public static void printNode(TreeNode node){
        System.out.print(node.getData());
    }

    /**
     * 先序遍历(根左右)ABDECFG,深度遍历
     * @param root
     */
    public static void FirstTraversal(TreeNode root){
        printNode(root);
        if(root.getLeftNode() != null){
            FirstTraversal(root.getLeftNode());
        }
        if(root.getRightNode() != null){
            FirstTraversal(root.getRightNode());
        }
    }

    /**
     * 中序遍历(左根右)DBEAFCG,深度遍历
     * @param root
     */
    public static void InOrderTraversal(TreeNode root){
        if(root.getLeftNode() != null){
            InOrderTraversal(root.getLeftNode());
        }
        printNode(root);
        if(root.getRightNode() != null){
            InOrderTraversal(root.getRightNode());
        }
    }

    /**
     * 后序遍历(左右根)DEBFGCA,深度遍历
     * @param root
     */
    public static void PostOrderTraversal(TreeNode root){
        if(root.getLeftNode() != null){
            PostOrderTraversal(root.getLeftNode());
        }
        if(root.getRightNode() != null){
            PostOrderTraversal(root.getRightNode());
        }
        printNode(root);
    }

}
