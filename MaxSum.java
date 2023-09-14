public class MaxSum{
    public static void main(String[] args) {
        int arr[]={1,2,3,-2,5};
        int cur_sum=0;
        int max_sum=0;

        for(int i=0;i<arr.length;i++){
            cur_sum=cur_sum+arr[i];
            if(cur_sum>0) {
                max_sum = cur_sum;
            }
            if(cur_sum<0){
                cur_sum=0;
            }

        }
        System.out.println("Sum is "+max_sum);
    }
}
