import java.util.*;
class SumNatural {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        for(int i =0; i<=n; i++){
            sum = i+sum;
        }
        System.out.println("Sum of natural number is = "+sum);
    }
}