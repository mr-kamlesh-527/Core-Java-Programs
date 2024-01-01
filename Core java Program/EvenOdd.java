import java.util.*;
class EvenOdd {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        n = sc.nextInt();
            if(n%2==0){
                System.out.println(n+" is Even Number.....!");
            }
            else{
                System.out.println(n+" is Odd Number...!");
            }
    }
}
