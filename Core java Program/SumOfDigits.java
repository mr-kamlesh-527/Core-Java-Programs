import java.util.Scanner;
public class SumOfDigits{
  public static void main(String [] args){
    int n,sum=0,rem;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any Number : ");
    n = sc.nextInt();
    while(n>0){
      rem = n%10;
      sum = rem+sum;
      n = n/10;
    }
    System.out.println("Sum Of Digit's is = "+sum);
  }
}
