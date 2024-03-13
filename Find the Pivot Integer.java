class Solution {
    public int pivotInteger(int n) {
        int s_sum=n*(n+1)/2,r_sum=0;

        while(s_sum>r_sum){
            r_sum+=n;
            if(s_sum==r_sum) return n;
            s_sum-=n;
            n--;
        }
        return -1;
    }
}
