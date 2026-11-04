package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
       public static void printSquare(int number) {
              System.out.println("Квадрта числа " + number + " дорівнює " + (number*number) + ".");
       }
       public static double cylinderVolume(double radius, double height) {
              return Math.PI * radius * radius * height;
       }
       public static int sumArray(int[] array) {
              int sum = 0;
              for (int value : array) {
                     sum += value;
              }
              return sum;
       }
       public static String reverseString(String text) {
              return new StringBuilder(text).reverse().toString();
       }
       public static long power(int a, int b) {
              long result = 1;
              for (int i = 0; i < b; i++) {
                     result *= a;
              }
              return result;
       }
       public static void printRepeated(int n, String text) {
              for (int i = 0; i < n; i++) {
                     System.out.println(text);
              }
       }
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);


              System.out.print("1. Введіть ціле число: ");
              int number = sc.nextInt();
              printSquare(number);


              double radius = 5.0;
              double height = 12.5;
              double volume = cylinderVolume(radius, height);
              System.out.println("\n2. Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");


              int[] numbers = {3, 7, 15, 22, 8};
              System.out.println("\n3. Масив чисел: " + Arrays.toString(numbers));
              System.out.println("Сума всіх елементів масиву дорівнює " + sumArray(numbers) + ".");


              sc.nextLine();
              System.out.print("\n4. Введіть рядок: ");
              String line = sc.nextLine();
              System.out.println("Рядок у зворотньому порядку:" + reverseString(line));


              System.out.print("\n5. Введіть а: ");
              int a = sc.nextInt();
              System.out.print("Введіть b: ");
              int b = sc.nextInt();
              System.out.println("Результат " + a + "^" + b + " дорівнює " + power(a, b) + ".");

              System.out.print("\n6. Введіть ціле число n: ");
              int n = sc.nextInt();
              sc.nextLine();
              System.out.print("Ведіть текстовий рядок: ");
              String text = sc.nextLine();
              printRepeated(n, text);

              sc.close();

       }


       }