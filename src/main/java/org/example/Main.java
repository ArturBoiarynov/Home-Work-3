package org.example;

import java.util.Locale;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;

        }
        System.out.println("Елемент масиву: "  + Arrays.toString(array));

        int negativeSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int minIndex = 0;
        int maxIndex = 0;
        int firstNegativeIndex = -1;

        for  (int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                negativeSum += array[i];
                if (firstNegativeIndex == -1) {
                    firstNegativeIndex = i;
                }
            }
            if(array[i] %2 == 0) {
                evenCount++;
            } else  {
                oddCount++;
            }
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum);
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
        System.out.println("Найменший елемент: " + array[minIndex] + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + array[maxIndex] + " (з індексом " + maxIndex + ")");

        if (firstNegativeIndex == -1) {
            System.out.println("Від'ємних чисел у масиві немає.");
        } else if (firstNegativeIndex == array.length - 1) {
            System.out.println("Після першого від'ємного числа немає елементів.");
        } else {
            int sum = 0;
            for(int i = 0; i < firstNegativeIndex; i++) {
                sum += array[i];
            }
            double average = (double) sum / (array.length - firstNegativeIndex - 1);
            System.out.println(String.format(Locale.US,
                    "Середнє арифметичне чисел після першого від'ємного числа: %.2f", average));
        }
        }
    }
