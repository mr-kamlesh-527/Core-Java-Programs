import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int result = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println("Enter a Power : ");
		int p = sc.nextInt();
		for(int i=1; i<=p; i++) {
			result = n*result;
		}
		System.out.println("The power of "+n+" is "+result);
	}

}
