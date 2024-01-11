import java.util.Scanner;

public class Multiplication {
	public static void main(String argsd[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Multiplication of "+n+" is = ");
		for(int i=1; i<=10; i++) {
			System.out.println("		  "+n+"*"+i+" = "+n*i);
		}
	}
}
