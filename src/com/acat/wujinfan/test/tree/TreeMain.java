package com.acat.wujinfan.test.tree;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-12-16
 */
public class TreeMain {
    public static void main(String[] args) {
        //按照图片组装树
        TreeNode G = new TreeNode(null, null, "G");

        TreeNode F = new TreeNode(null, null, "F");

        TreeNode E = new TreeNode(null, null, "E");

        TreeNode D = new TreeNode(null, null, "D");

        TreeNode C = new TreeNode(F, G, "C");

        TreeNode B = new TreeNode(D, E, "B");

        TreeNode A = new TreeNode(B, C, "A");

        System.out.println("先序遍历");
        TreeMain.FirstTraversal(A);
        System.out.println("");

        System.out.println("中序遍历");
        TreeMain.InOrderTraversal(A);
        System.out.println("");

        System.out.println("后序遍历");
        PostOrderTraversal(A);
        System.out.println("");

        System.out.println("后序遍历(不带换行)");
        levelOrder(A);
        System.out.println("");

        System.out.println("后序遍历(带换行)");
        BFSTraverse(A);
        System.out.println("");
    }

    private static void printNode(TreeNode node){
        System.out.print(node.getDate());
    }

    //先序遍历,根左右,[A,B,D,E,C,F,G]
    public static void FirstTraversal(TreeNode root){
        printNode(root);
        if(root.getLeftNode() != null){
            FirstTraversal(root.getLeftNode());
        }
        if(root.getRightNode() != null){
            FirstTraversal(root.getRightNode());
        }
    }

    //中序遍历,左根右,[D,B,E,A,F,C,G]
    public static void InOrderTraversal(TreeNode root){
        if(root.getLeftNode() != null){
            InOrderTraversal(root.getLeftNode());
        }
        printNode(root);
        if(root.getRightNode() != null){
            InOrderTraversal(root.getRightNode());
        }
    }

    //后序遍历,左右根,[D,E,B,F,G,C,A]
    public static void PostOrderTraversal(TreeNode root){
        if(root.getLeftNode() != null) {
            PostOrderTraversal(root.getLeftNode());
        }
        if(root.getRightNode() != null){
            PostOrderTraversal(root.getRightNode());
        }
        printNode(root);
    }

    //层次遍历,[A,B,C,D,E,F,D]

    /**
     * 先将根节点入队，当前节点是队头节点，将其出队并访问，如果当前节点的左节点不为空将左节点入队，如果当前节点的右节点不为空将其入队。所以出队顺序也是从左到右依次出队。
     * @param root
     */
    private static void levelOrder(TreeNode root){
        if(root == null){
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode currentNode = null;

        queue.offer(root);
        while(!queue.isEmpty()){
            currentNode = queue.poll();
            System.out.print(currentNode.getDate()+"-->");
            if(currentNode.getLeftNode() != null){
                queue.offer(currentNode.getLeftNode());
            }
            if(currentNode.getRightNode() != null){
                queue.offer(currentNode.getRightNode());
            }
        }
    }

    /**
     * 层次遍历(带换行)
     * 可以使用队列实现二叉树的遍历，LinkedLsit可以看做是一个队列，offer和poll分别是进队列和出队列。队列先入先出的特性实现了层次遍历，先将根节点入队，
     * 进入循环（循环条件队列非空），首先从队列中取出一个节点（并打印数据），判断从队列中取出（这是重点）的节点是否有左右儿子，有的话依次入队列；如果队
     * 列非空，继续循环，从队列再弹出一个节点（并打印），判断该节点的节点是否有左右儿子，有的话依次入队列；每层遍历结束打印换行要通过两个引用lastNode、
     * nextLevelLastNode实现，两个引用初始化为根节点，循环中引用分别指向当前层的最后一个节点和下一层的最后一个节点，每次入队列时候nextLevelLastNode
     * 指向入队的节点，左右儿子入队之后判断当前的节点是否等于lastNode，如果是则打印换行符，并且将lastNode指向下一层最后一个节点，即lastNode=nextLevelLastNode。
     * 具体实现如下：
     * @param root
     */
    private static void BFSTraverse(TreeNode root){
        if(root == null){
            return;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode currentNode = null;
        TreeNode lastNode = root;
        TreeNode nextLevelLastNode = root;

        queue.offer(root);
        while(!queue.isEmpty()){
            currentNode = queue.poll();
            System.out.println(currentNode.getDate()+",");

            if(currentNode.getLeftNode() != null){
                queue.offer(currentNode.getLeftNode());
                nextLevelLastNode = currentNode.getLeftNode();
            }

            if(currentNode.getRightNode() != null){
                queue.offer(currentNode.getRightNode());
                nextLevelLastNode = currentNode.getRightNode();
            }

            if(lastNode == currentNode){
                System.out.println();
                lastNode = nextLevelLastNode;
            }
        }
    }
}
