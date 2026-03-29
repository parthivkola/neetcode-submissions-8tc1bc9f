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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first=list1;
        ListNode second=list2;
        ListNode res=new ListNode(-1);
        ListNode tail=res;
        while(first!=null&&second!=null){
            if(first.val<=second.val){
                tail.next=first;
                first=first.next;
            }else{
                tail.next=second;
                second=second.next;
            }
            tail=tail.next;
        }
        if(first!=null)tail.next=first;
        else tail.next=second;

        return res.next;
    }
}