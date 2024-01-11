import java.util.Scanner;
public class Vowel{
  	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any charector : ");
		char n=sc.next().charAt(0);
		if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u' ) {
			System.out.println("The charector is vowel ");
		}
		else if(n=='A' || n=='E' || n=='I' || n=='O' || n=='U' ) {
			System.out.println("The charector is vowel ");
		}
		else {
			System.out.println("The charector is an Consonent");
		}
	}
}
