class Solution {
    public String pattern(int[][] arr) {
        // Code here
        if (arr.length <= 1) {
            return "0 R";
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(isRowPalindrome(arr[i])) {
                return ""+ i+ " R";
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(isColumnPalindrome(arr, i)) {
                return ""+ i+ " C";
            }
        }
        
        return "-1";
        
    }
    
    public Boolean isRowPalindrome(int [] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            if(arr[i] != arr[(arr.length - 1) - i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public Boolean isColumnPalindrome(int[][] arr, int col) {
        for(int i = 0; i < arr.length / 2; i++) {
            if(arr[i][col] != arr[(arr.length  - 1) - i][col]) {
                return false;
            }
        }
        
        return true;
    }
}
