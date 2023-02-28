package org.example;

import org.example.services.Factorial;
import org.example.services.Logrithm;
import org.example.services.Power;
import org.example.services.SqRoot;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double a;
        double b;
        int choice;
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1. Square root function - √x \n2. Factorial function - x! \n3. Natural logarithm (base е) - ln(x) \n4. Power function - x^b \n5. Exit\n");
            System.out.print("Enter your choice : ");
            try {
                choice = sc.nextInt();

                if(choice == 5){
                    System.out.println("\nBye and thank you for using this app");
                    System.out.println("\nx-x-x-x-x-x-x-x-x-x-x-x-x-x");
                    break;
                }

                else if(choice == 1){
                    System.out.print("Enter the number you want the square root of : ");
                    a = sc.nextDouble();
                    SqRoot sqrt = new SqRoot();
                    double result = sqrt.root(a);
                    System.out.println("The square root of "+a+" is "+result);
                    System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                }

                else if(choice == 2){
                    System.out.print("Enter the number you want the Factorial of : ");
                    a = sc.nextDouble();
                    Factorial fact = new Factorial();
                    double result = fact.factorial(a);
                    System.out.println("The Factorial of "+a+" is "+result);
                    System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                }

                else if(choice == 3){
                    System.out.print("Enter the number you want the log of : ");
                    a = sc.nextDouble();
                    Logrithm logarithm = new Logrithm();
                    double result = logarithm.log(a);
                    System.out.println("The natural log of "+a+" is "+result);
                    System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                }

                else if(choice == 4){
                    System.out.print("Enter the base : ");
                    a = sc.nextDouble();
                    System.out.print("Enter the exponent : ");
                    b = sc.nextDouble();
                    Power power = new Power();
                    double result = power.power(a,b);
                    System.out.println("The result of ("+a+" ^ "+b+") is "+result);
                    System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                }

                else if(choice <= 0 || choice > 5){
                    System.out.println("The choice is invalid....Try again");
                    System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                }

            }catch (Exception e){
                System.out.println(e);
                System.out.println("\nApp crashed... Bye");
                System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                break;
            }
        }

        return;
    }
}
