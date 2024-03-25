class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> result=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                result.add(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        return result;
    }
}
