import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		int length;
		int breath;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length : ");
		length =sc.nextInt();
		System.out.println("Enter breath : ");
		breath = sc.nextInt();
		int areaofrectangle=length*breath;
		System.out.println("Area Of Rectangle is = "+areaofrectangle);
	}
}
