class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int currMax=1;
        int currMin=1;

        for(int i=0;i<nums.length;i++){
            int tmp= currMax*nums[i];
            currMax = max(tmp, currMin*nums[i], nums[i]);
            currMin = min(tmp, currMin*nums[i], nums[i]);
            max= Math.max(max,currMax);
        }
        return max;
    }

     private int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    private int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
