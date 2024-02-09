import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		int a,b,c, sp;
		double areaoftriangle;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Triangle sides : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		//sp== semiparameter
		sp = (a+b+c)/2;
		areaoftriangle = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		System.out.println("Area Of Triangle = "+areaoftriangle);
	}
}

