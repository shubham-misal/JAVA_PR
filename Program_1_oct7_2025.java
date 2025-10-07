// 1)WAP to accept 5 no from the use and find out the smallest

import java.util.*;
import java.io.*;

public class Program_1_oct7_2025 {
   public static void main(String[] args) {
      // taking user input
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any 5 numbers and get the smallest one out of that 5 number :- ");
      List<Integer> allnumbers = new ArrayList<>();

      for (int i = 0; i < 5; i++) {
         System.out.print("> ");
         int num = sc.nextInt();
         allnumbers.add(num);
      }
      System.out.println("The array of the numbers you entered is as follows :- " + allnumbers);
      int firstnumofarray = allnumbers.get(0);
      int smallestnum;
      for (int i = 1; i < 5; i++) {
         if (allnumbers.get(i) < firstnumofarray) {
            firstnumofarray = allnumbers.get(i);
         }
      }
      smallestnum = firstnumofarray;
      System.out.println("The Smallest number from the 5 numbers you entered is as follows ---> " + smallestnum);

   }
}

// outputs :-

// Enter any 5
// numbers and
// get the
// smallest one
// out of that 5 number:-

// >77>6>3>4>0
// The array
// of the
// numbers you
// entered is
// as follows:-[77,6,3,4,0]
// The Smallest
// number from the 5
// numbers you
// entered is
// as follows--->
// 0

// Enter any 5
// numbers and
// get the
// smallest one
// out of that 5 number:->5>4>3>2>1
// The array
// of the
// numbers you
// entered is
// as follows:-[5,4,3,2,1]
// The Smallest
// number from the 5
// numbers you
// entered is
// as follows--->
// 1
