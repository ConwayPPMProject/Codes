import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
         int num, i, count=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter integer:");
        double initial = scan.nextDouble();
        int countb = 0;
       for(i=2; i<=Math.sqrt(initial); i++)
        {
            countb++;
            
            if(initial%i == 0)
            {
                count++;
                double factor2 = initial/i;
                System.out.println("Factors: " + i + " and " + factor2);
                break;
            }
        }
        if(count == 0)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not prime");
        }
        System.out.println("The amount of steps it took to compute this was " + countb);
        
    }
}
