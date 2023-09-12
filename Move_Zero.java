class Solution {
    public void moveZeroes(int[] nums) {
        int []a=new int[nums.length];
        int j=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt++;
                continue;
            }
            else{
                a[j]=nums[i];
                j++;
            }
        }

        for(int k=0;k<nums.length;k++){
            nums[k]=a[k];
        }
        for(int k=nums.length;k<cnt;k++){
            nums[k]=0;
        }
    }
}
