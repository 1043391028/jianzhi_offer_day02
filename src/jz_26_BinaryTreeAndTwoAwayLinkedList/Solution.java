package jz_26_BinaryTreeAndTwoAwayLinkedList;

//         题目描述：输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
//                   要求不能创建任何新的结点，只能调整树中结点指针的指向。

public class Solution {

//    方法1：利用线索二叉树原理，按照右->中-》左顺序遍历二叉树，之不过把输出的操作换成了改为双链表的操作
    TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree){
        if( pRootOfTree == null ) return null;
        if(pRootOfTree.right != null) Convert(pRootOfTree.right);
        if(pre != null){
            pre.left = pRootOfTree;
            pRootOfTree.right = pre;
        }
        pre = pRootOfTree;
        Convert(pRootOfTree.left);
        return pre;
    }

}
