class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>List=new HashSet<>();
        for(int i:nums){
            if(List.contains(i)){
                return i;
            }
            else{
                List.add(i);
            }
      
    }
      return 1;
}
}
