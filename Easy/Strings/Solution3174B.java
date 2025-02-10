import java.util.HashMap;

public class Solution3174B {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
    return new int[]{};
    }
    public static void main(String args[]) {
        int[] a = { 1, 4, 5, 11, 12 };
        int target = 9;
        for (int x : twoSum(a, target))
            System.out.print(x + " ");
    }
}
