

/*Complete the function below*/
class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        int sum1 = 0, sum2 = 0;
        for (int num : arr1) {
            sum1 += num;
        }
        for (int num : arr2) {
            sum2 += num;
        }
        int index = bsearch(arr1,sum1-sum2);
        return index;
    }
    
    public int bsearch(int arr[], int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1; 
            } else {
                s = mid + 1; 
            }
        }
        return -1; 
    }

}
