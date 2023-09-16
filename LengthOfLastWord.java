class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        String h=arr[arr.length-1];
        return h.length();
    }
}
