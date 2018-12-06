/*
Mitch
Create a quiz class that will return a score back to main
*/

import java.util.Scanner;
public class Quiz {
    public int runQuiz(String[] args) {
        String Question1 = "What is 46*12?\n" + "(a)562\n (b)552\n (c)502\n (d)532";

        String Question2 = "What is 2^-3?\n + (a)1/4\n (b)1/2\n (c)1/8\n (d)-8";

        String Question3 = "What is 8^3?\n + (a)512\n (b)486\n (c)IDK\n (d) 534";

        String Question4 = "What is 10*10?\n + (a)100\n (b)1000\n (c)1\n (d)0";

        String Question5 = "What is 9+10?\n + (a)21\n (b)19\n (c)5\n (d)0";

        String Question6 = "What is 17*8?\n + (a)124\n (b)204\n (c)138\n (d)136";

        String Question7 = "What is pi?\n + (a)3.14\n (b)3.15\n (c)3.13\n (d)3.12";

        String Question8 = "How old is UMBC\n + (a)50\n (b)51\n (c)52\n (d)53";

        String Question9 = "What is 18*5?\n + (a)90\n (b)60\n (c)50\n (d)80";

        String Question10 = "What is 96/5?\n + (a)18.3\n (b)17.1\n (c)20.21\n (d)19.2";

        String Question11 = "What is 15*45?\n + (a)765\n (b)785\n (c)865\n (d)845";

        String Question12 = "What is 6*25?\n + (a)140\n (b)170\n (c)150\n (d)130";

        String Question13 = "Are you paying attention? Pick b\n + (a)no\n (b)yes\n (c)what?\n (d)487";

        String Question14 = "What is 96*3\n + (a)368\n (b)488\n (c)268\n (d)288";

        String Question15 = "What is 15*25?\n + (a)375\n (b)255\n (c)325\n (d)275";

        String Question16 = "What is 32/5?\n + (a)6.4\n (b)4.3\n (c)4.6\n (d)3.4";

        String Question17 = "What is 78/6?\n + (a)14\n (b)14.33\n (c)13\n (d)12.9";

        String Question18 = "What is 93*8?\n + (a)724\n (b)794\n (c)644\n (d)744";

        String Question19 = "What is 61*7?\n + (a)277\n (b)427\n (c)377\n (d)337";

        String Question20 = "What is 3x+5x?\n + (a)15x\n (b)8x\n (c)35x\n (d)-2x";

        Question[] questions = {
                new Question(Question1, "b"),
                new Question(Question2, "c"),
                new Question(Question3, "a"),
                new Question(Question4, "a"),
                new Question(Question5, "b"),
                new Question(Question6, "d"),
                new Question(Question7, "a"),
                new Question(Question8, "c"),
                new Question(Question9, "a"),
                new Question(Question10, "d"),
                new Question(Question11, "a"),
                new Question(Question12, "c"),
                new Question(Question13, "b"),
                new Question(Question14, "d"),
                new Question(Question15, "a"),
                new Question(Question16, "a"),
                new Question(Question17, "c"),
                new Question(Question18, "d"),
                new Question(Question19, "b"),
                new Question(Question20, "b"),
        };
        return takeTest(questions);

    }

    public static int takeTest(Question[] questions){
        int score = 0;
        char quit;
        Scanner input = new Scanner(System.in);
        Scanner keyboardInput = new Scanner(System.in);
        for(int i=0 ; i < questions.length; i++){
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("you got " + score + "/" + questions.length);
        if(score > 13/20)
            System.out.println("you passed");
        else if(score < 13/20)
            System.out.println("You failed");

        System.out.println();
        System.out.println(" Would you like to take the quiz again?\n If yes, press 'y' or 'Y'. If no, press 'n' or 'N'");
        String quit1 = input.nextLine();
        quit = quit1.charAt(0);
        while (quit !='n' && quit !='N');

        return score;
    }
}
