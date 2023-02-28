package org.example.services;

public class Factorial {

    public double factorial(double a){
        double result = 1;
        for(int i=1; i<=a; i++){
            result = result*i;
        }
        return result;
    }

}
