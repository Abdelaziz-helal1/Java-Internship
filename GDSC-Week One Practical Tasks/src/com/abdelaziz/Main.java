package com.abdelaziz;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        taskFour();
    }

    public static void taskOne()
    {
        // declaring variables of all data types:
        int ageOfPerson = 24 ;
        double heightOfBuilding = 9.5 ;
        boolean isRaining = true ;
        String cityName = "Mansoura";

    }

    public static void taskTwo()
    {
        System.out.println("Please enter the first number: ");
        int firstNumber = scanner.nextInt() ;

        System.out.println("Please enter the second number: ");
        int secondNumber = scanner.nextInt() ;

        System.out.println("""
                Which operation do you want to do : 
                press * for multiplication 
                press / for division
                press + for addition
                press - for subtraction """);

        char operator = scanner.next().charAt(0);

        switch (operator)
        {
            case '*' -> System.out.println(firstNumber * secondNumber);
            case '/' -> System.out.println(firstNumber / secondNumber);
            case '+' -> System.out.println(firstNumber + secondNumber);
            case '-' -> System.out.println(firstNumber - secondNumber);
            default -> System.out.println("Wrong input for operator ");
        }
    }

    public static void taskThree()
    {
        // program to printing all even numbers between 1 and 2 :
        for (int i = 1 ; i <= 20 ; i++)
        {
            if (i % 2 == 0 )
            {
                System.out.println(i);
            }
        }
    }

    public static void taskFour()
    {
        System.out.println("Please enter a weekDay number between 1 - 7 : ");
        int weekDayNumber = scanner.nextInt() ;

        if (weekDayNumber < 0 || weekDayNumber > 7 )
        {
            System.out.println("Please enter a valid number between 1 - 7 ");
        }
        else
        {
            switch (weekDayNumber)
            {
                case 1 -> System.out.println("Saturday");
                case 2 -> System.out.println("Sunday");
                case 3 -> System.out.println("Monday");
                case 4 -> System.out.println("Tuesday");
                case 5 -> System.out.println("Wednesday");
                case 6 -> System.out.println("Thursday");
                default -> System.out.println("Friday");
            }
        }
    }
}
