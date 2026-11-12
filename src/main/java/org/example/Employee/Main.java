package org.example.Employee;


public class Main {
       public static void main(String[] args) {
           Employee employee = new Employee("Vladislav Fedorenko", "Car Mechanic", "vladyslavfed1997@gmail.com",
                   "+380675424587", 29
           );
           System.out.println(employee);

           Car car =  new Car();
           car.start();
          }
       }