class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> common = new HashSet<>();
        for(int a: nums1){
            common.add(a);
        }
        for(int b: nums2){
            if(common.contains(b)){
                return b;
            }
        }
        return -1;
    }
}
