package jz_26_BinaryTreeAndTwoAwayLinkedList;

import java.util.ArrayList;

// 方法2 ： 先把结按照左-》中-》右顺序遍历，并存入链表中
//          然后，从前往后遍历链表，并修改链表指针指向，为双向链表；
//           最后，返回链表头元素；


public class Solution1 {
    //中序遍历，在list中按遍历顺序保存
    public void Convert(TreeNode pRootOfTree, ArrayList<TreeNode> list){
        if(pRootOfTree.left != null){
            Convert(pRootOfTree.left, list);
        }

        list.add(pRootOfTree);

        if(pRootOfTree.right != null){
            Convert(pRootOfTree.right, list);
        }
    }
    //遍历list，修改指针
    public TreeNode Convert(ArrayList<TreeNode> list){
        for(int i = 0; i < list.size() - 1; i++){
            list.get(i).right = list.get(i + 1);
            list.get(i + 1).left = list.get(i);
        }
        return list.get(0);
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        ArrayList<TreeNode> list = new ArrayList<>();
        Convert(pRootOfTree, list);
        return Convert(list);
    }

}

