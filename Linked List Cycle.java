public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        if(head==null) return false;
        if(head.next==null) return false;
        while(f!=null){
            if(s==null) return false;
            s=s.next;
            if(f.next==null) return false;
            f=f.next.next;

             if(s==f){
            return true;
        }
        }
       
        return false;
    }
}
