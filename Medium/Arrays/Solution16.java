package Medium.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); 
        int max=Integer.MAX_VALUE;
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
                if(i>0 && nums[i]==nums[i-1])
                    continue;
                int j=i+1;
                int k=nums.length-1;
                while(j<k)
                {
                    if(nums[i]+nums[j]+nums[k]==target)
                        return target;
                    if(max>Math.abs((nums[i]+nums[j]+nums[k])-target))
                    {
                        max=Math.abs((nums[i]+nums[j]+nums[k])-target);
                        x=nums[i]+nums[j]+nums[k];
                    }
                    if(nums[i]+nums[j]+nums[k]<target)
                        j++;
                    else if(nums[i]+nums[j]+nums[k]>target)
                        k--;
                    else
                        return target;
                }
        } 
        return x;
    }
}