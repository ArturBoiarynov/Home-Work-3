package org.example;

public class Main {
    public static void main(String[] args) {
        Advisor advisior = new DayAdvisor();

            for (Day day : Day.values()) {
                System.out.print(day + ": ");
                advisior.advise(day);
         }
    }
}
