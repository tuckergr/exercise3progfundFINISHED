package com.company;

import java.util.Scanner;

public class Main {                                                 //Tucker Gragg
    static Scanner input = new Scanner(System.in);                  //2/8/22

    public static void main(String[] args) {
        printResult(result(userInput()));
    }

    static double userInput() {
        System.out.println("Enter a temperature in Fahrenheit");
        double tempf = input.nextDouble();
        while (tempf >= -460) {
            return tempf;
        }
        if(tempf < -460){
            System.out.println("Enter a valid temperature (-460+)");
            tempf = input.nextDouble();
        }
        return tempf;
    }

    static double result(double tempf) {
        double tempc = (tempf - 32) * .5555;
        return tempc;
    }

    static void printResult(double tempc) {
        System.out.println("The temp in fahrenheit converts to " + tempc + " in celsius");
    }


}
