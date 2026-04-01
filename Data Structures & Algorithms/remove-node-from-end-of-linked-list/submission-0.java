/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=1;
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
            count++;
        }
        ListNode temp=head;
        ListNode prev=null;
        for(int i=0;i<count-n;i++){
            prev=temp;
            temp=temp.next;
        }

        if(count==n)return head.next;
        prev.next=temp.next;
        temp.next=null;
        return head;
    }
}
