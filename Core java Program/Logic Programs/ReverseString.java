import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name to Reverse : ");
		name =sc.nextLine();
		String rev = "";
		int len = name.length();
		for(int i=len-1; i>=0; i--) {
			rev = rev+name.charAt(i);
		}
		System.out.println("The reverse string is  : "+rev);
	}
}
