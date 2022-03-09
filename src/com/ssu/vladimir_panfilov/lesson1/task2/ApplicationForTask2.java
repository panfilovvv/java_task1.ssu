package com.ssu.vladimir_panfilov.lesson1.task2;

import java.util.Scanner;

public class ApplicationForTask2 {

    public static void main(String[] args) {
        ApplicationForTask2 app = new ApplicationForTask2();
        app.startApplication();
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws Exception {
        if (b==0) throw new Exception("You can't divide by zero!");
        else return a*1.0 / b;
    }

    public double substract(double a, double b) {
        return a - b;
    }

    public void startApplication() {
        System.out.println("App is started");
        // Your code is here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        System.out.print("Enter the operation you want to perform: ");
        String operation = sc.next();
        switch (operation){
            case "+":
                System.out.println(A + " + " + B + " = " + sum(A, B));
                break;
            case "*":
                System.out.println(A + " * " + B + " = " + multi(A, B));
                break;
            case "-":
                System.out.println(A + " - " + B + " = " + substract(A, B));
                break;
            case "/":
                try {
                    System.out.println(A + " / " + B + " = " + divide(A, B));
                }
                catch (Exception e){
                    System.err.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Something is wrong with your operation, please try again later!");
                break;
        }

    }

}
