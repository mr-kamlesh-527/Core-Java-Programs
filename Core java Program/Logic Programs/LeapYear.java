import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year : ");
		year = sc.nextInt();
		if(year%100==0 && year%400==0 ) {
			System.out.println(year + " it is an centurily as well as yearly leap year.....");
		}
		else if(year%100!=0 && year%4==0) {
			System.out.println(year+" it is an yearly leap year....");
		}
		else {
			System.out.println(year+" is not an leap year....");
		}
		
	}
}
