package com.ssu.vladimir_panfilov.lesson1.task1;

public class ApplicationForTask1 {

    public static void main(String[] args) {
        ApplicationForTask1 app = new ApplicationForTask1();
        app.startApplication();
    }
    public void startApplication() {
        System.out.println("App is started");
        // Subtask #3
        int[] intArray = new int[20];
        for (int i = 0; i< intArray.length; i++)
            intArray[i] = (int)(Math.random()*20-10);

        System.out.println("Current array looks like this: ");
        for (int arrayValue: intArray) System.out.print(arrayValue + " ");
        System.out.println();

        for (int i = 0; i< intArray.length; i++)
            if (intArray[i] < 0)
                intArray[i] = 0;

        System.out.println("The modified array looks like this: ");
        for (int arrayValue: intArray)
            System.out.print(arrayValue + " ");

    }

}
