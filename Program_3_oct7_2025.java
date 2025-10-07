// 3)WAP to accept a no from user if no is positive then display the Addition of that no till 0
// EG: if no is 5 
// ans= 0+1+2+3+4+5

import java.util.*;
import java.io.*;

public class Program_3_oct7_2025 {
   public static void main(String[] args) {
      int takenumber;
      System.out.print("Enter any number :- ");
      Scanner sc = new Scanner(System.in);
      takenumber = sc.nextInt();
      if (takenumber > 0) {
         int additiontillgivennumber = 0;
         for (int i = 0; i <= takenumber; i++) {
            additiontillgivennumber = additiontillgivennumber + i;
         }
         System.out.println("Addition of the number till 0 is >> " + additiontillgivennumber);
      } else if (takenumber == 0) {
         System.out.print("Addition is 0");
      } else {
         System.out.print("Please enter positive number");
         System.out.println("You entered negative number is >> " + takenumber);
      }
   }
}

// OUTPUTS ---------->

// Enter any number:-5
// Addition of
// the number till 0 is>>
// 15

// Enter any number:-0
// Addition is
// 0

// Enter any number:- -3
// Please enter
// positive numberYou
// entered negative
// number is>>-
// 3

// Enter any number:-2
// Addition of
// the number till 0 is>>
// 3