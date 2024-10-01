class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        String str1 = "";
        String str2 = "";
        while(first!=null){
            str1+=first.data;
            first = first.next;
        }
        while(second!=null){
            str2+=second.data;
            second = second.next;
        }
        long res = Long.parseLong(str1)*Long.parseLong(str2);
        return res%1000000007;
    }
}
