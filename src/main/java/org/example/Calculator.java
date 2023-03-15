package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.services.Factorial;
import org.example.services.Logrithm;
import org.example.services.Power;
import org.example.services.SqRoot;


import java.util.Scanner;

public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        double a;
        double b;
        int choice;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Square root function - √x \n2. Factorial function - x! \n3. Natural logarithm (base е) - ln(x) \n4. Power function - x^b \n5. Exit\n");
            System.out.print("Enter your choice : ");
            try {
                choice = sc.nextInt();

                if (choice == 5) {
                    System.out.println("\nBye and thank you for using this app");
                    System.out.println("\nx-x-x-x-x-x-x-x-x-x-x-x-x-x");
                    break;
                } else if (choice == 1) {
                    System.out.print("Enter the number you want the square root of : ");
                    a = sc.nextDouble();
                    SqRoot sqrt = new SqRoot();
                    double result = sqrt.root(a);
                    System.out.println("The square root of " + a + " is " + calculator.sqareroot(a));
                    System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                } else if (choice == 2) {
                    System.out.print("Enter the number you want the Factorial of : ");
                    a = sc.nextDouble();
                    Factorial fact = new Factorial();
                    double result = fact.factorial(a);
                    System.out.println("The Factorial of " + a + " is " + calculator.factorial(a));
                    System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                } else if (choice == 3) {
                    System.out.print("Enter the number you want the log of : ");
                    a = sc.nextDouble();
                    Logrithm logarithm = new Logrithm();
                    double result = logarithm.log(a);
                    System.out.println("The natural log of " + a + " is " + calculator.naturallog(a));
                    System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                } else if (choice == 4) {
                    System.out.print("Enter the base : ");
                    a = sc.nextDouble();
                    System.out.print("Enter the exponent : ");
                    b = sc.nextDouble();
                    Power power = new Power();
                    double result = power.power(a, b);
                    System.out.println("The result of (" + a + " ^ " + b + ") is " + calculator.power(a,b));
                    System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                } else if (choice <= 0 || choice > 5) {
                    System.out.println("The choice is invalid....Try again");
                    System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                }

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("\nApp crashed... Bye and see you again");
                System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                break;
            }
        }
    }

    public double power(double a, double b) {
        logger.info("[Power of - " + a + " raise to " + b);
        double result = power(a,b);
        logger.info("[RESULT - POWER Function] - " + result);
        return result;
    }

    public double sqareroot(double a) {
        logger.info("[SQUARE ROOT] - " + a);
        double result = Math.sqrt(a);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }

    public double factorial(double a) {
        logger.info("[FACTORIAL] - " + a);
        double result = factorial(a);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double naturallog(double a) {
        logger.info("[NATURAL LOG] - " + a);
        double result = naturallog(a);
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
}
