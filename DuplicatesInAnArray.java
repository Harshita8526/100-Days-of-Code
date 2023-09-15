class HelloWorld {
    public static void main(String[] args) {
        int arr[]={3,3,4,4,2};
        HashSet sh=new HashSet();

        for(int i:arr){
            if (sh.contains(i)) {
                System.out.print(i+" ");

            }
            else{
                sh.add(i);
            }
        }
    }
}
