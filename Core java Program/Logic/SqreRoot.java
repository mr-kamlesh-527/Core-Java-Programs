import java.util.Scanner;
public class SqreRoot {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Number : ");
		n = sc.nextInt();
		double m = Math.sqrt(n);
		System.out.println("Square root of "+n+" is "+m);
		
	}
}
