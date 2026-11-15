package org.example;

public class Main {
    public static void main(String[] args) {
        Shape [] shapes = {
                new Circle (3),
                new Triangle(2,4,6),
                new Square(2),
                new Circle(1.8),
        };

        printTotalArea(shapes);
    }
    public static void printTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        System.out.printf("Total Area of all shapep: %.2f%n", total);
    }
}
