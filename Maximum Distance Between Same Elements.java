

// your task is to complete this function
class Solution
{
    int maxDistance(int arr[], int n)
    {
	 if (arr == null || n < 2) return 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int dis = i - map.get(arr[i]);
                max = Math.max(max, dis);
            } else {
                map.put(arr[i], i);
            }
        }
        return max;
    }
}
