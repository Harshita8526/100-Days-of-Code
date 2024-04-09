class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int result=0;
        for(int i=0;i<tickets.length;i++){
            if(tickets[i]<tickets[k]) result+=tickets[i];
            else if(i<=k&&tickets[i]>=tickets[k]) result+=(tickets[k]);
            else result+=tickets[k]-1;
        }
        return result;
    }
}
