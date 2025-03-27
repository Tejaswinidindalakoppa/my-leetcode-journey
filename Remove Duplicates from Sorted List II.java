class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp=head;
        ListNode i;
        HashMap<Integer,Integer> hm=new HashMap<>();
    while(tmp!=null){
        hm.put(tmp.val,hm.getOrDefault(tmp.val,0)+1);
    tmp=tmp.next;
    }
    ListNode dum=new ListNode(0);
    dum.next=head;
    ListNode curr=dum;
    while(curr.next!=null){
        
        if(hm.get(curr.next.val)>1){
        curr.next=curr.next.next;
        }
        else
        curr=curr.next;
    }
    return dum.next;
    }
}