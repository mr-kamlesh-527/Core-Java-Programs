import java.util.Scanner;
public class PerfectNumber {
	public static void main(String args[]) {
		//perfect number 6 ---1,2,3,4,5 but divisible by 1, 2, 3 and 1+2+3==6 so six is perfect number
		//the factor addition is equal to given number then it is an perfect number
		// 6, 28, 49633550336
		int n;
		int sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum = sum+i;
			}
		}
		if(n==sum) {
			System.out.println(n+" Is Perfect Number");
		}
		else {
			System.out.println(n+" Is not Perfect Number");
		}
	}

}
