import java.util.Scanner;
class SieveOfEratosthenes
{
    void sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize all as true. If I is ever not prime it will be false, otherwise turn to true. 
        int count = 0;
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
        {
            count++;
            prime[i] = true;
        }
         
        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                for(int i = p*p; i <= n; i += p)
                {
                    count++;
                    prime[i] = false;
                }
            }
        }
         
        // Print prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
         System.out.println("\nThis took " + count + " steps");
    }  
     
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to generate primes under: ");
        int n = scan.nextInt();
        System.out.println("Primes under " + n + ":");
        SieveOfEratosthenes g = new SieveOfEratosthenes();
        g.sieveOfEratosthenes(n);
    }
}
 
