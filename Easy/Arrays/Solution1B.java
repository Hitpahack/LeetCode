package Easy.Arrays;

class Solution {
    public int[] twoSum(int[] arr, int target) {
        int a[] = new int[2];
        a[0] = -1;
        a[1] = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }
        }
        return a;
    }
}