class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        goal=goal+goal;
        return goal.contains(s);
    }
}
