class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hk=new HashMap<>();
        for(int i:nums2){
            hk.put(i,hk.getOrDefault(i,0)+1);
        }

        ArrayList<Integer>result=new ArrayList<>();
        for(int i:nums1){
            if(hk.containsKey(i)){
                result.add(i);
                hk.remove(i);
            }
        }
        int[] result1=new int[result.size()];
        for(int j=0;j<result.size();j++){
            result1[j]=result.get(j);
        }
        return result1;
    }
}
