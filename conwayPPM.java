import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args) {
        //acquisitions
        double initial = 2;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Generate numbers under: ");
        int stopper = scan.nextInt();
        int stoppercheck = 0;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        //machine loop
        System.out.println("start");
           while (stoppercheck+1<stopper)
            {
                if(((initial * 17) / 91) % 1 == 0)
                {
                    initial = (initial * 17) / 91;
                    System.out.println("Step: 1");
                } else if(((initial * 78) / 85) % 1 == 0)
                {
                    initial = (initial * 78) / 85;
                    System.out.println("Step: 2");
                } else if(((initial * 19) / 51) % 1 == 0)
                {
                    initial = (initial * 19) / 51;
                    System.out.println("Step: 3");
                } else if(((initial * 23) / 38) % 1 == 0)
                {
                    initial = (initial * 23) / 38;
                    System.out.println("Step: 4");
                } else if(((initial * 29) / 33) % 1 == 0)
                {
                    initial = (initial * 29) / 33;
                    System.out.println("Step: 5");
                } else if(((initial * 77) / 29) % 1 == 0)
                {
                    initial = (initial * 77) / 29;
                    System.out.println("Step: 6");
                } else if(((initial * 95) / 23) % 1 == 0)
                {
                    initial = (initial * 95) / 23;
                    System.out.println("Step: 7");
                } else if(((initial * 77) / 19) % 1 ==0)
                {
                    initial = (initial * 77) / 19;
                    System.out.println("Step: 8");
                } else if(((initial * 1) / 17) % 1 == 0)
                {
                    initial = initial / 17;
                    System.out.println("Step: 9");
                } else if(((initial * 11) / 13) % 1 == 0)
                {
                    initial = (initial * 11) / 13;
                    System.out.println("Step: 10");
                } else if(((initial * 13) / 11) % 1 == 0)
                {
                    initial = (initial * 13) / 11;
                    System.out.println("Step: 11");
                } else if(((initial * 15) / 14) % 1 == 0)
                {
                    initial = (initial * 15) / 14;
                    System.out.println("Step: 12");
                } else if(((initial * 15) / 2) % 1 ==0)
                {
                    initial = (initial * 15) / 2;
                    System.out.println("Step: 13");
                } else if(((initial * 55) / 1) % 1 ==0)
                {
                    initial = (initial * 55);
                    System.out.println("Step: 14");
                }
                count++;
                //print statements
                int output = (int)initial;
                System.out.println("--------------------\nOutput: " + output + "\nRevolution: " + count);
                //pow2 checker
                for (int o = 0; o<output; o++)
                    {
                        if(Math.pow(2.0, o) == output)
                    {
                        System.out.println("power of 2: " + o);
                        primes.add(o);
                        stoppercheck = o;
                        
                    }
                }
            }
            System.out.println("The prime numbers under " + stopper + " are: " + primes);
    }
    }
