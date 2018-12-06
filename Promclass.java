package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

import static com.company.Helper.Intro;


public class Promclass {
    public static void main(String[] args) {

        Intro();

        double wage = 10.10;
        double sum = 0;

        int days = 11;
        Scanner hoursworked = new Scanner(System.in);
        int [] hours = new int[days];
        for (int i = 1; i < days; i++){
            System.out.println("\nHow many hours have you worked on Day " + i + " ?");
            hours[i] = hoursworked.nextInt();
            while (hours[i] > 12 || hours[i] < 1) {
                    System.out.println("Sorry, you can work the max of 12 hours! Please input the correct number of hours.");
                    hours[i] = hoursworked.nextInt();


                }


        }

        System.out.println(" \nMoney Made after 10 days");
        System.out.println("-------------------------");



        for (int i = 1; i < days; i++)
        {
            double totalMoney=(hours[i] * wage);
            System.out.println("Money made on Day " + i + ": $" + (totalMoney));
            sum+=totalMoney;
        }
        System.out.println("\nTotal money made: $"+sum);
        double a = sum;
        double b = 1000;
        double minusOperator = a - b;
        System.out.println("Money Left: $" + minusOperator);

        //System.out.println("%.2f", val);
        {
            if (a >= b) {
                System.out.println("You have more than enough money for prom.");
            } else {
                System.out.println("You don't have enough money for Prom. I guess you can't go then.");
            }
            {
                if (minusOperator > 0) {
                    System.out.println("You have " + minusOperator + " left over, so put it into your savings.");
                }

            }
        }
    }



}
