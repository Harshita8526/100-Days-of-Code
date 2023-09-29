class Solution {
    int start = 0; 
    int max = 0;   

    public String longestPalindrome(String s) {
        if(s.length() < 2)
            return s; 

        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++){
            
            findPalindrome(chars, i, i); 
            findPalindrome(chars, i, i+1); 
        }
         return s.substring(start, start + max);
    }

    private void findPalindrome(char[] chars, int j, int k){
        while( j >= 0 && k < chars.length && chars[j] == chars[k]){
            j--;
            k++;
        }
        
   
        if(max < k - j - 1){
            max = k - j -1; 
            start = j + 1;     
        }
    }
}
