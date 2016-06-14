package en.first.time.sandbox;

import java.util.Scanner;

public class FunWithJava {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Julia");

    double l = 5;
    System.out.println("Area of a square with side " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Area of a rectangle with side " + a + " и " + b + " = " + area(a, b));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}
