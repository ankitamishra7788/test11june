package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("I'm sending a mail...");

//        creating an object for MainHandler class
        MailHandler mainHandler = new MailHandler();
//        calling the method from mailHandlr class by this object reference variable
        mainHandler.sendMail();
    }
}