package algorithms.medium;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode listNode1 = new ListNode(2);
        ListNode n1Next1 = new ListNode(4);
        listNode1.next = n1Next1;
        ListNode n1Next2 = new ListNode(3);
        n1Next1.next = n1Next2;

        ListNode listNode2 = new ListNode(5);
        ListNode n2Next1 = new ListNode(6);
        listNode2.next = n2Next1;
        ListNode n2Next2 = new ListNode(4);
        n2Next1.next = n2Next2;

        ListNode resultNode = solution.addTwoNumbers(listNode1, listNode2);
        String result = solution.displayListNode(resultNode);
        System.out.println(result);

        /*ListNode listNode1 = new ListNode(9);
        ListNode n1Next1 = new ListNode(9);
        listNode1.next = n1Next1;

        ListNode listNode2 = new ListNode(1);

        ListNode resultNode = solution.addTwoNumbers(listNode1, listNode2);
        String result = solution.displayListNode(resultNode);
        System.out.println(result);*/

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int x = 0;
        int y = 0;
        int remainder = 0;
        int sum = 0;
        ListNode lastNode = null;

        ListNode result = null;

        while (l1 != null || l2 != null) {

            if (l1 != null) {
                x = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                y = l2.val;
                l2 = l2.next;
            }

            sum = (x + y + remainder) % 10;
            remainder = (x + y + remainder) / 10;

            if (result == null) {
                result = new ListNode(sum);
                lastNode = result;

            } else {
                lastNode.next = new ListNode(sum);
                lastNode = lastNode.next;
            }

            x = 0;
            y = 0;

        }

        if (remainder > 0) {
            lastNode.next = new ListNode(remainder);
        }

        return result;
    }

    private String displayListNode(ListNode listNode) {

        String result = "";
        while (listNode != null) {

            result += listNode.val;
            listNode = listNode.next;

            if (listNode != null) {
                result  += "->";
            }
        }

        return result;
    }
}
