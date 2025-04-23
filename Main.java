import java.util.Scanner;
import java.util.ArrayList;

import Questions.GEN_KNOWLEDGE;
import Questions.PHILIPPINES;
import Questions.QUESTIONS;
import gameModels.Game;

public class Main {
    public static void main(String[] args){
        clearScreen();

        int size_box1 = getBox(box1);
        int size_box2 = getBox(box2);

        gamestart();
        gameplay(box1, box2, size_box1, size_box2, points);

        //player's choice to play again or exit the program
        while(true){
            size_box1 = setBox(box1);
            size_box2 = setBox(box2);
            
            String again;
            clearScreen();
            System.out.print("\n\n\n\n\t=====================================================================================");
            System.out.print("\n\n\t\t\t\t       Want to play again? (Y / N)\n\t\t\t\t\t\t   ");
            again = sc.nextLine();
            String choose = again.toUpperCase();
            
            //if yes, call gameplay() function and then repeat the whole process
            if(choose.equals("Y")){
                points = 0;
                playing = true;
                gameplay(box1, box2, size_box1, size_box2, points);
            }
            
            //if no, exit the program
            else if(choose.equals("N")){
                System.out.print("\n\n\t\t\t\t\t   Thank you for playing\n\t\t\t\t");
                PAUSE();
                clearScreen();
                break;
            }
            else{
                System.out.print("\n\n\n\t\tError! Input must be either Y or N\n\t\t");
                PAUSE();
            }
        }
        sc.close();
    }

    static void gamestart(){
        System.out.print("\n\n\t=====================================================================================");
        System.out.print("\n\t\t\t\t\t       Welcome to \n\t\t\t\t    DEAL OR NO DEAL: TRIVIA EDITION\n");
        System.out.print("\t=====================================================================================");
        System.out.print("\n\n\t\t\t\t\t       DIRECTIONS\n\t\t\t\t\t      [must read]\n\n");
        System.out.print("\t* The goal of our game is to get as many points as possible. \n\n");
        System.out.print("\t* In order to get points, you must first pick a category, and in each category you \n");
        System.out.print("\t  will see 5 boxes. \n\n");
        System.out.print("\t* Each box contains a certain number of points. To get those points, you first need \n");
        System.out.print("\t  to answer a certain question correctly. Get it wrong, and the points from \n");
        System.out.print("\t  your selected box will be deducted from your score. \n\n");
        System.out.print("\t* [REMEMBER: ALWAYS CHECK YOUR SPELLING.] \n\n");
        System.out.print("\t* After each question, you will be given a chance to end the game with your current \n");
        System.out.print("\t  points, or keep on playing. \n\n");
        System.out.print("\t* Good luck, player. And have fun...\n\n");

        System.out.print("\n\t\t\t\t\t     START GAME");
        PAUSE();
    }

    //function for choosing a category between gen. knowledge and philippines
    static void gameplay(ArrayList <Integer> _box1, ArrayList <Integer> _box2, int _size_box1, int _size_box2, int _points){
        while(playing){
            clearScreen();
            String choice;
            System.out.print("\n\n\t---------------------------------------------------------------------------------");
            System.out.print("\n\t\t\t\t\t(1) General Knowledge\n\t\t\t\t\t(2) Philippines\n");
            System.out.print("\t---------------------------------------------------------------------------------");
            System.out.print("\n\n\tChoose a category: ");

            choice = sc.nextLine();
                
            Game status = new Game();
            if (choice.equals("1")) {
                QUESTIONS category = new GEN_KNOWLEDGE();

                if(_size_box1 == 0){
                    clearScreen();
                    System.out.print("\n\n\t---------------------------------------------------------------------------------");
                    System.out.print("\n\n\n\n\t\t\t\t   There are no more questions for\n");
                    System.out.print("\t\t\t\t\t  GENERAL KNOWLEDGE\n\n\n\n");
                    System.out.print("\t---------------------------------------------------------------------------------\n\n\n\t\t\t\t    ");
                    PAUSE();
                }
                else{
                    value = category.boxMenu(_box1, _size_box1, _points);
                    _size_box1 = value.get(0);
                    _points = value.get(1);

                    playing = status.box_checker(_size_box1, _size_box2, playing, _points);
                }
            }
                    
            else if (choice.equals("2")) {
                QUESTIONS category = new PHILIPPINES();

                if(_size_box2 == 0){
                    clearScreen();
                    System.out.print("\n\n\t---------------------------------------------------------------------------------");
                    System.out.print("\n\n\n\n\t\t\t\t   There are no more questions for\n");
                    System.out.print("\t\t\t\t\t     PHILIPPINES\n\n\n\n");
                    System.out.print("\t---------------------------------------------------------------------------------\n\n\n\t\t\t\t    ");
                    PAUSE();
                }
                else{
                    value = category.boxMenu(_box2, _size_box2, _points);
                    _size_box2 = value.get(0);
                    _points = value.get(1);

                    playing = status.box_checker(_size_box1, _size_box2, playing, _points);
                }
            }	
                
            else {
                System.out.print("\n\n\tError! Invalid Input\n\t");
                PAUSE();
            }
        }
    }

    private static int getBox(ArrayList <Integer> box){
        for(int i = 0; i < boxValue.length; i++){
            box.add(boxValue[i]);
        }
        return box.size();
    }

    private static int setBox(ArrayList <Integer> box){
        for(int i = 0; i < boxValue.length; i++){
            box.set(i, boxValue[i]);
        }
        return box.size();
    }

    
    //clear screen
    static void clearScreen(){
        System.out.print("\033[H\033[2J");
    }

    //system PAUSE
    static void PAUSE(){
        System.out.print("\n\t\t\t\t       Press ENTER To Continue...\n\t\t\t\t\t\t   ");
        sc.nextLine();
    }

    private static Scanner sc = new Scanner(System.in);
    public static int points;
    public static boolean playing = true;
    protected static int[] boxValue = {100, 200, 300, 400, 500};   //array for gen. knowledge
    private static ArrayList <Integer> box1 = new ArrayList <Integer> ();
    private static ArrayList <Integer> box2 = new ArrayList <Integer> ();
    //private static int size_box1 = box1.size();
    //private static int size_box2 = box2.size();
    static ArrayList <Integer> value = new ArrayList <Integer> ();
}
