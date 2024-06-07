class Solution {
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int[] arr = new int[maxx + 2];

        for (int i = 0; i < n; i++) {
            arr[l[i]] += 1;
            arr[r[i] + 1] -= 1;
        }

        int maxCount = Integer.MIN_VALUE;
        int maxValue = 0;
        int current = 0;

        for (int i = 0; i <= maxx; i++) {
            current += arr[i];
            if (current > maxCount) {
                maxCount = current;
                maxValue = i;
            }
        }

        return maxValue;
    }
}
