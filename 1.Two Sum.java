
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0,b=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    flag=true;
                    a=i;
                    b=j;
                    break;
                    
                }
            }
            if(flag)
            {
                break;
            }
        }
        if(flag)
        {
            return new int[]{a,b};
        }
        else
        {
            return new int[]{};
        }
     
    }
}
//java

