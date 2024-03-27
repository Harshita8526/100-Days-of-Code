class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            int t = 1;
            for(int j=i;j<nums.length;j++)
            {
                t*=nums[j];
                if(t<k) ans++;
                else break;
            }
        }

        return ans;
    }
}
