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
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        ListNode res=null;
        for(int i=0;i<n;i++){
            if(res==null){
                res=lists[i];
            }else{
                res=merge(res,lists[i]);
            }
        }
        return res;
    }
    ListNode merge(ListNode res,ListNode temp){
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(res!=null&&temp!=null){
            if(res.val<temp.val){
                curr.next=res;
                res=res.next;
                curr=curr.next;
            }else{
                curr.next=temp;
                temp=temp.next;
                curr=curr.next;
            }
        }
        if(res != null) curr.next = res;
        if(temp != null) curr.next = temp;
        return dummy.next;
    }
}
