import java.util.LinkedList;

public class Solution {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //The numbers are stored backwards in a linked list meaning 2-4-3 = 342
    //Add two linked lists and return the listnode answer.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode answer = new ListNode();
        ListNode tempNode = answer;
        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {

            int total = 0;

            if(l1 != null){
                total = total + l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                total = total + l2.val;
                l2 = l2.next;
            }

            total = total + carry;
            carry = total / 10;
            ListNode currentNode = new ListNode(total % 10);
            tempNode.next = currentNode;
            tempNode = tempNode.next;
        }
        return answer.next;
    }
}
