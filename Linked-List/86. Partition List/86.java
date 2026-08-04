
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallNode= new ListNode(0);
        ListNode start=smallNode;
        ListNode left=smallNode;
        ListNode bigNode= new ListNode(0);
        ListNode mid= bigNode;
        ListNode right=bigNode;
        ListNode temp=head;

        while(temp!=null){
            if(temp.val<x){
                left.next=temp;
                left=left.next;
            }else{
                right.next=temp;
                right=right.next;
            }
            temp=temp.next;

        }
        right.next=null;
        left.next=mid.next;
        return start.next;
    }
}