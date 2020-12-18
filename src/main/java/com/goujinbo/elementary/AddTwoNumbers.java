package com.goujinbo.elementary;

/**
 * add-two-numbers
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author BO
 * @date 2020-12-14 17:45
 * @since 2020/12/14
 **/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int i = 0;
        ListNode listNode = new ListNode();
        int sum = l1.val + l2.val;
        if ((listNode.val = sum % 10) != sum) {
            i = 1;
        }
        ListNode listNode1 = listNode;
        while (l1 != null || l2 != null) {
            ListNode listNode2 = new ListNode();
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + i;
            i = ((listNode2.val = sum % 10) != sum) ? 1 : 0;
            if (l1 == null && l2 == null && listNode2.val == 0) {
                break;
            }
            listNode1.next = listNode2;
            listNode1 = listNode2;

        }
        return listNode;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l2 = new ListNode(9, new ListNode(9));

        ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);
        do {
            System.out.print(listNode.val);
        } while ((listNode = listNode.next) != null);
    }

}

