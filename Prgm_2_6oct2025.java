// WAP to accept 2 no from the user and perform arithmetic operation 

import java.util.*;
import java.io.*;

public class Prgm_2_6oct2025 {
   public static void main(String[] args) {
      int num1, num2, add, sub, mul, div, mod;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter first number :- ");
      num1 = sc.nextInt();
      System.out.print("Enter second number :- ");
      num2 = sc.nextInt();
      add = num1 + num2;
      sub = num1 - num2;
      mul = num1 * num2;
      div = num1 / num2;
      mod = num1 % num2;
      System.out.println("Addition of the given tow number is :- " + add);
      System.out.println("Subtraction of the given two numbers is :- " + sub);
      System.out.println("Multiplication of the given two numnbers is :- " + mul);
      System.out.println("Division of the given two numbers is :- " + div);
      System.out.println("Modulus of the given two numbers is :- " + mod);
   }
}

// OUTPUTS ----->
// Enter first number:-2
// Enter second number:-5
// Addition of
// the given
// tow number is:-7
// Subtraction of
// the given
// two numbers is:- -3
// Multiplication of
// the given
// two numnbers is:-10
// Division of
// the given
// two numbers is:-0
// Modulus of
// the given
// two numbers is:-
// 2