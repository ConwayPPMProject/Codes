//scanner to get input, will tell when to stop
import java.util.Scanner;
//arraylist to hold output of the machine.
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args) {
        //acquisitions
        double initial = 2;
        int count = 0;
        //asks user for number under which to generate primes for
        Scanner scan = new Scanner(System.in);
        System.out.println("Generate numbers under: ");
        //these variables tell the machine when to stop
        int stopper = scan.nextInt();
        int stoppercheck = 0;
        //this stores the primes generated
        ArrayList<Integer> primes = new ArrayList<Integer>();
        //machine loop
        System.out.println("start");
        //this stops the machine when it hits the prime before the inputted number
           while (stoppercheck+1<stopper)
            {
               //these statements make it so that if the operations produce an integer, it sets initial equal to it as well as prints what step it happened on. 
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
               //this counts the revolutions 
               count++;
                //print statements
                int output = (int)initial;
                System.out.println("--------------------\nOutput: " + output + "\nRevolution: " + count);
                //pow2 checker
                for (int o = 0; o<output; o++)
                    //checks 2^every number under the machine's output. If it equals an integer it means that 2 to the output is equal to the machine output. This output will be the prime number. 
                    {
                        if(Math.pow(2.0, o) == output)
                    {
                        //this prints the power of 2, which is the prime number, for that step. It also adds the prime number to the arraylist from before. 
                        System.out.println("power of 2: " + o);
                        primes.add(o);
                        stoppercheck = o;
                        
                    }
                }
            }
        //final print statement    
        System.out.println("The prime numbers under " + stopper + " are: " + primes);
    }
    }
