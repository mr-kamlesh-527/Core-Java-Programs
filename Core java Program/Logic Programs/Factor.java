import java.util.Scanner;
public class Factor {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		a = sc.nextInt();
		System.out.print("Factor's of "+a+" are : ");
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				System.out.print(" "+i);
			}
		}
	}
}