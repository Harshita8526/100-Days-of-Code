class Solution {
    public int lengthOfLastWord(String s) {
        String str[]=s.split(" ");
        String p=str[str.length-1];
        return p.length();
    }
}
