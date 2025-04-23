package Questions;

import java.util.Scanner;
import gameModels.ArrayStruct;

public class GEN_KNOWLEDGE extends QUESTIONS {

    public int questions(int key, int points) {
        clearScreen();
        System.out.print("\n\n\t\t\t\t\t      " + key + " Points\n\n");
        System.out.print("\t=================================================================================");
            
        String q1_100 = "\n\n\t\t\t  What is the most used language in the world?";
        String q2_100 = "\n\n\t\t\t         What shape are Dorito Chips?";
        String q3_100 = "\n\n\t\t\t       Which fruit is made to make wine?";
        String q1_200 = "\n\n\t\t\tWhat is the 4th color of the rainbow from the top?";
        String q2_200 = "\n\n\t\t\t        Who is the Alter Ego of Batman?";
        String q3_200 = "\n\n\t\t\t     Which sport is Tiger Woods known for?";
        String q1_300 = "\n\n\t\t\t        Pyrophobia is the fear of what?";
        String q2_300 = "\n\n\t\t\t        Spiders are not bugs they are?";
        String q3_300 = "\n\n\t\t\t  Who was the first President of United States?";
        String q1_400 = "\n\n\t\t\t        Who is Donald Duck's girlfriend?";
        String q2_400 = "\n\n\t\t\t            Who is Beyonce's Husband?";
        String q3_400 = "\n\n\t\t\t  Which Planet is the hottest in our Solar System?";
        String q1_500 = "\n\n\t\t\tMy Heart Will Go On was the feature song of which movie?";
        String q2_500 = "\n\n\t\t\tWhat do they call the oldest female elephant in a herd?";
        String q3_500 = "\n\n\t\t\tPoker Face and Bad Romance are songs from which singer?";
            
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
            if (answer.equals("ENGLISH") || answer.equals("ENGLISH LANGUAGE")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 100 points.\n\n\n\t\t\t\t    ");
                points += 100;
            }
            else {
                System.out.print("\n\n\t\t\tIncorrect...Oof! It's actually either [ ENGLISH || ENGLISH LANGUAGE ]" + 
                                 "\n\t\t\t\t\t  Minus 100 points.\n\n\n\t\t\t\t    ");
                points -= 100;
            }
        }
        else if (RANDOM_Q == q2_100){   
            if (answer.equals("TRIANGLE") || answer.equals("TRIANGULAR") ||
                answer.equals("TRIANGLE SHAPE") || answer.equals("TRIANGULAR SHAPE")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 100 points.\n\n\n\t\t\t\t    ");
                points += 100;
            }
            else {
                System.out.print("\n\n\tWrong...The answer is either [ TRIANGLE || TRIANGULAR || TRIANGLE SHAPE || TRIANGULAR SHAPE ]" + 
                                 "\n\t\t\t\t\t  Minus 100 points.\n\n\n\t\t\t\t    ");
                points -= 100;
            }
        }
        else if (RANDOM_Q == q3_100){   
            if (answer.equals("GRAPE") || answer.equals("GRAPES")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 100 points.\n\n\n\t\t\t\t    ");
                points += 100;
            }
            else {
                System.out.print("\n\n\t\t\t\tIncorrect...It is [ GRAPE || GRAPES ]\n\t\t\t\t\t  Minus 100 points.\n\n\n\t\t\t\t    ");
                points -= 100;
            }
        }
        else if (RANDOM_Q == q1_200){   
            if (answer.equals("GREEN") || answer.equals("COLOR GREEN")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 200 points.\n\n\n\t\t\t\t    ");
                points += 200;
            }
            else {
                System.out.print("\n\n\t\t\t  Wrong...HMMMMM. It should be [ GREEN || COLOR GREEN ]"+
                                 "\n\t\t\t\t\t  Minus 200 points.\n\n\n\t\t\t\t    ");
                points -= 200;
            }
        }
        else if (RANDOM_Q == q2_200){   
            if (answer.equals("BRUCE WAYNE") || answer.equals("MR. WAYNE") || answer.equals("MISTER WAYNE")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 200 points.\n\n\n\t\t\t\t    ");
                points += 200;
            }
            else {
                System.out.print("\n\n\t\t It's actually either [ BRUCE WAYNE || MR. WAYNE || MISTER WAYNE ]"+
                                 "\n\t\t\t\t\t  Minus 200 points.\n\n\n\t\t\t\t    ");
                points -= 200;
            }
        }
        else if (RANDOM_Q == q3_200){   
            if (answer.equals("GOLF") || answer.equals("GOLF SPORT")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 200 points.\n\n\n\t\t\t\t    ");
                points += 200;
            }
            else {
                System.out.print("\n\n\t\t\t  Incorrect...Good guess. But it's actually [ GOLF || GOLF SPORT ]"+
                                 "\n\t\t\t\t\t  Minus 200 points.\n\n\n\t\t\t\t    ");
                points -= 200;
            }
        }
        else if (RANDOM_Q == q1_300){   
            if (answer.equals("FIRE") || answer.equals("FLAMES") || answer.equals("FIRES")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 300 points.\n\n\n\t\t\t\t    ");
                points += 300;
            }
            else {
                System.out.print("\n\n\t\t\t  Wrong...Not even close. The answer is either [ FIRE || FIRES || FLAMES ]"+
                                 "\n\t\t\t\t\t  Minus 300 points.\n\n\n\t\t\t\t    ");
                points -= 300;
            }
        }
        else if (RANDOM_Q == q2_300){   
            if (answer.equals("ARACHNIDS") || answer.equals("ARACHNID")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 300 points.\n\n\n\t\t\t\t    ");
                 points += 300;
            }
            else {
                System.out.print("\n\n\t\tIncorrect...Uhhhh...The answer is actually [ ARACHNID || ARACHNIDS ]"+
                                 "\n\t\t\t\t\t  Minus 300 points.\n\n\n\t\t\t\t    ");
                points -= 300;
            }
        }
        else if (RANDOM_Q == q3_300){   
            if (answer.equals("GEORGE WASHINGTON") || answer.equals("PRESIDENT GEORGE WASHINGTON") ||
                answer.equals("WASHINGTON") || answer.equals("PRESIDENT WASHINGTON")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 300 points.\n\n\n\t\t\t\t    ");
                points += 300;
            }
            else {
                System.out.print("\n\n\n\t\t\t\t\t     Wrong!\n\tIt's [ GEORGE WASHINGTON || WASHINGTON || PRESIDENT GEORGE WASHINGTON ||"+
                                 "PRESIDENT WASHINGTON ]\n\t\t\t\t\t  Minus 300 points.\n\n\n\t\t\t\t    ");
                points -= 300;
                }
        }
        else if (RANDOM_Q == q1_400){   
            if (answer.equals("DAISY") || answer.equals("DAISY DUCK") || answer.equals("DAISY THE DUCK")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 400 points.\n\n\n\t\t\t\t    ");
                points += 400;
            }
                else {
                System.out.print("\n\n\n\t\t     Incorrect...Oof...The answer is [ DAISY || DAISY DUCK || DAISY THE DUCK ]"+
                                 "\n\t\t\t\t\t  Minus 400 points.\n\n\n\t\t\t\t    ");
                points -= 400;
            }
        }
        else if (RANDOM_Q == q2_400){   
            if (answer.equals("JAY-Z") || answer.equals("JAY Z") || answer.equals("SHAWN CARTER") ||
                answer.equals("SHAWN COREY CARTER") || answer.equals("COREY CARTER")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 400 points.\n\n\n\t\t\t\t    ");
                points += 400;
            }
            else {
                System.out.print("\n\n\n\t\t\t\t\t     Wrong...Good guess.\n\tBut it's actually [ JAY-Z || JAY Z || SHAWN CARTER || "+
                                 "SHAWN COREY CARTER || COREY CARTER ]\n\t\t\t\t\t  Minus 400 points.\n\n\n\t\t\t\t    ");
                points -= 400;
            }
        }
        else if (RANDOM_Q == q3_400){   
            if (answer.equals("VENUS") || answer.equals("PLANET VENUS") || answer.equals("VENUS PLANET")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 400 points.\n\n\n\t\t\t\t    ");
                points += 400;
            }
            else {
                System.out.print("\n\n\n\t\t\t\t\t " + answer + " is not right.\n\t\t    Incorrect...It's actually either [ VENUS || "+
                                 "PLANET VENUS || VENUS PLANET ]\n\t\t\t\t\t  Minus 400 points.\n\n\n\t\t\t\t    ");
                points -= 400;
            }
        }
        else if (RANDOM_Q == q1_500){   
            if (answer.equals("TITANIC") || answer.equals("THE TITANIC") || answer.equals("TITANIC MOVIE") ||
                answer.equals("THE TITANIC MOVIE")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 500 points.\n\n\n\t\t\t\t    ");
                points += 500;
            }
            else {
                System.out.print("\n\n\n\t\t\t\t\t    Wrong...\n\t\tIt's [ TITANIC || THE TITANIC || TITANIC MOVIE || THE TITANIC MOVIE ]"+
                                 "\n\t\t\t\t\t  Minus 500 points.\n\n\n\t\t\t\t    ");
                points -= 500;
            }
        }
        else if (RANDOM_Q == q2_500){   
            if (answer.equals("COW") || answer.equals("COWS")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 500 points.\n\n\n\t\t\t\t    ");
                points += 500;
            }
            else {
                System.out.print("\n\n\n\t\t\t     Incorrect...Not even close. It's either [ COW || COWs ]"+
                                 "\n\t\t\t\t\t  Minus 500 points.\n\n\n\t\t\t\t    ");
                points -= 500;
            }
        }
        else if (RANDOM_Q == q3_500){   
            if (answer.equals("LADY GAGA")){
                System.out.print("\n\n\n\t\t\t\t\t      Correct!\n\t\t\t\t        You earned 500 points.\n\n\n\t\t\t\t    ");
                points += 500;
            }
            else {
                System.out.print("\n\n\n\t\t\t  " + answer + " is not right. It's actually [ LADY GAGA ]"+
                                 "\n\t\t\t\t\t  Minus 500 points.\n\n\n\t\t\t\t    ");
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
