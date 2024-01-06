public class GreatestThree {
	public static void main(String[] args) {
		int a = 20; 
		int b = 10; 
		int c = 30;
		if(a>b) {
			if(a>c)
				System.out.println("The Greater is "+a);
			else
				System.out.println("The Greater is "+c);
		}
		else {
			if(b>c)
				System.out.println("The Greater is "+b);
			else
				System.out.println("The Greater is "+c);
		}
	}
}
