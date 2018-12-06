//Atkinson Ian coding class


import java.util.Scanner;

class mob
{

    int damDra;

    int damSke;

    int damGob;




    mob(int  damDra, int damSke, int damGob)
    {
        this.damDra = damDra;
        this.damSke = damSke;
        this.damGob = damGob;
    }

}

class programClass {


    public void preformProgramming() {

        {
            int dragonCount = 0;
            int skeletonCount = 0;
            int goblinCount = 0;
            boolean shallWin = true;
            int  yourHealth = 50;

            int bossHealth = 4;
            int rawr = 1;
            System.out.println("Coding is hard to get into so your teacher made a game. Answer the questions correctly to continue");
            System.out.println(yourHealth+" is your starting health");
            do
            {
                if (yourHealth ==1)
                {
                    shallWin = false;
                    System.out.println("You have failed programming");

                }
                if (yourHealth > 1)
                {
                    System.out.println("There are "+dragonCount+" dragons,"+ skeletonCount+ " skeletons and "+goblinCount+" goblins");
                    mob mobDamage = new mob(4, 3, 1);
                    yourHealth = yourHealth - (mobDamage.damDra * dragonCount + mobDamage.damSke * skeletonCount +
                            mobDamage.damGob * goblinCount);
                    if (yourHealth <1)
                    {
                        yourHealth = 1;
                    }

                    System.out.println("You have " + yourHealth + " Health remaining");
                    goblinCount = goblinCount + 1;
                    String q1 = "Encapsulation is:";
                    String q2 = "How would you print a string using printf?";
                    String q3 = "What do constructors do?";
                    String q4 = "Is this challenge almost over?";

                    if (rawr ==1)
                    {
                        System.out.printf("%s", q1);
                        System.out.println("----------------------");
                        System.out.println("1: the wrapping of data under a single unit");//correct
                        System.out.println("2: making data private");
                        System.out.println("3: capturing data to be enslaved working at a capsule company");
                        Scanner yo = new Scanner(System.in);
                        String q = yo.nextLine();
                        int question = Integer.parseInt(q);
                        if (question == 1) {
                            bossHealth = bossHealth - 1;
                            if (goblinCount > 0) {
                                goblinCount = goblinCount - 1;
                            }
                            System.out.println(bossHealth);
                            rawr = 2;


                        }
                        if (question == 2) {
                            System.out.println("you deal no damage");
                            goblinCount= goblinCount + 1;


                        }
                        if (question == 3) {
                            System.out.println("you deal no damage");
                            goblinCount= goblinCount + 1;
                        }
                    }
                    if (rawr == 2)
                    {
                        System.out.printf("%s", q2);
                        System.out.println("----------------------");
                        System.out.println("1: string.name");
                        System.out.println("2: percentS comma string name");//correct
                        System.out.println("3: ask it nicely");
                        Scanner yo = new Scanner(System.in);
                        String q = yo.nextLine();
                        int question = Integer.parseInt(q);
                        if (question == 2)
                        {
                            bossHealth = bossHealth - 1;
                            if (goblinCount > 0)
                            {
                                goblinCount = goblinCount - 1;
                            }
                            System.out.println(bossHealth);
                            rawr = 3;


                        }
                        if (question == 1) {
                            System.out.println("you deal no damage");
                            skeletonCount = skeletonCount + 1;


                        }
                        if (question == 3) {
                            System.out.println("you deal no damage");
                            goblinCount= goblinCount + 1;


                        }
                    }
                    if (rawr == 3)
                    {
                        System.out.printf("%s", q3);
                        System.out.println("----------------------");
                        System.out.println("1: create arrays");
                        System.out.println("2: access classes to use their data");//correct
                        System.out.println("3: build code so I don't have to code it");
                        Scanner yo = new Scanner(System.in);
                        String q = yo.nextLine();
                        int question = Integer.parseInt(q);
                        if (question == 2)
                        {
                            bossHealth = bossHealth - 1;
                            if (goblinCount > 0)
                            {
                                goblinCount = goblinCount - 1;
                            }
                            System.out.println(bossHealth);
                            System.out.println("A dragon has appeared");
                            dragonCount = dragonCount+1;
                            rawr = 4;


                        }
                        if (question == 1)
                        {
                            System.out.println("you deal no damage");


                        }
                        if (question == 3) {
                            System.out.println("you deal no damage");


                        }
                    }
                    if (rawr == 4)
                    {
                        System.out.printf("%s", q4);
                        System.out.println("----------------------");
                        System.out.println("1: yes");
                        System.out.println("2: no");
                        System.out.println("3: I hope so, im getting sick of answering questions");//correct
                        Scanner yo = new Scanner(System.in);
                        String q = yo.nextLine();
                        int question = Integer.parseInt(q);
                        if (question == 3)
                        {
                            bossHealth = bossHealth - 1;
                            if (goblinCount > 0)
                            {
                                goblinCount = goblinCount - 1;
                            }
                            System.out.println(bossHealth);
                            rawr = 3;


                        }
                        if (question == 2) {
                            System.out.println("you deal no damage");


                        }
                        if (question == 1) {
                            System.out.println("you deal no damage");


                        }
                    }
                }
                if (bossHealth == 0)
                {
                    shallWin = false;
                    System.out.println("you win");
                }
            } while (shallWin == true);

        }


    }


}