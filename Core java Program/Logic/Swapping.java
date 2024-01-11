import java.util.Scanner;
public class Swapping {
	//swapping without using third variable
	public static void main(String[] args) {
		int a, b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A : ");
		a = sc.nextInt();
		System.out.println("Enter Value of B : ");
		b = sc.nextInt();
		System.out.println("Before Swapping A = "+a+" & B = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping A = "+a+" & B = "+b);

	}

}
