import java.util.Scanner;
public class Main 

{
    public static void main(String[] args) {
        int initial = 2;
        int count = 0;
        int limit = 0;
        System.out.println("start");
        
        while(limit<=100);
        {
            System.out.println("Machine start");
            
            if(((initial * 17) / 91) % 1 == 0)
            {
                initial = (initial * 17) / 91;
            } else if (((initial * 78) / 85) % 1 == 0)
            {
                initial = (initial * 78) / 85;
            } else if (((initial * 19) / 51) % 1 == 0)
            {
                initial = (initial * 19) / 51;
            } else if (((initial * 23) / 38) % 1 == 0)
            {
                initial = (initial * 23) / 38;
            } else if (((initial * 29) / 33) % 1 == 0)
            {
                initial = (initial * 29) / 33;
            } else if (((initial * 77) / 29) % 1 == 0)
            {
                initial = (initial * 77) / 29;
            } else if (((initial * 95) / 23) % 1 == 0)
            {
                initial = (initial * 95) / 23;
            } else if (((initial * 77) / 19) % 1 ==0)
            {
                initial = (initial * 77) / 19;
            } else if (((initial * 1) / 17) % 1 == 0)
            {
                initial = initial / 17;
            } else if (((initial * 11) / 13) % 1 == 0)
            {
                initial = (initial * 11) / 13;
            } else if (((initial * 13) / 11) % 1 == 0)
            {
                initial = (initial * 11) / 13;
            } else if (((initial * 15) / 14) % 1 == 0)
            {
                initial = (initial * 15) / 14;
            } else if (((initial * 15) / 2) % 1 ==0)
            {
                initial = (initial * 15) / 2;
            } else if (((initial * 55) / 1) % 1 ==0)
            {
                initial = (initial * 55);
            }
            System.out.println(initial);
            limit = 100;
        }
        
    }
}
