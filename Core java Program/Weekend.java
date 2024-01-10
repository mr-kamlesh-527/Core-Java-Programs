import java.util.Scanner;
public class Weekend {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Weekday Number : ");
		n = sc.nextInt();
		switch(n) {
		case 0: System.out.println("Sunday");
		break;
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thirsday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		default: System.out.println("Invalid choice....! ( Please Enter between 0-6 )");
		break;
		}
	}
}
