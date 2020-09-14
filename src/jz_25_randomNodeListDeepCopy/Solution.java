package jz_25_randomNodeListDeepCopy;

import java.util.HashMap;
//          题目：输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
//                另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，并返回拷贝后的头结点。
//                  （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）


public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
//        首先判断是否为空
        if(pHead == null)  return null;
//         将头指针保留下来，存到新的节点，用于返回
        RandomListNode target = new RandomListNode(pHead.label);
//        再创建一个节点，一会儿用于遍历，深拷贝
        RandomListNode p = target;
//        这个节点是为了找复制到map结构中的原来节点
        RandomListNode cur = pHead;
//         创建map结构，用于复制原来；链表中所有的节点，实现深拷贝
        HashMap <RandomListNode,RandomListNode> map = new HashMap<>();
//         先把原来链表的节点复制到HashMap中，，必须new ,一会儿遍历复制
        while(pHead != null){
            map.put( pHead, new RandomListNode(pHead.label));
            pHead = pHead.next;
        }

        while (cur != null){
            p.next = map.get( cur.next );
            p.random = map.get( cur.random );
            cur = cur.next;
            p = p.next;
        }
        return target;
    }
}
