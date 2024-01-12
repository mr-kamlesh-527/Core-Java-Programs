import java.util.Scanner;

public class Array2{
    public static void main(String[] args) {
      //this is dynamic array declaration
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        n = sc.nextInt();
        int a[] =new int[n];
      
        System.out.print("Enter Array Elements : ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("\nArray Elements  : ");
        for(int b:a){
            System.out.print(b+" ");
        }

    }
}
