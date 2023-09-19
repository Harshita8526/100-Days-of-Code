class Solution {
    public boolean isPalindrome(int x) {
        int rem;
        int r=0;
        int p=x;
        while(x>0){
         rem=x%10;
         r=r*10+rem;
         x=x/10;
        }
        if(r==p){
            return true;
        }
       
            return false;
        
    }
}
