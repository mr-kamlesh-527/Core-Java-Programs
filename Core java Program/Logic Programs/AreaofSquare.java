import java.util.Scanner;
public class AreaofSquare {
	public static void main(String[] args) {
		int side;
		double areaofsquare;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Side : ");
		side = sc.nextInt();
		areaofsquare = side*side;
		System.out.println("AreaofSquare is = "+areaofsquare);
	}
}
