public class Array1 {

    public static void main(String[] args) {
        //static array First type
        int array[] = {10,20,30,40,50,60,70,80};
        System.out.print("print perticular array : "+array[0]);
        
        System.out.print("\nPrint the array using For Each loop : ");
        for (int i : array) {
            System.out.print(i+" ");
        }

        //static array in second type
        int[] a = new int[5];
        a[0] = 9;
        a[1] = 8;
        a[2] = 7;
        a[3] = 6;
        a[4] = 5;
        System.out.print("\n\nPrint the array using For loop : ");
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }

        System.out.print("\nPrint the array using For Each loop : ");
        for (int i : a) {
            System.out.print(i+" ");
        }

    }
}
