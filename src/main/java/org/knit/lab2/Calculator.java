package org.knit.lab2;

public class Calculator {
    private double FirstNumber;
    private double SecondNumber;

    public Calculator(double FirstNumber, double SecondNumber) {
        this.FirstNumber = FirstNumber;
        this.SecondNumber = SecondNumber;
    }

    public double add(double FirstNumber, double SecondNumber) {
        return FirstNumber + SecondNumber;
    }

    public double subtract(double FirstNumber, double SecondNumber) {
        return FirstNumber - SecondNumber;
    }

    public double multiply(double FirstNumber, double SecondNumber) {
        return FirstNumber * SecondNumber;
    }

    public String divide(double FirstNumber, double SecondNumber) {
        if (SecondNumber != 0) {
            return FirstNumber / SecondNumber + "";
        }
        else {
            return "Нельзя делить на ноль";
        }

    }

}
