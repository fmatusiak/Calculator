package com.kodilla.calculatorkodilla;

public class Calculator {
    public double addition(double numberFirst, double numberSecond){
        return numberFirst + numberSecond;
    }

    public double subtraction(double numberFirst, double numberSecond){
        return numberFirst - numberSecond;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(25,12));
        System.out.println(calculator.subtraction(26,13));
    }
}
