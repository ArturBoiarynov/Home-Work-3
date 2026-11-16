package org.example;

public class Main {
    public static void main(String[] args) {
        Printer<ConsolePrinter.Message> printer = new ConsolePrinter();

        printer.print(new ConsolePrinter.Message("Hello!", "Artur"));
        printer.print(new ConsolePrinter.Message("Hello!", "null"));
        printer.print(new ConsolePrinter.Message("Hello!", ""));
        printer.print(new ConsolePrinter.Message(null, null));
    }
}
