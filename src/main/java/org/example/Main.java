package org.example;

public class Main {

    public static void main(String[] args) {
        int total = 0;

      for(int num = 1; num <= 6; num++) {
          total += num;
          System.out.println(num + ") Num is " + num + ", sum is " + total );
      }
      System.out.println("------------------------");
      System.out.println("Sum of numbers is " + total);

    }
}