/*
Perry Vinner
Maaz Amin
Fatima Ahmed
Mitchell Kim
Ian Atkinson

The goal of this project is to create a Prom application game that will utilize everything we have learned from IS 147

*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);
        String name="";

        boolean hasDone=false;
        do{
            System.out.println("What is your full name?");
            name=scan.nextLine();

            switch(name.length()) {
                case(-1):
                    System.out.println("Invalid input!!! Please enter your full name");
                    break;
                default:
                    System.out.println("Hello "+name+"!");
                    hasDone=true;
            }
        }while(hasDone!=true);


        System.out.println("Hello" + name +" you are getting ready for Prom soon! There are many things you need to finsh before goin!");
        System.out.println("You firstly have to go to school and complete a varity of tasks.");
        System.out.println("You then have to go to work and earn money for prom");
        System.out.print("Remember not to slack off! And complete all your assignments for the best prom experience!");


        //Declarations of classes
        Quiz schoolQuiz= new Quiz();
        programClass questiongame=new programClass();
        PromClass job=new PromClass();
        ticTacToe  ticgame=new ticTacToe();

        schoolQuiz.runQuiz();
        questiongame.preformProgramming();
        questiongame.preformProgramming();
        ticgame.Startup();
        job.Startup();

        System.out.println("Using your coding, mathematical, and tic-tac-toe experience you were able to get through the week to prom!");
        System.out.println("Because of the money you saved your were able to buy the nicest getup and impress your entire class!");

    }

}
