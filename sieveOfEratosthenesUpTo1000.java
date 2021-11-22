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
    ArrayList <Integer> mult11 = new ArrayList<Integer>();
    ArrayList <Integer> mult13 = new ArrayList<Integer>();
    ArrayList <Integer> mult17 = new ArrayList<Integer>();
    ArrayList <Integer> mult19 = new ArrayList<Integer>();
    ArrayList <Integer> mult23 = new ArrayList<Integer>();
    ArrayList <Integer> mult29 = new ArrayList<Integer>();
    ArrayList <Integer> mult31 = new ArrayList<Integer>();
    int stepCounter = 0;
    //1-1000 Array
    for(int x=1; x < 1000; x++)
    {
        master.add(x+1);
        stepCounter++;
    }
    System.out.println("Numbers from 1-100:");
    System.out.println(master);
    //multiples of 2
    System.out.println("Multiples of 2: ");
      for(int x = 1; x < 500; x++) 
         {
          int multiples2 = 2*(x+1);
          mult2.add(multiples2);
          stepCounter++;
         }
        System.out.println(mult2);
    //multiples of 3
    System.out.println("Multiples of 3: ");
      for(int x = 1; x < 333; x++) 
         {
          int multiples3 = 3*(x+1);
          mult3.add(multiples3);
          stepCounter++;
         }
        System.out.println(mult3);
    //multiples of 5
    System.out.println("Multiples of 5: ");
      for(int x = 1; x < 200; x++) 
         {
          int multiples5 = 5*(x+1);
          mult5.add(multiples5);
          stepCounter++;
         }
        System.out.println(mult5);
    //multiples of 7
    System.out.println("Multiples of 7: ");
      for(int x = 1; x < 142; x++) 
         {
          int multiples7 = 7*(x+1);
          mult7.add(multiples7);
          stepCounter++;
         }
        System.out.println(mult7);
    //multiples of 11
    System.out.println("Multiples of 11: ");
      for(int x = 1; x < 90; x++) 
         {
          int multiples11 = 11*(x+1);
          mult11.add(multiples11);
          stepCounter++;
         }
        System.out.println(mult11);
    //multiples of 7
    System.out.println("Multiples of 13: ");
      for(int x = 1; x < 76; x++) 
         {
          int multiples13 = 13*(x+1);
          mult13.add(multiples13);
          stepCounter++;
         }
        System.out.println(mult13);
    //multiples of 19
    System.out.println("Multiples of 19: ");
      for(int x = 1; x < 52; x++) 
         {
          int multiples19 = 19*(x+1);
          mult19.add(multiples19);
          stepCounter++;
         }
        System.out.println(mult19);
    //multiples of 23
    System.out.println("Multiples of 23: ");
      for(int x = 1; x < 43; x++) 
         {
          int multiples23 = 23*(x+1);
          mult23.add(multiples23);
          stepCounter++;
         }
        System.out.println(mult23);
    //multiples of 29
    System.out.println("Multiples of 29: ");
      for(int x = 1; x < 34; x++) 
         {
          int multiples29 = 29*(x+1);
          mult29.add(multiples29);
          stepCounter++;
         }
        System.out.println(mult29);
    //multiples of 31
    System.out.println("Multiples of 31: ");
      for(int x = 1; x < 32; x++) 
         {
          int multiples31 = 31*(x+1);
          mult31.add(multiples31);
          stepCounter++;
         }
        System.out.println(mult31);
    master.removeAll(mult2);
    master.removeAll(mult3);
    master.removeAll(mult5);
    master.removeAll(mult7);
    master.removeAll(mult11);
    master.removeAll(mult13);
    master.removeAll(mult17);
    master.removeAll(mult19);
    master.removeAll(mult23);
    master.removeAll(mult29);
    master.removeAll(mult31);
    System.out.println("The remaining numbers, which are prime, are: ");
    System.out.println(master);
    System.out.println("The amount of steps it took to compute this list was: " + stepCounter);
    }
}