package com.acat.wujinfan.test.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-03-25
 */
public class TreeMain {
    public static void main(String[] args) {
        TreeNode G = new TreeNode("G", null, null);
        TreeNode F = new TreeNode("F", null, null);
        TreeNode E = new TreeNode("E", null, null);
        TreeNode D = new TreeNode("D", null, null);
        TreeNode C = new TreeNode("C", F, G);
        TreeNode B = new TreeNode("B", D, E);
        TreeNode A = new TreeNode("A", B, C);

//        System.out.println("先序遍历");
//        TreeMain.FirstTraversal(A);
//
//        System.out.println("中序遍历");
//        TreeMain.InOrderTraversal(A);
//
//        System.out.println("后序遍历");
//        TreeMain.PostOrderTraversal(A);

        System.out.println("层次遍历");
        TreeMain.levelOrder(A);

//        System.out.println("层次遍历(带换行)");
//        TreeMain.BFSTraverseOne(A);
//
//        System.out.println("二叉树的左视图");
//        TreeMain.BFSLeftTraverse(A);
//
//        System.out.println("层次遍历(带换行)");
//        List<List<String>> list = TreeMain.levelOrderBottom(A);
//        System.out.println(list);
//
//        System.out.println("之字形打印");
//        List<List<String>> list2 = TreeMain.zhizidayin(A);
//        System.out.println(list2);
    }

    public static void printNode(TreeNode node) {
        System.out.print(node.getData());
    }

    /**
     * 先序遍历(根左右)ABDECFG,深度遍历
     *
     * @param root
     */
    public static void FirstTraversal(TreeNode root) {
        printNode(root);
        if (root.getLeftNode() != null) {
            FirstTraversal(root.getLeftNode());
        }
        if (root.getRightNode() != null) {
            FirstTraversal(root.getRightNode());
        }
    }

    /**
     * 中序遍历(左根右)DBEAFCG,深度遍历
     *
     * @param root
     */
    public static void InOrderTraversal(TreeNode root) {
        if (root.getLeftNode() != null) {
            InOrderTraversal(root.getLeftNode());
        }
        printNode(root);
        if (root.getRightNode() != null) {
            InOrderTraversal(root.getRightNode());
        }
    }

    /**
     * 后序遍历(左右根)DEBFGCA,深度遍历
     *
     * @param root
     */
    public static void PostOrderTraversal(TreeNode root) {
        if (root.getLeftNode() != null) {
            PostOrderTraversal(root.getLeftNode());
        }
        if (root.getRightNode() != null) {
            PostOrderTraversal(root.getRightNode());
        }
        printNode(root);
    }

    /**
     * 层次遍历,ABCDEFG,广度遍历
     *
     * @param root
     */
    public static void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        TreeNode currentNode = null;

        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            printNode(currentNode);

            if (currentNode.getLeftNode() != null) {
                queue.offer(currentNode.getLeftNode());
            }
            if (currentNode.getRightNode() != null) {
                queue.offer(currentNode.getRightNode());
            }
        }
    }

    /**
     * 层次遍历(不带换行)
     * 可以使用队列实现二叉树的遍历，LinkedLsit可以看做是一个队列，offer和poll分别是进队列和出队列。队列先入先出的特性实现了层次遍历，先将根节点入队，
     * 进入循环（循环条件队列非空），首先从队列中取出一个节点（并打印数据），判断从队列中取出（这是重点）的节点是否有左右儿子，有的话依次入队列；如果队
     * 列非空，继续循环，从队列再弹出一个节点（并打印），判断该节点的节点是否有左右儿子，有的话依次入队列；每层遍历结束打印换行要通过两个引用lastNode、
     * nextLevelLastNode实现，两个引用初始化为根节点，循环中引用分别指向当前层的最后一个节点和下一层的最后一个节点，每次入队列时候nextLevelLastNode
     * 指向入队的节点，左右儿子入队之后判断当前的节点是否等于lastNode，如果是则打印换行符，并且将lastNode指向下一层最后一个节点，即lastNode=nextLevelLastNode。
     *
     * @param root
     */
    public static void BFSTraverseOne(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        TreeNode currentNode = null;
        TreeNode lastNode = root;
        TreeNode nextLevelLastNode = root;

        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            printNode(currentNode);

            if (currentNode.getLeftNode() != null) {
                queue.offer(currentNode.getLeftNode());
                nextLevelLastNode = currentNode.getLeftNode();
            }

            if (currentNode.getRightNode() != null) {
                queue.offer(currentNode.getRightNode());
                nextLevelLastNode = currentNode.getRightNode();
            }

            if (lastNode == currentNode) {
                System.out.println();
                lastNode = nextLevelLastNode;
            }
        }
    }

    /**
     * 逆序后序遍历(带换行)
     *
     * @param root
     * @return
     */
    public static List<List<String>> levelOrderBottom(TreeNode root) {
        LinkedList<List<String>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<String> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                list.add(currentNode.getData());
                if (currentNode.getLeftNode() != null) {
                    queue.add(currentNode.getLeftNode());
                }
                if (currentNode.getRightNode() != null) {
                    queue.add(currentNode.getRightNode());
                }
            }
            res.addFirst(list);
        }

        return res;
    }

    /**
     * 二叉树的左视图
     *
     * @param root
     */
    public static void BFSLeftTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        TreeNode currentNode = null;
        TreeNode lastNode = root;
        TreeNode nextLevelLastNode = root;

        boolean flag = true;
        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            if (flag) {
                printNode(currentNode);
                flag = false;
            }

            if (currentNode.getLeftNode() != null) {
                queue.offer(currentNode.getLeftNode());
                nextLevelLastNode = currentNode.getLeftNode();
            }

            if (currentNode.getRightNode() != null) {
                queue.offer(currentNode.getRightNode());
                nextLevelLastNode = currentNode.getRightNode();
            }

            if (lastNode == currentNode) {
                flag = true;
                System.out.println();
                lastNode = nextLevelLastNode;
            }
        }
    }

    /**
     * 之字形打印
     * @param root
     */
    public static LinkedList<List<String>> zhizidayin(TreeNode root){
        LinkedList<List<String>> bigList = new LinkedList<>();

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        TreeNode currentNode = null;
        boolean flag = true;

        while(!queue.isEmpty()){
            List<String> list = new ArrayList<>();
            int size = queue.size();

            for(int i=0;i<size;i++){
                currentNode = queue.poll();
                if(flag){
                    list.add(currentNode.getData());
                }else {
                    list.add(0,currentNode.getData());
                }

                if(currentNode.getLeftNode() != null){
                    queue.offer(currentNode.getLeftNode());
                }
                if(currentNode.getRightNode() != null){
                    queue.offer(currentNode.getRightNode());
                }
            }
            bigList.add(list);
            flag = false;
        }

        return bigList;
    }
}
