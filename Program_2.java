// 2)WAP to accept age from user and check is it eligible for voting or not

import java.util.*;
import java.io.*;

public class Program_2 {
   public static void main(String[] args) {
      int ageofperson;
      System.out.print("Enter your age :- ");
      Scanner sc = new Scanner(System.in);
      ageofperson = sc.nextInt();
      if (ageofperson >= 18) {
         System.out.println("You are eligible for voting ");

      } else {
         System.out.println("You are not eligible for voting ");
      }
   }
}

// OUTPUTS ---------->

// Enter your age:-22
// You are eligible for
// voting

// Enter your age:-12
// You are
// not eligible for
// voting