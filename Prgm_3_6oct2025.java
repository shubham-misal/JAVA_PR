
// WAP to accept radious from the user and calculate area of circle and parameter of circle
import java.util.*;
import java.io.*;

public class Prgm_3_6oct2025 {
   public static void main(String[] args) {
      int radious;
      double area, parameter;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the radious of the circle :-");
      radious = sc.nextInt();
      area = (3.14 * radious * radious);
      parameter = ((2 * 3.14) * radious);
      System.out.println("Area of the circle is :-" + area);
      System.out.println("Parameter of the circle is :-" + parameter);
   }
}

// OUTPUTS ----->
// Enter the radious of the circle :-4
// Area of the circle is :-50.24
// Parameter of the circle is :-25.12

// Enter the radious of the circle :-3
// Area of the circle is :-28.259999999999998
// Parameter of the circle is :-18.84