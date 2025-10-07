// Write a program to accept employee basic details from the user and display the output 

import java.util.*;
import java.io.*;

public class Prgm_1_6oct2025 {
   public static void main(String[] args) {
      String empname, empage, empsalary, empdep;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter you name :- ");
      empname = sc.nextLine();
      System.out.print("Enter you age :- ");
      empage = sc.nextLine();
      System.out.print("Enter your salary :- ");
      empsalary = sc.nextLine();
      System.out.print("Enter your department :- ");
      empdep = sc.nextLine();

      System.out.println("Employee Details are as follows :- ");
      System.out.println("Name :- " + empname);
      System.out.println("Age :-" + empage);
      System.out.println("Salary :- " + empsalary);
      System.out.println("Deparatment :- " + empdep);
   }
}

// OUTPUTS ----->

// Enter you name:-
// Shubham Misal
// Enter you age:-21
// Enter your salary:-25k
// Enter
// your department:-
// Software Employee
// Details are
// as follows:-Name:-
// Shubham Misal Age:-21 Salary:-25k
// Deparatment:-
// Software
