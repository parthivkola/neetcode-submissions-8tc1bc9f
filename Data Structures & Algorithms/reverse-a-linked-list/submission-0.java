class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode first=head;
        ListNode second=head.next;
        while(second!=null){
            if(first==head){
                first.next=null;
            }else{
                ListNode temp=first;
            }
            ListNode temp=first;
            first=second;
            second=second.next;
            first.next=temp;
        }
        head=first;
        return head;
    }
}
