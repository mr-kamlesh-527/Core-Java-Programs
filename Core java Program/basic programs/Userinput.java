import java.util.Scanner;
public class Userinput {
    public static void main(String [] args){
        // Get user input from the keyboard
        String name;
        System.out.print("Enter your name: "); 
        Scanner  sc= new Scanner(System.in);
        name =sc.nextLine();
        System.out.println("\nHello, " + name);
        int age;
        age = sc.nextInt();
        System.out.print("Enter your age: ");
        System.out.println("You are " + age + " years old.");
    }
}
