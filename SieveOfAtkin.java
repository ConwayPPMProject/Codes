import java.util.Arrays;
import java.util.Scanner;

public class SieveOfAtkin {
//private static int limit = 1000;
//private static boolean[] sieve = new boolean[limit + 1];
//private static int limitSqrt = (int)Math.sqrt((double)limit);
private static int count = 0;

public static void main(String[] args) {
    // initialize array
    System.out.println("Enter number to generate primes under");
    Scanner scan = new Scanner(System.in);
    int limit = scan.nextInt();
    boolean[] sieve = new boolean[limit + 1];
    int limitSqrt = (int)Math.sqrt((double)limit);
     
    Arrays.fill(sieve, false);
    sieve[0] = false;
    sieve[1] = false;
    sieve[2] = true;
    sieve[3] = true;

    // loop through all possible integer values for x and y up to the square root of the max prime for the sieve
    for (int x = 1; x <= limitSqrt; x++) {
        for (int y = 1; y <= limitSqrt; y++) {
            count++;
            // first quadratic using m = 12 and r in R1 = {r : 1, 5}
            int n = (4 * x * x) + (y * y);
            if (n <= limit && (n % 12 == 1 || n % 12 == 5)) {
                sieve[n] = !sieve[n];
            }
            // second quadratic using m = 12 and r in R2 = {r : 7}
            n = (3 * x * x) + (y * y);
            if (n <= limit && (n % 12 == 7)) {
                sieve[n] = !sieve[n];
            }
            // third quadratic using m = 12 and r in R3 = {r : 11}
            n = (3 * x * x) - (y * y);
            if (x > y && n <= limit && (n % 12 == 11)) {
                sieve[n] = !sieve[n];
            }
        }
    }
    for (int n = 5; n <= limitSqrt; n++) {
        count++;
        if (sieve[n]) {
            int x = n * n;
            for (int i = x; i <= limit; i += x) {
                sieve[i] = false;
            } 
        }
    } 
    for (int i = 0, j = 0; i <= limit; i++) {
        count++;
        if (sieve[i]) {
            System.out.printf("%,8d", i);
            if (++j % 10 == 0) {
                System.out.println();
            } // end if
            if (j % 100 == 0) {
                System.out.println();
            } 
        } 
    }
    System.out.println("\nThis took " + count + " steps.");
}
}