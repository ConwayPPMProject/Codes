import java.util.Arrays;
import java.util.ArrayList;
public class Main
{
 
    public static void main(String[] args) {
    ArrayList <Integer> master = new ArrayList<Integer>();
    ArrayList <Integer> mult2 = new ArrayList<Integer>();
    ArrayList <Integer> mult3 = new ArrayList<Integer>();
    ArrayList <Integer> mult5 = new ArrayList<Integer>();
    ArrayList <Integer> mult7 = new ArrayList<Integer>();
    int stepCounter = 0;
    //1-100 Arrays
    for(int x=0; x < 100; x++)
    {
        master.add(x+1);
        stepCounter++;
    }
    System.out.println("Numbers from 1-100:");
    System.out.println(master);
    //multiples of 2
    System.out.println("Multiples of 2: ");
      for(int x = 1; x < 50; x++) 
         {
          int multiples2 = 2*(x+1);
          mult2.add(multiples2);
          stepCounter++;
         }
        System.out.println(mult2);
    //multiples of 3
    System.out.println("Multiples of 3: ");
      for(int x = 1; x < 33; x++) 
         {
          int multiples3 = 3*(x+1);
          mult3.add(multiples3);
          stepCounter++;
         }
        System.out.println(mult3);
    //multiples of 5
    System.out.println("Multiples of 5: ");
      for(int x = 1; x < 20; x++) 
         {
          int multiples5 = 5*(x+1);
          mult5.add(multiples5);
          stepCounter++;
         }
        System.out.println(mult5);
    //multiples of 7
    System.out.println("Multiples of 7: ");
      for(int x = 1; x < 14; x++) 
         {
          int multiples7 = 7*(x+1);
          mult7.add(multiples7);
          stepCounter++;
         }
        System.out.println(mult7);
    master.removeAll(mult2);
    master.removeAll(mult3);
    master.removeAll(mult5);
    master.removeAll(mult7);
    System.out.println("The remaining numbers, which are prime, are: ");
    System.out.println(master);
    System.out.println("The amount of steps it took to compute this list was: " + stepCounter);
    }
}
