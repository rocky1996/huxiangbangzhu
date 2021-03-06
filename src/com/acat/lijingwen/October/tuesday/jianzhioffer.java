package com.acat.lijingwen.October.tuesday;

import java.util.ArrayList;
import java.util.Stack;

public class jianzhioffer {
//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
      /*此题的思想是建立Arraylist   Stack 这里用到栈主要可以利用其先进后出的思想
        将链表中的数据放到栈里面，然后再出栈放到arraylist里面刚好将链表中的元素倒置存放于arraylist中
        * */
      ArrayList<Integer> arrayList = new ArrayList<Integer>();
      Stack<Integer> stack = new Stack<Integer>();
      while (listNode!=null){
          stack.push(listNode.val);
          listNode = listNode.next;
      }
      while (!stack.isEmpty()){
          arrayList.add(stack.pop());
      }
      return arrayList;
    }
//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
// 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
   // * Definition for binary tree
     public class TreeNode {
        int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
     }
        public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
            TreeNode root=new TreeNode(pre[0]);//前序的第一个数定为根
            int len=pre.length;
            //当只有一个数的时候
            if(len==1){
                root.left=null;
                root.right=null;
                return root;
            }
            //找到中序中的根位置
            int rootval=root.val;
            int i;
            for(i=0;i<len;i++){
                if(rootval==in[i])
                    break;
            }
            //创建左子树
            if(i>0){
                int[] pr=new int[i];
                int[] ino=new int[i];
                for(int j=0;j<i;j++){
                    pr[j]=pre[j+1];
                }
                for(int j=0;j<i;j++){
                    ino[j]=in[j];
                }
                root.left=reConstructBinaryTree(pr,ino);
            }else{
                root.left=null;
            }
            //创建右子树
            if(len-i-1>0){
                int[] pr=new int[len-i-1];
                int[] ino=new int[len-i-1];
                for(int j=i+1;j<len;j++){
                    ino[j-i-1]=in[j];
                    pr[j-i-1]=pre[j];
                }
                root.right=reConstructBinaryTree(pr,ino);
            }else{
                root.right=null;
            }
            return root;
        }
}
