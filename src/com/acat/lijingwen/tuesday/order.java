package com.acat.lijingwen.tuesday;

import sun.reflect.generics.tree.Tree;

public class order {
    //先序遍历  递归和非递归实现的理解
    //栈后进先出  进站push   出战pop
    //先实现树建立一个树节点的数组
    public static  void main (String []args) {
        TreeNode[] treeNodes = new TreeNode[10];
        //数组赋值
        for (int i = 0; i < 10; i++) {
              treeNodes[i]=new TreeNode(i);
        }
        //建立左右孩子
        for (int i=0;i<10;i++){
            if (2*i+1<10){
                treeNodes[i].left=treeNodes[2*i+1];
            }
            if (2*i+2<10){
                treeNodes[i].right=treeNodes[2*i+2];
            }
        }
        //先序遍历
        System.out.println("先序遍历1");
        preorder(treeNodes[0]);
        System.out.println("先序遍历2");
        preordere(treeNodes[0]);
        //中序遍历
        System.out.println("中序遍历");
        minorder(treeNodes[0]);
        //后序遍历
        System.out.println("后序遍历");
        postOrder(treeNodes[0]);
    }
    public static void preorder(TreeNode treeNode){
        System.out.println(treeNode.value);
        TreeNode leftnode= treeNode.left;
        if(leftnode!=null){
            preorder(leftnode);
        }
        TreeNode rightnode=treeNode.right;
        if(rightnode!=null){
            preorder(rightnode);
        }
    }
    public static void preordere(TreeNode treeNode){
        if (treeNode == null){
            return;
        }
        else{
            System.out.println(treeNode.value);
            preordere(treeNode.left);
            preordere(treeNode.right);
        }
    }
    public static void minorder(TreeNode treeNode){
           if (treeNode == null){
               return;
           }
           else{
               minorder(treeNode.left);
               System.out.println(treeNode.value);
               minorder(treeNode.right);
           }

    }
    public static void postOrder(TreeNode treeNode){
        if (treeNode==null){
            return;
        }
        else{
            postOrder(treeNode.left);
            postOrder(treeNode.right);
            System.out.println(treeNode.value);
        }
    }
}
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value){
        this.value=value;
    }

}
