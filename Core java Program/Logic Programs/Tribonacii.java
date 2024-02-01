import java.util.Scanner;
public class Tribonacii {
	public static void main(String[] args) {
		int a=0, b=1, c=2, term,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		term = sc.nextInt();
		System.out.print("The Tribonacii Series of given Term is = ");
		for(int i=1; i<=term; i++) {
			System.out.print(a+" ");
			d=a+b+c;
			a=b;
			b=c;
			c=d;
		}
	}
}
