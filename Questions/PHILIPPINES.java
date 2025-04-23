package Questions;

import java.util.Scanner;
import gameModels.ArrayStruct;

public class PHILIPPINES extends QUESTIONS {
    public int questions(int key, int points) {  
        clearScreen();
        System.out.print("\n\n\t\t\t\t\t      " + key + " Points\n\n");
        System.out.print("\t=================================================================================");
            
        String q1_100 = "\n\n\t\t       What is the title of the Philippines National Anthem?";
        String q2_100 = "\n\n\t\t\t   What is the largest island in the Philippines?";
        String q3_100 = "\n\n\t\t\t      What is the capital of the Philippines?";
        String q1_200 = "\n\n\t\t  What is the last name of the 2nd president of the Philippines?";
        String q2_200 = "\n\n\t\t\t    What is the biggest mall in the Philippines?";
        String q3_200 = "\n\n\t\t\t  Who is the current president of the Philippines?";
        String q1_300 = "\n\n\t  Who was famous for being the author of Noli me Tangere and El Filibusterismo?";
        String q2_300 = "\n\n\t\t    What is the official/national language of the Philippines?";
        String q3_300 = "\n\n\t\t\tWhat is the smallest province in the Philippines?";
        String q1_400 = "\n\n\t\t\tWho is the great cripple in Philippine history?";
        String q2_400 = "\n\n\t\t\t\t Who designed the Philippine flag?";
        String q3_400 = "\n\n\t\t   What is considered as the world's most perfect cone volcano?";
        String q1_500 = "\n\n\t\t\t\t    Who named the Philippines?";
        String q2_500 = "\n\n\t\t\t How many islands are there in the Philippines?";
        String q3_500 = "\n\n\t\t\t      Who was the presidential spokeperson of \n\t\tPresident Rodrigo Duterte from 2017-2018 and from 2020-2021?";
            
        int[] box = {100, 200, 300, 400, 500};
        int size_box = box.length;
        String[] question = {q1_100, q2_100, q3_100, q1_200, q2_200,
                             q3_200, q1_300, q2_300, q3_300, q1_400,
                             q2_400, q3_400, q1_500, q2_500, q3_500
                            };
            
        String RANDOM_Q = super.Rand(box, size_box, question, key);
                    
        String answer;
        System.out.print("\n\n\tWhat is your answer: ");
        answer = sc.nextLine().toUpperCase();
                    
        if (RANDOM_Q == q1_100){   
            if (answer.equals("LUPANG HINIRANG")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 100 points.\n\n\n\t\t\t\t    ");
                points += 100;
            }
            else {
                System.out.print("\n\n\t\t\t       Wrong...Oof! It's actually [ LUPANG HINIRANG ]"+
                                 "\n\t\t\t\t\t  Minus 100 points.\n\n\n\t\t\t\t    ");
                   points -= 100;
            }
        }
        else if (RANDOM_Q == q2_100){   
            if (answer.equals("LUZON") || answer.equals("LUZON ISLAND") ||
                answer.equals("ISLAND OF LUZON")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 100 points.\n\n\n\t\t\t\t    ");
                points += 100;
            }
            else {
                System.out.print("\n\n\t\t  The answer is either [ LUZON || LUZON ISLAND || ISLAND OF LUZON ]"+
                                 "\n\t\t\t\t\t  Minus 100 points.\n\n\n\t\t\t\t    ");
                points -= 100;
            }
        }
        else if (RANDOM_Q == q3_100){   
            if (answer.equals("MANILA") || answer.equals("METRO MANILA")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 100 points.\n\n\n\t\t\t\t    ");
                points += 100;
            }
            else {
                System.out.print("\n\n\t\t\t     Incorrect...It should be [ MANILA || METRO MANILA ]"+
                                 "\n\t\t\t\t\t  Minus 100 points.\n\n\n\t\t\t\t    ");
                points -= 100;
            }
        }
        else if (RANDOM_Q == q1_200){   
            if (answer.equals("QUEZON")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 200 points.\n\n\n\t\t\t\t    ");
                points += 200;
            }
            else {
                System.out.print("\n\n\t\t\t\t   Wrong...HMMMMM. It should be [ QUEZON ]\n\t\t\t\t\t  Minus 200 points.\n\n\n\t\t\t\t    ");
                points -= 200;
            }
        }
        else if (RANDOM_Q == q2_200){   
            if (answer.equals("MOA") || answer.equals("MALL OF ASIA") || answer.equals("SM MALL OF ASIA") ||
                answer.equals("SM MOA")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 200 points.\n\n\n\t\t\t\t    ");
                points += 200;
            }
            else {
                System.out.print("\n\n\t       Incorrect... It's actually either [ MOA || MALL OF ASIA || SM MALL OF ASIA || SM MOA ]"+
                                 "\n\t\t\t\t\t  Minus 200 points.\n\n\n\t\t\t\t    ");
                points -= 200;
            }
        }
        else if (RANDOM_Q == q3_200){   
            if (answer.equals("BONGBONG MARCOS") || answer.equals("BONGBONG") || answer.equals("MARCOS") ||
                answer.equals("FERDINAND ROMALDUEZ MARCOS JR.") || answer.equals("FERDINAND MARCOS JR.") ||
                answer.equals("PRESIDENT BONGBONG MARCOS") || answer.equals("PRESIDENT FERDINAND ROMALDUEZ MARCOS JR.") ||
                answer.equals("PRESIDENT FERDINAND MARCOS JR.") || answer.equals("PRESIDENT BBM") ||
                answer.equals("BBM")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 200 points.\n\n\n\t\t\t\t    ");
                points += 200;
            }
            else {
                System.out.print("\n\n\t\t\t\t    Wrong...Good guess. But it's actually \n\t    [ BONGBONG MARCOS ||"+
                                 " FERDINAND ROMALDUEZ MARCOS JR. || FERDINAND MARCOS JR. \n\t    || PRESIDENT BONGBONG MARCOS ||"+
                                 " PRESIDENT FERDINAND ROMALDUEZ MARCOS JR. || \n\t   PRESIDENT FERDINAND MARCOS JR. || PRESIDENT BBM ||"+
                                 " BONGBONG || MARCOS || BBM ]\n\t\t\t\t\t  Minus 200 points.\n\n\n\t\t\t\t    ");
                points -= 200;
            }
        }
        else if (RANDOM_Q == q1_300){   
            if (answer.equals("JOSE RIZAL") || answer.equals("RIZAL")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 300 points.\n\n\n\t\t\t\t    ");
                points += 300;
            }
            else {
                System.out.print("\n\n\t\t      Incorrect...Not even close. The answer is either [ JOSE RIZAL || RIZAL ]"+
                                 "\n\t\t\t\t\t  Minus 300 points.\n\n\n\t\t\t\t    ");
                points -= 300;
            }
        }
        else if (RANDOM_Q == q2_300){   
            if (answer.equals("FILIPINO") || answer.equals("FILIPINO LANGUAGE")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 300 points.\n\n\n\t\t\t\t    ");
                points += 300;
            }
            else {
                System.out.print("\n\n\t\t    Wrong...Uhhhh...The answer is actually [ FILIPINO || FILIPINO_LANGUAGE ]"+
                                 "\n\t\t\t\t\t  Minus 300 points.\n\n\n\t\t\t\t    ");
                points -= 300;
            }
        }
        else if (RANDOM_Q == q3_300){   
            if (answer.equals("BATANES") || answer.equals("BATANES PROVINCE") || answer.equals("BATANES ISLAND")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 300 points.\n\n\n\t\t\t\t    ");
                points += 300;
            }
            else {
                System.out.print("\n\n\n\t\t\t\t\t     Incorrect!\n\t\t\tIt's [ BATANES || BATANES PROVINCE || BATANES ISLAND ]"+
                                 "\n\t\t\t\t\t  Minus 300 points.\n\n\n\t\t\t\t    ");
                points -= 300;
            }
        }
        else if (RANDOM_Q == q1_400){   
            if (answer.equals("APOLINARIO MABINI") || answer.equals("MABINI")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 400 points.\n\n\n\t\t\t\t    ");
                points += 400;
            }
            else {
                System.out.print("\n\n\n\t\t\t Oof...The answer is [ APOLINARIO MABINI || MABINI ]"+
                                 "\n\t\t\t\t\t  Minus 400 points.\n\n\n\t\t\t\t    ");
                points -= 400;
            }
        }
        else if (RANDOM_Q == q2_400){   
            if (answer.equals("EMILIO AGUINALDO" )|| answer.equals("AGUINALDO") ||
                answer.equals("PRESIDENT EMILIO AGUINALDO") || answer.equals("PRESIDENT AGUINALDO")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 400 points.\n\n\n\t\t\t\t    ");
                points += 400;
            }
            else {
                System.out.print("\n\n\n\t\t\t\t    Wrong...Good guess. But it's actually \n\t[ EMILIO AGUINALDO ||"+
                                 " PRESIDENT EMILIO AGUINALDO || AGUINALDO || PRESIDENT AGUINALDO ]"+
                                 "\n\t\t\t\t\t  Minus 400 points.\n\n\n\t\t\t\t    ");
                points -= 400;
            }
        }
        else if (RANDOM_Q == q3_400){   
            if (answer.equals("MAYON") || answer.equals("MAYON VOLCANO")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 400 points.\n\n\n\t\t\t\t    ");
                points += 400;
            }
            else {
                System.out.print("\n\n\n\t\t\t\t\t " + answer + " is not right.\n\t\t\t   Incorrect...It's actually either"+
                                 " [ MAYON || MAYON VOLCANO]\n\t\t\t\t\t  Minus 400 points.\n\n\n\t\t\t\t    ");
            }
        }
        else if (RANDOM_Q == q1_500){   
            if (answer.equals("KING PHILIP") || answer.equals("PRINCE PHILIP") ||
                answer.equals("KING PHILIP II") || answer.equals("PRINCE PHILIP II")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 500 points.\n\n\n\t\t\t\t    ");
                points += 500;
               }
            else {
                System.out.print("\n\n\n\t\t\t\t\t    Ahhh...no <3\n\t    It's [ KING PHILIP || PRINCE PHILIP ||"+
                                 " KING PHILIP II || PRINCE PHILIP II ]\n\t\t\t\t\t  Minus 500 points.\n\n\n\t\t\t\t    ");
                points -= 500;
            }
        }
        else if (RANDOM_Q == q2_500){   
            if (answer.equals("7641") || answer.equals("7,641") ||
                answer.equals("7641 ISLANDS") || answer.equals("7,641 ISLANDS")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 500 points.\n\n\n\t\t\t\t    ");
                points += 500;
            }
            else {
                System.out.print("\n\n\n\t    Wrong...Not even close. It's either [ 7641 || 7,641 || 7641 ISLANDS || 7,641 ISLANDS ]"+
                                 "\n\t\t\t\t\t  Minus 500 points.\n\n\n\t\t\t\t    ");
                points -= 500;
            }
        }
        else if (RANDOM_Q == q3_500){   
            if (answer.equals("HARRY ROQUE") || answer.equals("HERMINIO HARRY LOPEZ ROQUE JR.") ||
                answer.equals("HERMINIO LOPEZ ROQUE JR.") || answer.equals("HARRY LOPEZ ROQUE JR.")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 500 points.\n\n\n\t\t\t\t    ");
                points += 500;
               }
            else {
                System.out.print("\n\n\n\t\t\t\t " + answer + " is not right... It's actually "+
                                 "\n\t\t\t  [ HARRY ROQUE || HERMINIO HARRY LOPEZ ROQUE JR. \n\t\t      "+
                                 "|| HERMINIO LOPEZ ROQUE JR. || HARRY LOPEZ ROQUE JR. ]\n\t\t\t\t\t  Minus 500 points.\n\n\n\t\t\t\t    ");
                points -= 500;
            }
        }
        return points;
    }

    //clear screen
    static void clearScreen(){
        System.out.print("\033[H\033[2J");
    }

    static Scanner sc = new Scanner(System.in);
    static ArrayStruct obj = new ArrayStruct();
}
