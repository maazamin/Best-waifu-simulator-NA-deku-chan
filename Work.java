package com.company;
import java.util.Scanner;

public class Work {
    public static void main(String[] args){
        int random1 = (int)(Math.random()*(101) + 1);
        int random2 = (int)(Math.random()*(101) + 1);
        int biggerrandom = Biggerrandom(random1 , random2);

        

    }

    public static int Biggerrandom (int a, int b){
        if (a > b)
            return (int)(Math.random()*(a+b)+b);
            else if(b>a)
            return (int)(Math.random()*(a+b)+a);
        else
            return (int)(Math.random()*(a+b)+b);


    }

    public static boolean job1(int a, int b, int c)
    {
        System.out.println("Working at the Pizza Palace, for every "+a+" cheese pizzas");
        System.out.println("There are "+ c +"pepperoni pizzas");
        System.out.println("If you want to make "+ b +" amount of cheese pizza and still maintain the ratio of pizzas");
        System.out.println("How many pepperoni pizzas must you make? (Round to the nearest whole pizza)");

        int answer = Math.round((a*c)/b);

        Scanner scan = new Scanner(System.in);

        int playeranswer = scan.nextInt();

        if(answer == playeranswer) {
            System.out.println("You completed the job!");
            return true;
        }

        else {
            System.out.println("Opps! You messed up the order!");
            return false;
        }
    }

}
