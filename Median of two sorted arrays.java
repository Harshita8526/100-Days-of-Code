class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n1=nums1.length+nums2.length;
        int [] a= new int[n1];
        for(int i=0;i<nums1.length;i++){
            a[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            a[nums1.length+i]=nums2[i];
        }

        Arrays.sort(a);
        double res=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(n%2==0){
                int m=n/2;
                int op=a[m-1]+a[m];
                res=op/2.0;
            }
            else{
                int m=n/2;
                int op=a[m];
                res=op;
            }
        }
        return res;
    }
}
