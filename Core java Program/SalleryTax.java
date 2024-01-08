import java.util.Scanner;

public class SalleryTax {
	public static void main(String[] args) {
		int sallery;
		double tax;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sallery : ");
		sallery = sc.nextInt();
		if(sallery<=10000) {
			System.out.println(sallery+" No tax on this sallery ");
		}
		else if(sallery>10000 &&sallery<=100000) {
			tax = sallery*0.10;
			System.out.println(sallery+" Your Tax's 10% is  = "+tax);
		}
		else {
			tax = sallery*0.20;
			System.out.println(sallery+" Your tax's 20% is = "+tax);
		}
	}

}
