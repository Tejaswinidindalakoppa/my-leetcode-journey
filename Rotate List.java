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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){//handling edge cases for empty list and only one node
            return head;
        }
        ListNode temp=head;
        int size=0;
        while(temp!=null){//calculating length
            size++;
            temp=temp.next;
        }
        k=k%size;//kth is same as k%size th 
        if(k==0){
            return head;
        }
        ListNode prev=null;//pointer to store the node before the start node i.e. node before  kth node from start so that it can be pointed to null once the list starting from the kth node from last is removed and inserted at the front 
        ListNode start=head;//to find the kth node from end
        ListNode end=head;//to find the end node
        for(int i=1;i<k;i++){//making the end to point at the kth node from start so that on traversing the list when it points to end node start node points to the kth node from end
           end=end.next;
        }
        while(end.next!=null){//making end to point at end node and start to point at the kth node from end
            prev=start;
            start=start.next;
            end=end.next;
        }
        prev.next=null;//setting the node previous to the kth node to null to make it the end node
        end.next=head;//making the last node to point at the start
        head=start;//making the head to point at the start
        return head;
    }
}