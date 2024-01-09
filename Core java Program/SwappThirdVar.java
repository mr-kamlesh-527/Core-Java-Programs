import java.util.Scanner;
public class SwappThirdVar{
	//swapping using third variable 
  public static void main(String [] args){
  int a, b, temp=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first Number : ");
    a = sc.nextInt();
    System.out.println("Enter Second Number : ");
    b = sc.nextInt();
    System.out.println("Before Swapping : A = "+a+" and B = "+b);
    temp=a;
    a=b;
    b=temp;
    System.out.println("After Swapping : A = "+a+" and B = "+b); 
  }
}
