import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);
        String name="";
        int age=0;

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

        do{
            System.out.println("What is your age?");
            age=scan.nextInt();

            if(age<0)
                System.out.println("Invalid age!!!");
            else if(age>0 && age<17)
                System.out.println(" ");
            else
                hasDone=true;
        }while(hasDone!=true);
    }

}
