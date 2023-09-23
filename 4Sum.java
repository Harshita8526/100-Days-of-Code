class Solution {
    public List<List<Integer>> fourSum(int[] a, int t) {
        Arrays.sort(a);
        int n =a.length;
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<n-3;i++){
            if(i>0 && a[i]==a[i-1]) continue;
            for(int j = i+1;j<n;j++){
                if(j>i+1 && a[j]==a[j-1]) continue;
                int k=j+1;
                int l= n-1;
                while(k<l){
                    long x=a[i];
                    x+=a[j];
                    x+=a[k];
                    x+=a[l];
                    if( x== t){
                        List<Integer> al = new ArrayList<>();
                        al.add(a[i]);
                        al.add(a[j]);
                        al.add(a[k]);
                        al.add(a[l]);
                        ans.add(al);
                        
                        k++;
                        l--;
                        while(k<l && a[k]==a[k-1]) k++;
                        while(k<l && a[l]==a[l+1]) l--;
                    }
                    else if( x < t) k++;
                    else l--;
                }
            }
        }
        return ans;
    }
}
