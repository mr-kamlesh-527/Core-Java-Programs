import java.util.*;
public class ReverseNumber {  
public static void main(String[]args)   
{  
int number, reverse = 0,c; 
Scanner sc = new Scanner(System.in);
System.out.print("Enter a Number : ");
number= sc.nextInt();
c=number;
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of "+c+" is: " + reverse);  
}  
}  