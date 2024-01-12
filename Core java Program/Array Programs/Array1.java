public class Array1{
    public static void main(String[] args) {
        // first tiype of array declaration [static array]
        int array[]={10,20,30,40,50};
        System.out.println(array);

        //second type of array declaration [static array]
        int a[] =new int[7];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        a[5]=60;
        a[6]=70;

        System.out.print("for loop output : ");
        for(int i=0; i<7; i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nfor each loop output : ");
        for(int b:a){
            System.out.print(b+" ");
        }

    }
}
