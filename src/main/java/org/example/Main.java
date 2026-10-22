package org.example;

public class Main {

    public static void main(String[] args) {
        int start = 1;
        int end = 6;
        int total = 0;

      for(int num = start; num <= end ; num++) {
          total = total + num;

          String line = num + ") Num is " + num + ", sum us " + total;
          System.out.println(line);
      }
      System.out.println("------------------------");
      System.out.println("Sum of numbers is " + total);

    }
}