import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int n=10;//we can also take user input here
        int fact=1;
        for(int i=10;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);

    }
}
