class PrimeBetTwoNumber {
 
    // Function to print all the
    // prime numbers till N
    static void prime_N(int N)
    {
        // Printing display message
        System.out.println(
            "All the Prime numbers within 1 and " + N
            + " are:");
 
        // Using for loop for traversing all
        // the numbers from 1 to N
        for (x = 1; x <= N; x++) {
 
            // Omit 0 and 1 as they are
            // neither prime nor composite
            if (x == 1 || x == 0)
                continue;
 
            // Using flag variable to check
            // if x is prime or not
            flg = 1;
 
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
 
            // If flag is 1 then x is prime but
            // if flag is 0 then x is not prime
            if (flg == 1)
                System.out.print(x + " ");
        }
    }
 
    // The Driver code
    public static void main(String[] args)
    {
        int N = 45;
 
        prime_N(N);
    }
}