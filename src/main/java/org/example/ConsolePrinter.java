package org.example;

public class ConsolePrinter implements Printer<ConsolePrinter.Message> {

    public static class Message {
    private String text;
    private String  sender;

    public Message(String text, String sender) {
        this.text = text;
        this.sender = sender;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;

    }
    }
    @Override
    public void print(Message message) {
        boolean noText = message == null || message.getText() == null || message.getText().isBlank();
        boolean noSender = message == null || message.getSender() == null || message.getSender().isBlank();

        if (noText && noSender) {
            Printer<Message> emptyHandler = new Printer<>() {
                @Override
                public void print(Message m) {
                    System.out.println("Processing empty message from anonymous user...");
                }
            };
            emptyHandler.print(message);
            return;
        }

        if (noSender) {
            System.out.println("Anonymous user sent a message: " + message.getText());
        } else {
            System.out.println("User " + message.getSender() + " sent a message: " + message.getText());
        }
    }
}
