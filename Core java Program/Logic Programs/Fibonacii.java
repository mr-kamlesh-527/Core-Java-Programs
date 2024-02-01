import java.util.Scanner;

public class Fibonacii {
	public static void main(String[] args) {
		int a=0, b=1, c=0, term;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		term = sc.nextInt();
		System.out.print("The Fibonacii Series of given Term is = ");
		for(int i=1; i<=term; i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}

