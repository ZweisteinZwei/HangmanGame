package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
	int randomWord = (int) (Math.random()*3+1);
    Scanner input = new Scanner(System.in);
    String word = " ";
    int setStage = 0;
    String strStageFinal;
    String strStageFrst;
    String strStageScnd;
    String strStageThrd;
    String strStageWon;
    //First Stage-------------------------------------------------------------------
        strStageFrst = "                      \n" +
                "||                    \n" +
                "||                    \n" +
                "||                       \n" +
                "||                     \n" +
                "||                      \n";
    //First Stage-------------------------------------------------------------------
        strStageScnd = "______________________\n" +
                "||                    \n" +
                "||                    \n" +
                "||                       \n" +
                "||                     \n" +
                "||                      \n";
    //Final Stage-------------------------------------------------------------------
        strStageThrd = "______________________\n" +
                "||                   |\n" +
                "||                   |\n" +
                "||                    \n" +
                "||                   \n" +
                "||                   \n";
        //Final Stage-------------------------------------------------------------------
        strStageFinal = "______________________\n" +
                "||                   |\n" +
                "||                   |\n" +
                "||                 \\ O /\n" +
                "||                  | |\n" +
                "||                  / \\\n";
        //Final Stage-------------------------------------------------------------------
        strStageWon = "Sie haben gewonnen!\n" +
                "                       \n" +
                "                       \n" +
                "         \\ O /        \n" +
                "          | |         \n" +
                "          / \\         \n";

        String[] resultArray = {"_", "_", "_", "_", "_"};

    switch (randomWord){
        case 1 :
            word = "Pizza";
            break;
        case 2:
            word = "Katze";
            break;
        case 3:
            word = "Handy";
    }
    while (setStage != 4) {
        String guess = input.next();
            if (word.contains(guess)){
                int position = word.indexOf(guess);
                if (resultArray[position] == "_"){
                    resultArray[position] = guess;
                }
                System.out.println(Arrays.toString(resultArray));
            }
            else {
                System.out.println("False");
                setStage++;
            }

            int won = 0;
            if (!(Arrays.asList(resultArray).contains("_"))) {
                setStage = 5;
            }




            switch (setStage){
                case 1:
                    System.out.println(strStageFrst);
                    break;
                case 2:
                    System.out.println(strStageScnd);
                    break;
                case 3:
                    System.out.println(strStageThrd);
                    break;
                case 4 :
                    System.out.println(strStageFinal);
                    System.out.println("Sie haben verloren! Das Wort war: " + word);
                    break;
                case 5:
                    System.out.println(strStageWon);
                    System.out.println("Sie haben gewonnen! Das Wort war: " + word);
                    return;
            }
        }
    }
}