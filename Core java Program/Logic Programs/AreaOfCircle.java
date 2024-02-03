import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
	int radius;
	double pi = 3.14;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Radius : ");
	radius =sc.nextInt();
	double areaofcircle=pi*radius*radius;
	System.out.println("Area of Circle = "+areaofcircle);
	
	}
}
