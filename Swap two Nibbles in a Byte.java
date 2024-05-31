class Solution {
    static int swapNibbles(int n) {
        // code here
     String num = Integer.toBinaryString(n);
        
        StringBuilder paddedNum = new StringBuilder(num);
        while (paddedNum.length() < 8) {
            paddedNum.insert(0, '0');
        }
        
        String temp = paddedNum.substring(0, 4);   
        String temp1 = paddedNum.substring(4, 8);  
    
        String res = temp1 + temp;
        int number = Integer.parseInt(res, 2);
        
        return number;
    }
}
