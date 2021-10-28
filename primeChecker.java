
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
         int num, i, count=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter integer:");
        int initial = scan.nextInt();
        int countb = 0;
       for(i=2; i<=Math.sqrt(initial); i++)
        {
            countb++;
            
            if(initial%i == 0)
            {
                count++;
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
        System.out.println(countb);
        
    }
}
