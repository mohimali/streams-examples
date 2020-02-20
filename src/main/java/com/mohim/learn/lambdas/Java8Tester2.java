package com.mohim.learn.lambdas;

public class Java8Tester2 {

    final static String salutation = "Hello! ";

    public static void main(String[] args) {
        GreetingService greetingService = message -> System.out.println(salutation + message);

        greetingService.sayMessage("Mohim");

    }

    interface GreetingService {
        void sayMessage(String message);
    }

}
