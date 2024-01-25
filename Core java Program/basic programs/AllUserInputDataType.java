import java.util.Scanner;
class AllUserInputDataType{
    public static void main(String args[]){
       
       //datatype declaration 
        int i;
        float f;
        double d;
        Boolean b;
        String s;
        
        //Integer Input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer:");
        i = sc.nextInt();
        System.out.println("You entered integer :"+i+"\n");
       
        //Float Input
        System.out.print("Enter an float:");
        f = sc.nextFloat();
        System.out.println("You entered float :"+f+"\n");
        
        //Double Input
        System.out.print("Enter an double:");
        d = sc.nextDouble();
        System.out.println("You entered double:"+d+"\n");
       
        //String Input
        System.out.print("Enter a string :");
        s = sc.nextLine();
        System.out.println("You entered string :" +s+"\n");
       
        //Boolean Input
        System.out.print("Enter an boolean:");
        b = sc.nextBoolean();
        if(b==true){;
        System.out.println("You entered boolean true \n");
        }
        else{
            System.out.println("You entered boolean false \n");
        }

        



    }
}