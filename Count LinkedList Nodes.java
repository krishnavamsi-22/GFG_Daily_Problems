class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int count = 0;
        Node temp = head;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        return count+1;
    }
}
