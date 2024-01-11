import java.util.*;

public class Factorial {
public static void main(String [] args){
int n, fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number : ");
n = sc. nextInt();

for(int i=1; i<=n; i++){
      fact = i*fact;
}
System.out.println("factorial of "+n+" is = "+ fact);
}
}