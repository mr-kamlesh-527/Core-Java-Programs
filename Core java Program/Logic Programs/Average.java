import java.util.Scanner;
public class Average{
  public static void main(String args[]){
    int a,b,c,d,e;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter marks of Five Subjects : ");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    int total=a+b+c+d+e;
    int average = total/5;
    System.out.println("Total marks = "+total);
    System.out.println("Average    =  "+average);
  }
}
