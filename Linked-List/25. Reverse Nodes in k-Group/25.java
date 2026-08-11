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

    public ListNode rev(int k, ListNode head){
        int t=k;
        ListNode prev=null;
        ListNode curr=head;
        while(k-->0){
              ListNode nextt= curr.next;
              curr.next=prev;
              prev=curr;
              curr=nextt;  
        }
       
        return prev;
    }
    public ListNode rec(ListNode head, int k){
        
        ListNode check=head;
        int count=0;

        while(check!=null && count<k){
            check=check.next;
            count++;
        }
        if(count<k){
            return head;
        }

        ListNode newhead= rev(k,head);

        ListNode tail= newhead;
        while(tail.next!=null){
            tail=tail.next;
        }
        head.next=rec(check,k);

        return newhead;

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        return rec(head,k);
    }
}