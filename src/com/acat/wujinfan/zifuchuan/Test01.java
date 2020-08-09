package com.acat.wujinfan.zifuchuan;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-04-15
 */
public class Test01 {

//    public static void main(String[] args) {
//        String str = "google";
//
//        for(int i=0;i<str.length();i++){
//            if(str.lastIndexOf(str.charAt(i)) == i && str.indexOf(str.charAt(i)) == i){
//                System.out.println(str.charAt(i));
//                 break;
//            }
//        }
//    }

    /**
     * 从尾到头打印链表
     * @param listNode
     * @return
     */
//    public List<Integer> printList(ListNode listNode){
//
//        Stack<Integer> stack = new Stack<>();
//        while(listNode != null){
//            stack.push(listNode.getVal());
//            listNode = listNode.getNext();
//        }
//
//        List<Integer> list = new ArrayList<>();
//        while(!stack.isEmpty()){
//            list.add(stack.pop());
//        }
//        return list;
//    }

    public List<Integer> printList(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode.getVal());
            listNode = listNode.getNext();
        }

        List<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

    /**
     * 反转链表
     * @param head
     * @return
     */
//    private ListNode reverseList(ListNode head){
//        ListNode cur = head;
//        ListNode next = null;
//        ListNode pre = null;
//
//        if(head == null || head.getNext() == null){
//            return head;
//        }
//
//        while(cur != null){
//            next = cur.getNext();
//            cur.setNext(pre);
//            pre = cur;
//            cur = next;
//        }
//
//        return pre;
//    }

    private ListNode reverseList(ListNode head){
        ListNode cur = head;
        ListNode next = null;
        ListNode pre = null;

        if(head == null){
            return head;
        }
        if(head.getNext() == null){
            return head;
        }

        while(cur != null){
            next = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = next;
        }

        return pre;
    }





    /**
     * 合并链表
     * @param list1
     * @param list2
     * @return
     */
//    public ListNode Merge(ListNode list1,ListNode list2){
//        if(list1 == null){
//            return list2;
//        }
//        if(list2 == null){
//            return list1;
//        }
//
//        ListNode lastNode = null;
//        if(list1.getVal() < list2.getVal()){
//            lastNode = list1;
//            lastNode.setNext(Merge(list1.getNext(),list2));
//        }else {
//            lastNode = list2;
//            lastNode.setNext(Merge(list1,list2.getNext()));
//        }
//        return lastNode;
//    }

    public ListNode Merge(ListNode list1,ListNode list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode lastNode = null;
        if(list1.getVal() < list2.getVal()){
            lastNode = list1;
            lastNode.setNext(Merge(list1.getNext(),list2));
        }else {
            lastNode = list2;
            lastNode.setNext(Merge(list1,list2.getNext()));
        }
        return lastNode;
    }

    /**
     * 两个链表的第一个公共结点
     * @param pHead1
     * @param pHead2
     * @return
     */
//    private ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
//        if(pHead1 == null || pHead2 == null){
//            return null;
//        }
//
//        Map<ListNode,Integer> map = new HashMap<>();
//        while(pHead1 != null){
//            map.put(pHead1,1);
//            pHead1 = pHead1.getNext();
//        }
//
//        while(pHead2 != null){
//            if(map.getOrDefault(pHead2,0) != 0){
//                return pHead2;
//            }
//            pHead2 = pHead2.getNext();
//        }
//        return null;
//    }

    private ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
        if(pHead1 == null || pHead2 == null){
            return null;
        }
        Map<ListNode,Integer> map = new HashMap<>();
        while(pHead1 != null){
            map.put(pHead1,1);
            pHead1 = pHead1.getNext();
        }

        while(pHead2 != null){
            if(map.getOrDefault(pHead2,0) != 0){
                return pHead2;
            }
            pHead2 = pHead2.getNext();
        }
        return null;
    }

    private String leftRotateString(String str,int n){
        if(str.length()<0 || n<0){
            return null;
        }

        StringBuffer sb = new StringBuffer(str.substring(0,n));
        StringBuffer sb1 = new StringBuffer(str.substring(n,str.length()));
        sb1.append(sb);

        return sb1.toString();
    }

    /**
     * 链表中环的入口结点
     * @param pHead
     * @return
     */
//    private ListNode EntryNodeOfLoop(ListNode pHead){
//        if(pHead == null || pHead.getNext() == null){
//            return null;
//        }
//
//        ListNode node1 = pHead;
//        ListNode node2 = pHead;
//
//        while(node2 != null || node2.getNext() != null){
//            node1 = node1.getNext();
//            node2 = node2.getNext().getNext();
//
//            if(node1 == node2){
//                node2 = pHead;
//                while(node1 != node2){
//                    node1 = node1.getNext();
//                    node2 = node2.getNext();
//                }
//                if(node1 == node2){
//                    return node2;
//                }
//            }
//        }
//        return null;
//    }

    private ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null || pHead.getNext() == null){
            return null;
        }

        ListNode node1 = pHead;
        ListNode node2 = pHead;

        while (node2 != null || node2.getNext() != null){
            node1.getNext();
            node2.getNext().getNext();

            if(node1 == node2){
                node2 = pHead;
                while (node1 != node2){
                    node1 = node1.getNext();
                    node2 = node2.getNext();
                }
                if (node1 == node2){
                    return node2;
                }
            }
        }
        return null;

    }
}
