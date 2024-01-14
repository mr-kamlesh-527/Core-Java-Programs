import java.util.Scanner;
public class Palindrome {
	public static void main(String args[]) {
		int n,c,r;
		int s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		c=n;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s) {
			System.out.println(c+" Is Palindrome Number");
		}
		else {
			System.out.println(c+" is Not Palindrome Number");
		}
	}
}

