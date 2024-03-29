class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] arr1 = new int[1001];
        for(int i = 0;i<arr.length;i++){
            arr1[arr[i]]++;
            arr1[target[i]]--;
        }
        for(int i = 0;i< 1001;i++)
            if(arr1[i] != 0)
                return false;
        return true;
    }
}
