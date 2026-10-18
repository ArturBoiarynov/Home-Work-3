package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal income = new BigDecimal(scanner.next().replace(',','.')) ;
        System.out.println(canculateTax(income));
    }
    static  BigDecimal canculateTax(BigDecimal income) {
        BigDecimal rate;
        if (income.compareTo(new BigDecimal("10000")) <= 0) {
            rate = new BigDecimal("0.025");
        } else if (income.compareTo(new BigDecimal("25000")) <= 0) {
            rate = new BigDecimal("0.043");
        } else {
            rate = new BigDecimal("0.067");
        }
            return income.multiply(rate).setScale(2, RoundingMode.HALF_UP);

    }
}