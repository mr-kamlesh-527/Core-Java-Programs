public class Duplicate {
	public static void main(String[] args) {
		int array[]= {10, 20, 30, 40, 10, 50, 60 , 10,20,100,20,200,20};
		System.out.println("Duplicate element in given array : ");
		for(int i=0; i<array.length;   i++) {
			for(int j=i+1; j<=array.length-1; j++) {
				if(array[i]==array[j]) {
					System.out.println("  "+array[j]);
				}
			}
		}
	}
}
