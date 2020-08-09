package com.acat.wujinfan.test.tree;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-06-06
 */

/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * 例如，给定如下二叉搜索树: root = [6,2,8,0,4,7,9,null,null,3,5]
 *
 *
 * 示例 1:
 *
 * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * 输出: 6
 * 解释: 节点 2 和节点 8 的最近公共祖先是 6。
 * 示例 2:
 *
 * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 * 输出: 2
 * 解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。
 * 说明:
 *
 * 所有节点的值都是唯一的。
 * p、q 为不同节点且均存在于给定的二叉搜索树中。
 *
 *
 * 解决方案
 * 我们来复习一下二叉搜索树（BST）的性质：
 *
 * 节点 [公式] 左子树上的所有节点的值都小于等于节点 [公式] 的值
 * 节点 [公式] 右子树上的所有节点的值都大于等于节点 [公式] 的值
 * 左子树和右子树也都是 BST
 * 方法一 （递归）
 *
 * 节点 [公式] ， [公式] 的最近公共祖先（LCA）是距离这两个节点最近的公共祖先节点。
 *
 * 在这里最近考虑的是节点的深度。下面这张图能帮助你更好的理解最近这个词的含义。
 *
 *
 * 笔记： [公式] 和 [公式] 其中的一个在 LCA 节点的左子树上，另一个在 LCA 节点的右子树上。
 *
 * 也有可能是下面这种情况：
 *
 *
 * 算法
 *
 * 从根节点开始遍历树
 * 如果节点 [公式] 和节点 [公式] 都在右子树上，那么以右孩子为根节点继续 1 的操作
 * 如果节点 [公式] 和节点 [公式] 都在左子树上，那么以左孩子为根节点继续 1 的操作
 * 如果条件 2 和条件 3 都不成立，这就意味着我们已经找到节 [公式] 和节点 [公式] 的 LCA 了\
 */

public class TreeTest1 {

    //BST(二叉搜索树)
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        int parentVal = Integer.parseInt(root.getData());
        int pVal = Integer.parseInt(p.getData());
        int qVal = Integer.parseInt(q.getData());

        if(pVal > parentVal && qVal > parentVal){
            return lowestCommonAncestor(root.getRightNode(), p, q);
        }else if(pVal < parentVal && qVal < parentVal){
            return lowestCommonAncestor(root.getLeftNode(), p, q);
        }else {
            return root;
        }
    }

    public TreeNode lowestCommonAncestor2(TreeNode root,TreeNode node1,TreeNode node2){
        if(root == null || node1 == null ||  node2 == null) {
            return null;
        }
        if(root.getData() == node1.getData() || root.getData() == node2.getData()) {
            return root;
        }

        TreeNode left = lowestCommonAncestor2(root.getLeftNode(),node1,node2);
        TreeNode right = lowestCommonAncestor2(root.getRightNode(),node1,node2);

        //如果左右子树都能找到，那么当前节点就是最近的公共祖先节点
        if(left != null && right != null) {
            return root;
        }
        //如果左子树上没有，那么返回右子树的查找结果
        if(left == null) {
            return right;
        }else {
            //否则返回左子树的查找结果
            return left;
        }
    }

}
