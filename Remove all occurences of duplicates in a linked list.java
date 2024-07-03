class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        Node dummy=new Node(-1);
        dummy.next=head;
        Node curr=head,prev=dummy;
        while(curr!=null)
        {
            if(curr.next==null) break;
            if(curr.next!=null && curr.data!=curr.next.data)
            {
                prev=curr;
                curr=curr.next;
                continue;
            }
            while(curr.next!=null && curr.data==curr.next.data) curr=curr.next;
            prev.next=curr.next;
            curr=prev.next;
        }
        return dummy.next;
    }
}
