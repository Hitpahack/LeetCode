package Medium.Arrays;

class Solution11 {
    public int maxArea(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int max = 0;
        while (i < j) {
            int x = 0;
            if (nums[i] < nums[j]) {
                x = nums[i] * (j - i);
                i++;
            } else if (nums[i] >= nums[j]) {
                x = nums[j] * (j - i);
                j--;
            }
            if (max < x) {
                max = x;
            }
        }
        return max;

    }
}
